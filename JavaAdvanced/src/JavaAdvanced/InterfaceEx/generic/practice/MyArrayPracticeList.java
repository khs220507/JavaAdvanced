package JavaAdvanced.InterfaceEx.generic.practice;

public class MyArrayPracticeList {
	private Object[] nums;
	private int current;

	public MyArrayPracticeList() {
		nums = new Object[5];
		current = 0;
	}

	public void add(Object obj) {
		nums[current] = obj;
		current++;
	}

	public Object get(int index) {
		return nums[index];
	}

	public int size() {
		return current;
	}

	public void clear() {
		current = 0;
	}


	public void forEach(MyBook myBook) {
		for (int i = 0; i < current; i++) {
			myBook.accept(get(i));
		}
	}
}