package JavaAdvanced.InterfaceEx.lamda;

interface StarInterface{
	void printStar(int n);
}

public class StarInterfaceEx {
	public static void main(String[] args) {
		
		// 01.
		class StarInterfaceImp implements StarInterface{

			@Override
			public void printStar(int n) {
				for(int i=0; i<n; i++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		}
		
		StarInterfaceImp s1 = new StarInterfaceImp();
		s1.printStar(10);
		
		// 02.
		StarInterface s2 = new StarInterface() {
			
			@Override
			public void printStar(int n) {
				for(int i=0; i<n; i++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		};
		s2.printStar(10);
		
		StarInterface s3 = (n) -> { 
			for(int i =0; i<n; i++) {
				System.out.print("*");
			}
		};
		
		s3.printStar(10);
	}
	
	
	
}
