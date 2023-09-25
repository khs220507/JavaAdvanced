package JavaAdvanced.InterfaceEx.generic;

public class GListTest {
	
	public static void main(String[] args) {
		
		
		GList<Score> list = new GList<>();
		list.add(new Score("이정훈", 100, 90));
		list.add(new Score("이윤정", 100, 90));
		
		for(int i=0; i<list.size(); i++) {
			Score s = list.get(i);
			System.out.println(s);
			System.out.println(s.getEng());
		}
	}

}
