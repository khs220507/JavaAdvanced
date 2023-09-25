package JavaAdvanced.InterfaceEx.generic.printer;

public class GThreeDPrinter2<T extends Material> {
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public void print() {
		System.out.println("3D PRINT" + material);
	}
	


}
