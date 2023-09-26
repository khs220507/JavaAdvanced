package JavaAdvanced.InterfaceEx.lamda;

import java.util.function.Predicate;

public class PredicateSubmit {
	public static void main(String[] args) {
		Predicate<String> p = (str) -> {
			
			if(str.equalsIgnoreCase("샤브샤브")) {
				return true;
			} else {
				return false;
			}

		};
		
		boolean result = p.test("샤브샤브");
		System.out.println(result);
	}
	
	
}
