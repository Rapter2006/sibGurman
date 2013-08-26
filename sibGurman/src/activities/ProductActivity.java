package activities;

import sequenia.sibgurman.R;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import classes.AllProducts;
import classes.Product;
import classes.Transporter;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class ProductActivity extends SherlockFragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().getDecorView().setBackgroundColor(Color.WHITE);
        Product myProduct = null;
        switch(MainActivity.className)
  	  {
  	  case 1: 
  	  { 
        myProduct = AllProducts.pelmens.get(Transporter.positionBrand).getProducts().get(Transporter.positionProduct);
  	    break; 
  	  }
  	  case 2: 
  	  { 
  	    myProduct = AllProducts.pancakes.get(Transporter.positionBrand).getProducts().get(Transporter.positionProduct);
	  	break;  
  	  }
  	  case 3:
  	  {
  		myProduct = AllProducts.dough.get(Transporter.positionBrand).getProducts().get(Transporter.positionProduct);
	 	break;
  	  }
  	  case 4:
  	  {
  		myProduct = AllProducts.soups.get(Transporter.positionBrand).getProducts().get(Transporter.positionProduct);
	 	break;
  	  }
  	  case 5:
  	  {
  		myProduct = AllProducts.chops.get(Transporter.positionBrand).getProducts().get(Transporter.positionProduct);
	 	break;
  	  }
  	  case 6:
  	  {
  		myProduct = AllProducts.dumplings.get(Transporter.positionBrand).getProducts().get(Transporter.positionProduct);
	    break;
  	  }
  	  }  
      setContentView(R.layout.product);
      if (myProduct != null){
      TextView textViewNameProduct = (TextView) findViewById(R.id.nameProduct);
      TextView textViewDescriptionProduct = (TextView)  findViewById(R.id.descriptionProduct);
      TextView textViewStorageProduct = (TextView)  findViewById(R.id.storageProduct);
      ImageView imageView = (ImageView)  findViewById(R.id.imageProduct);
      
      textViewNameProduct.setText(myProduct.getName());

      textViewDescriptionProduct.setText(myProduct.getDescription());
      textViewStorageProduct.setText(myProduct.getStorage());
      imageView.setImageResource(myProduct.getPictureId());

      TextView firstNumber = (TextView)  findViewById(R.id.numberOne);
      firstNumber.setText(Integer.toString(myProduct.getPacks().get(0).getNumber())+ " ");
      
      TextView firstWeight = (TextView)  findViewById(R.id.weightOne);
      firstWeight.setText(Double.toString(myProduct.getPacks().get(0).getWeight())+ " ");
      
      TextView firstType = (TextView)  findViewById(R.id.typeOne);
      firstType.setText(myProduct.getPacks().get(0).getPackageType()+ " ");
      
      try{

          TextView secondNumber = (TextView)  findViewById(R.id.numberTwo);
          secondNumber.setText(Integer.toString(myProduct.getPacks().get(1).getNumber())+ " ");
          
          TextView secondWeight = (TextView)  findViewById(R.id.weightTwo);
          secondWeight.setText(Double.toString(myProduct.getPacks().get(1).getWeight())+ " ");
          
          TextView secondType = (TextView)  findViewById(R.id.typeTwo);
          secondType.setText(myProduct.getPacks().get(1).getPackageType()+ " ");      	
      
          TextView thirdNumber = (TextView)  findViewById(R.id.numberThree);
          thirdNumber.setText(Integer.toString(myProduct.getPacks().get(2).getNumber())+ " ");
          
          TextView thirdWeight = (TextView)  findViewById(R.id.weightThree);
          thirdWeight.setText(Double.toString(myProduct.getPacks().get(2).getWeight())+ " ");
          
          TextView thirdType = (TextView)  findViewById(R.id.typeThree);
          thirdType.setText(myProduct.getPacks().get(2).getPackageType()+ " ");
      }
      catch(Exception e)
      {}
      }//*/
    }


}
