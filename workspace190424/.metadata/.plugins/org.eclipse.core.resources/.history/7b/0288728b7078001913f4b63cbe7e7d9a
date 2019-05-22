package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;
import vo.BookVO;

public class Test08_select_map {
	public static void main(String[] args) {
		
		String sql ="select * from book"; 
		
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		List<BookVO> books = new ArrayList<BookVO>();
		Map<Integer, BookVO> map = new HashMap<Integer, BookVO>();
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			//? 세팅작업 
			//실행
			rs  = ps.executeQuery();
			//결과값핸들링
			while(rs.next()) {
				BookVO book = new BookVO();
				book.setPrice(rs.getInt("price"));
				book.setAuthor(rs.getString("author"));
				book.setBookno(rs.getInt("bookno"));
				book.setTitle(rs.getString("title"));
				book.setPubdate(rs.getDate("pubdate").toString());
				//System.out.println(book);
				books.add(book);
				map.put(book.getBookno(), book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		System.out.println("Book List");
		for( BookVO d:books) {
			System.out.println(d);
		}
		System.out.println("=======================");
		map.forEach((k,v)->System.out.println(v));
	}
}






