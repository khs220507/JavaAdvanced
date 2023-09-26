package JavaAdvanced.InterfaceEx.lamda.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.Comparator;

public class MovingList {

	public static void main(String[] args) {
		ArrayList<Moving> list = new ArrayList<>();
		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 90));
		list.add(new Moving("김두식", "문산", 70));
		list.add(new Moving("전영석", "봉평", 88));
		System.out.println("====>");
		Collections.sort(list);
		list.forEach(m -> System.out.println(m));

		System.out.println("====>");
		list.forEach(new Consumer<>() {
			@Override
			public void accept(Moving t) {
				System.out.println(t);
			}});
		
	
		class ConsumerImp implements Consumer<Moving>{
			@Override
			public void accept(Moving t) {
				System.out.println(t);
			}
		}
		
		System.out.println("====>");
		list.forEach(new ConsumerImp());
		
		// 코드순 정렬
		System.out.println("====>");
	
		 Collections.sort(list,  new Comparator<Moving>(){

			@Override
			public int compare(Moving o1, Moving o2) {
				return o1.code.compareTo(o2.code);
			}});
		 
		 for(Moving m : list) {
			 System.out.println(m);
		 }
			 
		 
		

	

	}
}
