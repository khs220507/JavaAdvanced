package JavaAdvanced.InterfaceEx.lamda;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		
		Supplier<Integer> s1 = () -> (int)(Math.random()*5);
		int result = s1.get();
		System.out.println(result);
		
		Supplier<String> s2 = () -> {
			int randomNumber = (int)(Math.random()*2);
			if(randomNumber == 0) {
				return "좋다 ";
			} else {
				return "더 좋다";
			}
		};
		
		String result2 = s2.get();
		System.out.println(result2);
		
		
		Supplier<Integer> s3 = new Supplier<Integer>() {
			
			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return (int)(Math.random()*5);
			}
		};
		int result3 = s3.get();
		System.out.println(result3);
	}
	
	
}
