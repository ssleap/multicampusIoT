package service;

import java.util.List;
import vo.BookVo;
public interface BookService {
	
	List<BookVo> bookList();
	int addBook() throws Exception;
	int addBook(BookVo vo) throws Exception;

}
