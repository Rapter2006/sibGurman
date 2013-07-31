package classes;

public class ItemList {
    private String name;
    private String ingr;
    private int pictureName;

    public ItemList(String name, String ingr, int pictureName)
    {
        this.name = name;
        this.ingr = ingr;
        this.pictureName = pictureName;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPictureName()
    {
        return pictureName;
    }

    public void setPictureName(int pictureName)
    {
        this.pictureName  = pictureName;
    }

	public String getIngr() {
		return ingr;
	}

	public void setIngr(String ingr) {
		this.ingr = ingr;
	}
}
