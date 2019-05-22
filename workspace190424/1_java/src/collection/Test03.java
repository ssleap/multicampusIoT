package collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test03 {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		s.add("hello");
		s.add("hello");
		s.add("hello");
		s.add("hello");
		s.add("hello");
		System.out.println(s);
		s.add("hello2");
		s.add("hello3");
		s.add("hello4");
		s.add("hello5");
		s.add("hello6");
		System.out.println(s);
		
		Set<String> treeset = new TreeSet<String>();
		treeset.add("hello1");
		treeset.add("hello2");
		treeset.add("hello3");
		treeset.add("hello4");
		treeset.add("hello5");
		System.out.println(treeset);
		
		Set<Book> set = new HashSet<Book>();
		set.add(new Book("해리포터", 30000));
		set.add(new Book("반지의제왕", 70000));
		set.add(new Book("어벤저스", 60000));
		set.add(new Book("해리포터", 30000));
		set.add(new Book("수학의정석", 20000));
		
		System.out.println(set);
		
		for(Book b : set) {
			System.out.println(b);
		}
		
		Iterator<Book> it = set.iterator();
		System.out.println(it);
		System.out.println(it.next());
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if(book.getTitle() == "해리포터")it.remove();
			
		}
		
		System.out.println(set);
		
//		for(int i = 0; i < set.size(); i++) {
//			set[i];
//		}
		
	}
	
}
