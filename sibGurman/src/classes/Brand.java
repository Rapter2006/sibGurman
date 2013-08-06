package classes;

import java.util.ArrayList;
import java.util.List;

public class Brand //бренд
{
	private List<Product> products = new ArrayList<Product>();
	private String nameBrand;
	
	public Brand(){
		products = new ArrayList<Product>();
	}
	public Brand(String name, List<Product> products)
	{
		this.nameBrand = name;
		this.products = products;
	}
	
	
	int getProductsLength()
	{
		return products.size();
	}
	
	public void addToProducts(Product product)
	{
		products.add(product);
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getNameBrand() {
		return nameBrand;
	}

	public void setNameBrand(String nameBrand) {
		this.nameBrand = nameBrand;
	}
	
}