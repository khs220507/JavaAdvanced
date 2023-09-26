package JavaAdvanced.InterfaceEx.test02;

public class Test {
	
	public static void main(String[] args) {
		
		FoodBox<Food> box = new FoodBox<>();
		
		box.add(new Pasta("까르보나라", 10000));
		box.add(new Rice("볶음밥", 7000));
		box.add(new Pizza("콤비네이션", 5000));
		
		System.out.println(box.get(0).getName());
		System.out.println(box.get(1).getName());
		System.out.println(box.get(2).getName());
		
		
	}

}
