package JavaAdvanced.InterfaceEx.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class BookTest {
	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("웃긴책0",1000));
		list.add(new Book("웃긴책1",3000));
		list.add(new Book("웃긴책2",4000));
		
		Stream<Book> stream = list.stream();
		stream.filter(book -> book.getPrice()>=2000).forEach(item -> System.out.println(item.getName()));
		
		System.out.println("정렬==>");
		stream = list.stream();
		stream.sorted((o1,o2)->o1.getPrice()-o2.getPrice()).forEach(item -> System.out.println(item.getName()));
			
	}
}
