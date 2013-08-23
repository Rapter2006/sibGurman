package classes;

import java.util.ArrayList;
import java.util.List;

import sequenia.sibgurman.R;

public class Brand //бренд
{
	private List<Product> products = new ArrayList<Product>();
	private String nameBrand; //имя бренда
	private int pictureId; //на картинку
	
	public Brand(){
		products = new ArrayList<Product>();
	}
	public Brand(String name, int pictureId, List<Product> products)
	{
		this.nameBrand = name;
		this.pictureId = pictureId;
		this.products = products;
	}
	
	public Brand(String name, List<Product> products)
	{
		this.nameBrand = name;
		this.pictureId = R.drawable.nobrand;
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
	public int getPictureId() {
		return pictureId;
	}
	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}
	
}