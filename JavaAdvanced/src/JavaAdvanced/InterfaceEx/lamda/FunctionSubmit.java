package JavaAdvanced.InterfaceEx.lamda;

import java.util.function.Function;

public class FunctionSubmit {
	public static void main(String[] args) {
		Function<Integer, Integer> f = num -> {
			int sum = 0;
			for(int i=2; i<=num; i++) {
				for(int j=1; j<10; j++) {
					System.out.println(i + "X"+ j + "=" + i*j);
					sum += i*j;
				}
			}
			return sum;
			
		};
		
		int result = f.apply(6);
		System.out.println("위 값들의 총 합은 " + result + " 입니다.");
		
	}
}
