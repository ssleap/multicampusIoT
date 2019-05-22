package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import dao.BookDao;
import util.JDBCUtil;
import vo.BookVo;

public class BookServiceImpl implements BookService{

	private BookDao dao = null;
	
	@Override
	public List<BookVo> bookList() {
		
		dao = new BookDao();
		return dao.bookList();
	}

	public BookServiceImpl() {
		super();
	}

	public BookServiceImpl(BookDao dao) {
		super();
		this.dao = dao;
	}

	public BookDao getDao() {
		return dao;
	}

	public void setDao(BookDao dao) {
		this.dao = dao;
	}


	@Override
	public int addBook() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addBook(BookVo vo) throws Exception {
		Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String sql=
        		"insert into book(bookno, title, author, price)"
        		+ "values(select nvl(max(bookno), 0 ) + 1 from book), ?,?,?)";

        try {
		   con = JDBCUtil.getConnection();
		   ps = con.prepareStatement(sql);
		   ps.setInt(1, vo.getBookno());
		   ps.setString(2, vo.getTitle());
		   ps.setString(3, vo.getAuthor());
		   
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
