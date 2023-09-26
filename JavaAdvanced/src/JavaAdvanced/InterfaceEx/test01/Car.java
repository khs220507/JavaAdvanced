package JavaAdvanced.InterfaceEx.test01;

public class Car {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
}
