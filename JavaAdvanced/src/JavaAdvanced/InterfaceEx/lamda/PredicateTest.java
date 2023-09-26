package JavaAdvanced.InterfaceEx.lamda;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> p1 = (num)->{
			if(num%2==0) 
				return true;
			else
				return false;
		};
		
		boolean result = p1.test(2);
		System.out.println(result);
		
		Predicate<String> p2 = (str) -> {
			if(str.equalsIgnoreCase("STOP")) {
				return true;
			} else
				return false;
		};
		boolean result2 = p2.test("stop");
		System.out.println(result2);
		
		Predicate<Integer> p3 = new Predicate<>() {

			@Override
			public boolean test(Integer t) {
				if(t>19) {
					return true;
				}
				return false;
			}
			
			
		};
		boolean result3 = p3.test(20);
		System.out.println(result3);
	}
}