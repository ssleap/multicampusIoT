package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.util.List;

import dao.BookDao;
import service.BookService;
import service.BookServiceImpl;
import vo.BookVo;

public class GUIBook {
	
	BookDao  dao = new BookDao();
	BookService service = new BookServiceImpl(dao);
	
	Frame f = null;
	TextArea ta = null;
	TextField title, price, author;
	Button list, insert;
	
	public GUIBook() {
		
		f = new Frame("BOOK APP");
		ta = new TextArea(20, 20);
		list = new Button("LIST");
		insert = new Button("InSERT");
		Panel p = new Panel(); 
		
		p.add(list);
		p.add(insert);
		f.add(ta, BorderLayout.NORTH);
		f.add(p, BorderLayout.CENTER);
		
		f.setSize(400, 400);
		f.setVisible(true);
		
		list.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				List<BookVo> data = service.bookList();
				data.forEach(i -> ta.append(i.toString() + "\n"));
				
			}
		});
		
		
	}

	public static void main(String[] args) {
		
		new GUIBook();
		
	}

}
