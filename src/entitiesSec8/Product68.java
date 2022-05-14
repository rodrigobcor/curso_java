package entitiesSec8;

public class Product68 {

	public String name;
	public double price;
	public int qt;

	public double TotalValueInStock() {
		return price * qt;
	}
	
	public void AddProducts(int nqt) {
		qt += nqt;
	}
	
	public void RemoveProducts(int nqt) {
		qt -= nqt;
	}
	
	public String toString() {
		return "Product data: " + name + ", $ " + String.format("%.2f", price) + ", " + qt + 
				" units, Total: $ " + String.format("%.2f", TotalValueInStock());
	}
}
