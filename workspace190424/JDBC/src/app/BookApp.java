package app;

import java.util.List;

import dao.BookDao;
import service.BookService;
import service.BookServiceImpl;

import vo.BookVo;

public class BookApp {
	public static void main(String[] args) {
		
		BookDao dao = new BookDao();
		BookService service = new BookServiceImpl(dao);
		
		BookVo user = new BookVo("spring", "hong", 1200000);
		try {
			
		} catch (Exception e) {
			System.out.println("등록 데이터 확인 필요");
		}
		
		if(service != null) {
           List<BookVo> list =  service.bookList();
           list.forEach(i->System.out.println(i));
		}
        
	}
}
