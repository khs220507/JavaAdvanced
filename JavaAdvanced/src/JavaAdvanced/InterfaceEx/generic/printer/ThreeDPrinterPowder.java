package JavaAdvanced.InterfaceEx.generic.printer;

public class ThreeDPrinterPowder {
	
	private Powder material;

	public void setMaterial(Powder material) {
		this.material = material;
	}

	public Powder getMaterial() {
		return material;
	}
	
	public void print() {
		 System.out.println( "3D print use:" + material);
	 }
	 

}
