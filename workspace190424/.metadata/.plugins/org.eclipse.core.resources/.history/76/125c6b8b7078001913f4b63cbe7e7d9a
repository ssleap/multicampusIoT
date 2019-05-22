package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(" JDBC Test");
		String sql = "select * from dept";
		
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="scott";
		String pw="TIGER";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver); //1. 드라이버 로딩
	        con = DriverManager.getConnection(url,user,pw); //2.연결
            st = con.createStatement(); //3.sql 관리 객체 Statement 생성
            rs = st.executeQuery(sql);  //4.sql 구문 실행
            
            //4.결과값 처리
            while(rs.next()) {   
            	System.out.print(rs.getString("deptno")+"   ");
            	System.out.print(rs.getString("dname")+"   ");
            	System.out.print(rs.getString("loc")+"   ");
            	System.out.println();
            }
		}catch (ClassNotFoundException e) {
            System.out.println("jdbc driver 확인 요.");
		}catch (Exception e) {
            System.out.println(e.getMessage());
		}finally {
			
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
        System.out.println("**  end  **");
	}
}
