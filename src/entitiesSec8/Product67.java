package entitiesSec8;

public class Product67 {

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
	
}
