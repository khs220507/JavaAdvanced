package JavaAdvanced.InterfaceEx.lamda;

import java.util.function.Consumer;

public class ConsumerSubmit {
	
	public static void main(String[] args) {
		
		Consumer<Integer > c = money -> {
			int 소고기 = 15000;
			int 야채 = 5000;
			int 버너 = 5000;
			
			int balance = money - 소고기 - 야채 - 버너;
			System.out.println("장 보고 난 잔액은 " + balance + " 입니다.");
			
		};
		c.accept(30000);
	 
	}
}
