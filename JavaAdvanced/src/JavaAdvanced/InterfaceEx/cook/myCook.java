package JavaAdvanced.InterfaceEx.cook;

import java.util.ArrayList;

public class myCook extends Cook implements 양식가능한{
	
	
	public myCook() {
		// TODO Auto-generated constructor stub
	}
	public myCook(String name) {
		super(name);
	}
	
	Cook c = new Cook();
	
	
	@Override
	public String 스파게티만들기() {
		c.썰기();
		c.굽기();
		return "오일파스타";
	}

	@Override
	public String 피자만들기() {
		// TODO Auto-generated method stub
		return "화덕피자";
	}

	@Override
	public String 돈까스만들기() {
		// TODO Auto-generated method stub
		return "왕돈까스";
	}
}
