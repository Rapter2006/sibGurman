package classes;

import java.util.ArrayList;
import java.util.List;

public class Product {
      
      private String description; //общее описание
      private String name; //название
      private int pictureId; //на картинку
      private String storage; //срок годности и хранение
      private List<Package> packs = new ArrayList<Package>(); // все, что касается упаковок
      
      private void initProduct(String name, String description, String storage, int pictureId, List<Package> pack)
      {
    	  this.name = name;
    	  this.storage = storage;
    	  this.pictureId = pictureId;
    	  this.description =  description;
    	  this.setPacks(pack);
      }
      
      
     public Product(String name, String description, String storage, int pictureId, List<Package> pack)
     {
         initProduct(name, description, storage, pictureId, pack);
     }
      
     public Product()
     {
         packs.add(new Package(0, 0, ""));
    	 initProduct("", "", "", 1, packs);
     }

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPictureId() {
		return this.pictureId;
	}


	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}


	public List<Package> getPacks() {
		return packs;
	}


	public void setPacks(List<Package> packs) {
		this.packs = packs;
	}


	public String getStorage() {
		return storage;
	}


	public void setStorage(String storage) {
		this.storage = storage;
	}
     
}      