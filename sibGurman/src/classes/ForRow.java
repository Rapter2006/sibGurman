package classes;

import android.view.View;

public class ForRow{
    public ForRow(View image, View text) {
		this.setImage(image);
	    this.setText(text);
	}
	private View image;
    private View text;
	public View getImage() {
		return image;
	}
	public void setImage(View image) {
		this.image = image;
	}
	public View getText() {
		return text;
	}
	public void setText(View text) {
		this.text = text;
	}
    
}
