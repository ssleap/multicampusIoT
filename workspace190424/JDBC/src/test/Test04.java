package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;
import vo.BookVo;

public class Test04 {
	
	public static void main(String[] args) {
		
		System.out.println(" JDBC Test");
		String sql = "select * from book";
		
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="scott";
		String pw="TIGER";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int row = 0;
		List<BookVo> books = new ArrayList<BookVo>();
		Map<Integer, BookVo> map = new HashMap<Integer, BookVo>();
		
		
		
		try {
			Class.forName(driver); //1. 드라이버 로딩
	        con = JDBCUtil.getConnection(); //2.연결
            st = con.createStatement(); //3.sql 관리 객체 Statement 생성
            rs = st.executeQuery(sql);  //4.sql 구문 실행
            
            //4.결과값 처리
            while(rs.next()) {   
//            	System.out.print(rs.getString("deptno")+"   ");
//            	System.out.print(rs.getString("dname")+"   ");
//            	System.out.print(rs.getString("loc")+"   ");
//            	System.out.println();
            	BookVo book = new BookVo();
            	book.setPrice(rs.getInt("price"));
            	book.setAuthor(rs.getString("author"));
            	book.setBookno(rs.getInt("bookno"));
            	book.setTitle(rs.getString("title"));
            	book.setPubdate(rs.getDate("pubdate").toString());
            	books.add(book);
            	map.put(book.getBookno(), book);
            	//System.out.println(book);
            	
            }
		}catch (ClassNotFoundException e) {
            System.out.println("jdbc driver 확인 요.");
		}catch (Exception e) {
            System.out.println(e.getMessage());
		}finally {
			
			JDBCUtil.close(con, st, rs);
			
			books.forEach(i -> System.out.println(i));
			
			map.forEach((k,v)->System.out.println(v));
			
		}
        System.out.println("**  end  **");
		
	}

}
