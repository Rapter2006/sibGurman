package classes;

import java.util.ArrayList;
import java.util.List;

public class Brand //бренд
{
	private List<Product> products;
	
	Brand(){
		products = new ArrayList<Product>();
	}
	
	int getProductsLength()
	{
		return products.size();
	}
	
	void addToProducts(Product product)
	{
		products.add(product);
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}