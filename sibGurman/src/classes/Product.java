package classes;

public class Product {
      private String pictureURL;
      private double weight; //вес
      private double protein; //белки
      private double fat; //жиры
      private double carbohydrates; //углеводы
      private double  caloric; //калории
      private String storage; //как хранить
      private String packageType; //тип упаковки
      private String description; //общее описание
      private String gost; //ТУ или ГОСТ
      
      private void initProduct(String pictureURL, double weight, double protein,
    		  double fat, double carbohydrates, double caloric, 
    		  String storage, String packageType, String gost)
      {
    	   this.setPictureURL(pictureURL);
	       this.setWeight(weight);
	       this.setProtein(protein);
	       this.setFat(fat);
	       this.setCarbohydrates(carbohydrates);
	       this.setCaloric(caloric);
	       this.setStorage(storage);
	       this.setPackageType(packageType);
	       this.setGost(gost);  
      }
      
      
      Product(String pictureURL, double weight, double protein,
    		  double fat, double carbohydrates, double caloric, 
    		  String storage, String packageType, String gost)
     {
         initProduct(pictureURL, weight, protein, fat, 
    	    	carbohydrates, caloric, storage, packageType, gost);
     }
      
     Product()
     {
    	 initProduct("", 0, 0, 0, 0, 0, "", "пенал", "");
     }


	public String getPictureURL() {
		return pictureURL;
	}


	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getProtein() {
		return protein;
	}


	public void setProtein(double protein) {
		this.protein = protein;
	}


	public double getFat() {
		return fat;
	}


	public void setFat(double fat) {
		this.fat = fat;
	}


	public double getCarbohydrates() {
		return carbohydrates;
	}


	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}


	public double getCaloric() {
		return caloric;
	}


	public void setCaloric(double caloric) {
		this.caloric = caloric;
	}


	public String getStorage() {
		return storage;
	}


	public void setStorage(String storage) {
		this.storage = storage;
	}


	public String getPackageType() {
		return packageType;
	}


	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getGost() {
		return gost;
	}


	public void setGost(String gost) {
		this.gost = gost;
	}
     
}      