package JavaAdvanced.InterfaceEx.generic;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Score> list = new ArrayList<>();
		list.add(new Score("이윤", 99,100));
		list.add(new Score("예진", 100,98));
	}
}
