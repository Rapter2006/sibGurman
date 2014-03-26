package classes;

import java.util.ArrayList;
import java.util.List;

import sequenia.sibgurman.R;

public class Product {

	private String description; // общее описание
	private String name; // название
	private String nameForProductList; // отображется в просмотре бренда
	private int pictureForListView; // на картинку
	private int pictureForDetailView; // вторая картинка для продукта
	private String storage; // срок годности и хранение
	private List<Package> packs = new ArrayList<Package>(); // все, что касается
															// упаковок

	public Product() {
		packs = new ArrayList<Package>();
		packs.add(new Package(0, 0, ""));
		this.name = "";
		this.storage = "";
		this.nameForProductList = "";
		this.pictureForListView = R.drawable.nobrand;
		this.pictureForDetailView = R.drawable.nobrand;
		this.description = "";
	}

	public Product(String name, String description, String storage,
			int pictureId, List<Package> pack) {
		this.name = name;
		this.nameForProductList = name;
		this.storage = storage;
		this.pictureForListView = pictureId;
		this.pictureForDetailView = pictureId;
		this.description = description;
		this.setPacks(pack);
	}

	public Product(String name, String description, String storage,
			int pictureId, int secondPictureId, List<Package> pack) {
		this.name = name;
		this.storage = storage;
		this.nameForProductList = name;
		this.pictureForListView = pictureId;
		this.pictureForDetailView = secondPictureId;
		this.description = description;
		this.setPacks(pack);
	}

	public Product(String name, String listBrandName, String description,
			String storage, int pictureId, List<Package> pack) {
		this.name = name;
		this.nameForProductList = listBrandName;
		this.storage = storage;
		this.pictureForListView = pictureId;
		this.pictureForDetailView = pictureId;
		this.description = description;
		this.setPacks(pack);
	}

	public Product(String name, String listBrandName, String description,
			String storage, int pictureId, int secondPictureId,
			List<Package> pack) {
		this.name = name;
		this.storage = storage;
		this.nameForProductList = listBrandName;
		this.pictureForListView = pictureId;
		this.pictureForDetailView = secondPictureId;
		this.description = description;
		this.setPacks(pack);
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

	public int getPictureForListView() {
		return pictureForListView;
	}

	public void setPictureForListView(int pictureForListView) {
		this.pictureForListView = pictureForListView;
	}

	public int getPictureForDetailView() {
		return pictureForDetailView;
	}

	public void setPictureForDetailView(int pictureForDetailView) {
		this.pictureForDetailView = pictureForDetailView;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public List<Package> getPacks() {
		return packs;
	}

	public void setPacks(List<Package> packs) {
		this.packs = packs;
	}

	public String getNameForProductList() {
		return nameForProductList;
	}

	public void setNameForProductList(String nameForProductList) {
		this.nameForProductList = nameForProductList;
	}

}