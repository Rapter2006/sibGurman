package classes;

import android.content.Intent;

//Класс - элемент меню
public class ItemMenu {
    private String label;
    private Intent intent;
    private int pictureName;

    public ItemMenu(String label, int pictureName, Intent intent)
    {
    	this.intent = intent;
        this.label = label;
        this.pictureName = pictureName;
    }


	public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    public int getPictureName()
    {
        return pictureName;
    }

    public void setPictureName(int pictureName)
    {
        this.pictureName  = pictureName;
    }

	public Intent getIntent() {
		return intent;
	}

	public void setIntent(Intent intent) {
		this.intent = intent;
	}
}
