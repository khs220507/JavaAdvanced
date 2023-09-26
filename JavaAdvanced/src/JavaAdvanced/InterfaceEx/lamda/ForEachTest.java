package JavaAdvanced.InterfaceEx.lamda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("김현수0");
		list.add("김현수1");
		list.add("김현수2");
		list.add("김현수3");
		list.add("김현수4");
		list.add("김현수5");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("----");

		for (String name : list) {
			System.out.println(name);
		}

		// 인터페이스를 구현하는 방법
		// 1. 이름있는 클래스작성
		// 2. 익명클래스
		// 3. 람다식
		// functional interface (한 개의 추상매서드만을 가지는 인터페이스)

		// 1.
		class A implements Consumer<String> {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		}
		System.out.println("----forEach1----");
		list.forEach(new A());
		
		// 2.
		System.out.println("----forEach2----");
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		// 3.
		System.out.println("----forEach3----");
		list.forEach(item -> System.out.println(item));

	}

}