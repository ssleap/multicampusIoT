package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.BookVo;

public class BookDao {

	//select * from book;
	
	public List<BookVo> bookList(){
		
		List<BookVo> list = new ArrayList<BookVo>();
		String sql = "select * from book";
		
		Connection con = null;
		
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		
		try {
			
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				
				BookVo book = new BookVo();
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getInt("price"));
				book.setAuthor(rs.getString("author"));
				book.setBookno(rs.getInt("bookno"));
				book.setPubdate(rs.getDate("pubdate").toString());
				list.add(book);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			JDBCUtil.close(con, ps, rs);
			
		}
		
		return list;
		
	}
	
	public int addBook(BookVo vo) {
		
		Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String sql=
        		"insert into book(bookno, title, author, price)"
        		+ "values(select nvl(max(bookno), 0 ) + 1 from book), ?,?,?)";

        try {
		   con = JDBCUtil.getConnection();
		   ps = con.prepareStatement(sql);
		   ps.setString(1, vo.getTitle());
		   ps.setString(2, vo.getAuthor());
		   ps.setInt(3, vo.getPrice());
		   ps.setInt(4, vo.getBookno());
		   rs = ps.executeQuery();
		   
		   while(rs.next()) {
			   System.out.print(rs.getString(1)+"  ");
			   System.out.print(rs.getString(2)+"  ");
			   System.out.print(rs.getString(3)+"  ");
			   System.out.println();
		   }
		   
		} catch (Exception e) {
              e.printStackTrace(); 
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		return 0;
		
		
	}
	
}
