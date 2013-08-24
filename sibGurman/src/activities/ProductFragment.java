package activities;
import java.util.ArrayList;
import java.util.List;

import sequenia.sibgurman.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import classes.AllProducts;
import classes.Brand;
import classes.ForRow;
import classes.Transporter;


public class ProductFragment extends Activity {
  List<ForRow> list = new ArrayList<ForRow>();
 
  public String setTabs(String input, int maxSymbols)
  {
	String[] split = input.split(" ");
	String answer = split[0] + " ";
	int k = 0;
	for (int i = 1; i < split.length; i++)
	{	
	  if(answer.length() - k + split[i].length() < maxSymbols)
		{answer += " " + split[i];} 
	  else{
			k = answer.length();
			answer += '\n' + split[i]; 
		  }
		
	}
	return answer; 
  }
 
  public void setProductFragment(Brand brand)
  {
	  for(int i = 0; i < brand.getProducts().size(); i++)
		  {
			  final int k;
			  k = i;
			  ImageView image = new ImageView(this);
			 
			  TextView text = new TextView(this);
			  text.setTextSize(22);
			  
			  text.setText(setTabs(brand.
					       getProducts().
					       get(i).getName(), 12));
			  image.setImageResource(brand.
					                 getProducts().
					                 get(i).getPictureId());
			 LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
				    350, 350);
			 params.weight = 1;
			 params.setMargins(30, 30, 30, 30);
			 image.setLayoutParams(params);
	 	     params = new LinearLayout.LayoutParams(
				    LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			 params.weight = 1; 
			 params.gravity = Gravity.CENTER_HORIZONTAL;
			 text.setSingleLine(false);
			 text.setMaxLines(3);
			 text.setLayoutParams(params); 
			 image.setOnClickListener(new  OnClickListener() {
			 @Override
			 public void onClick(View v) {
					Intent intent = new Intent(ProductFragment.this, ProductActivity.class);
				    Transporter.positionProduct = k;
			   	    startActivity(intent);			
				}
			});
			  ForRow newRow = new ForRow(image, text);
			  list.add(newRow);
		  }  
  }
  
  public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	   setContentView(R.layout.main_list);
	   getWindow().getDecorView().setBackgroundColor(Color.WHITE);
	   LinearLayout layout1 = (LinearLayout)findViewById(R.id.lay1);
	   LinearLayout layout2 = (LinearLayout)findViewById(R.id.lay2);
	   LinearLayout layout3 = (LinearLayout)findViewById(R.id.lay3);
	  
	   switch(MainActivity.className)
  	  {
  	  case 1: 
  	  { 
  		setProductFragment(AllProducts.pelmens.get(MainActivity.pusitionItem));	
        break; 
  	  }
  	  case 2: 
  	  { 
  		setProductFragment( AllProducts.pancakes.get(MainActivity.pusitionItem));
  		break;  
  	  }
  	  case 3:
  	  {
  		setProductFragment(AllProducts.dough.get(MainActivity.pusitionItem));
	    break;
  	  }
  	  case 4:
  	  {
  		setProductFragment(AllProducts.soups.get(MainActivity.pusitionItem));
		break;
  	  }
  	  case 5:
  	  {
  		setProductFragment( AllProducts.chops.get(MainActivity.pusitionItem));
  		break;
  	  }
  	  case 6:
  	  {
  		setProductFragment(AllProducts.dumplings.get(MainActivity.pusitionItem));
	    break;
  	  }
  	  } 
	  LinearLayout layout; 
	  for(int i = 0; i < list.size(); i++)
	  {
		  layout = new LinearLayout(this);
		  layout.setWeightSum(2);
		  layout.addView(list.get(i).getImage());
		  layout.addView(list.get(i).getText());
		  layout.setOrientation(1); 
		
		  if(i>=0 && i<3) 
		  {
			
			  layout1.addView(layout);
		  
		  }
		  else if (i>=3 && i<6)
			  {
				
				  layout2.addView(layout);
			  }
		  else if(i>=6 && i<10)
		  {
			  layout3.addView(layout);
		  }
		  
		   }
	  
// */
  }
 
 
}//*/