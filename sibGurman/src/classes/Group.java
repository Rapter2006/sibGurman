package classes;

import java.util.ArrayList;
import java.util.List;

public class Group {
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
    
    public class BrandGroups
    {
    	private List<Brand> brands;

    	BrandGroups()
    	{
    		brands = new ArrayList<Brand>();
    	}
    	
    	int getBrandsLength()
    	{
    		return brands.size();
    	}
    	
    	void addToProducts(Brand brand)
    	{
    		brands.add(brand);
    	}
    	
		public List<Brand> getBrands() {
			return brands;
		}

		public void setBrands(List<Brand> brands) {
			this.brands = brands;
		}
    	
    }
    
}
