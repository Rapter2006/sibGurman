package classes;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {

	public String categoryName;
	public List<Brand> brands;
	public int id;

	public ProductCategory() {
		this.categoryName = "";
		this.id = 0;
		this.brands = new ArrayList<Brand>();
	}

	public ProductCategory(int id, String categoryName, List<Brand> brands) {
		this.categoryName = categoryName;
		this.id = id;
		this.brands = brands;
	}

}
