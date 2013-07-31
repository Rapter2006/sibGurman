package classes;

import java.util.ArrayList;
import java.util.List;

import classes.Group.Brand;

public class BrandGroups //группа брэндов
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