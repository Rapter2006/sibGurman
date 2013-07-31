package classes;

import java.util.ArrayList;
import java.util.List;


public class Item 
{
	private List<BrandGroups> brandGroups;

	Item()
	{
		brandGroups = new ArrayList<BrandGroups>();
	}
	
	int getBrandsLength()
	{
		return brandGroups.size();
	}
	
	void addToBrands(BrandGroups brand)
	{
		brandGroups.add(brand);
	}
	
	public List<BrandGroups> getBrands() {
		return brandGroups;
	}

	public void setBrandGroups(List<BrandGroups> brands) {
		this.brandGroups = brands;
	}
	
}