package JavaAdvanced.InterfaceEx.lamda;

import java.util.ArrayList;

public class RunnableSubmit {
	
	public static void main(String[] args) {
		
		ArrayList<String> list  = new ArrayList<>();
		list.add("여행");
		list.add("이사");
		list.add("행복");
		
		Runnable r = () -> {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		};
		r.run();
	}
}
