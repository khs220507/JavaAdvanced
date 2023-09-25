package JavaAdvanced.InterfaceEx.generic.practice;

public class PracticeTest {
	public static void main(String[] args) {
		MyArrayPracticeList list = new MyArrayPracticeList();
		list.add("스토너");
		list.add("삼국지");
		list.add("손자병법");

		list.forEach(new MyBook() {

			@Override
			public void accept(Object o) {
				System.out.println(o);
			}
		});
	}

}
