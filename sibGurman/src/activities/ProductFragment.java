package activities;
import java.util.ArrayList;
import java.util.List;

import sequenia.sibgurman.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import classes.AllProducts;
import classes.ForRow;
import classes.Transporter;

import com.actionbarsherlock.app.SherlockFragment;


public class ProductFragment extends Activity {
	List<ForRow> list = new ArrayList<ForRow>();
  public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	   setContentView(R.layout.main_list);
	 //View v = inflater.inflate(R.layout.main_list, null);
	 TableLayout table = (TableLayout)findViewById(R.id.table);
	  table.setStretchAllColumns(true);
	  TableRow row = new TableRow(this);
	 
	  switch(MainActivity.className)
  	  {
  	  case 1: 
  	  { 
  		  for(int i = 0; i < AllProducts.pelmens.get(MainActivity.pusitionItem).getProducts().size(); i++)
  		  {
  			  final int k;
  			  k = i;
  			  ImageView image = new ImageView(this);
  			  TextView text = new TextView(this);
  			  text.setTextSize(32);
  			  text.setText(AllProducts.
  					                 pelmens.
  					                 get(MainActivity.pusitionItem).
  					                 getProducts().
  					                 get(i).getName());
  			  image.setImageResource(AllProducts.
  					                 pelmens.
  					                 get(MainActivity.pusitionItem).
  					                 getProducts().
  					                 get(i).getPictureId());
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
       break; 
  	  }
  	  case 2: 
  	  { 
  		  for(int i = 0; i < AllProducts.pancakes.get(MainActivity.pusitionItem).getProducts().size(); i++)
  		  {
  			  final int k;
  			  k = i;
  			  ImageView image = new ImageView(this);
  			  TextView text = new TextView(this);
  			  text.setText(AllProducts.
  					                 pancakes.
  					                 get(MainActivity.pusitionItem).
  					                 getProducts().
  					                 get(i).getName());
  			  image.setImageResource(AllProducts.
  					                 pancakes.
  					                 get(MainActivity.pusitionItem).
  					                 getProducts().
  					                 get(i).getPictureId());
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
  		  break;  
  	  }
  	  case 3:
  	  {
  		for(int i = 0; i < AllProducts.dough.get(MainActivity.pusitionItem).getProducts().size(); i++)
		  {
			  final int k;
			  k = i;
			  ImageView image = new ImageView(this);
			  TextView text = new TextView(this);
			  text.setText(AllProducts.
					                 dough.
					                 get(MainActivity.pusitionItem).
					                 getProducts().
					                 get(i).getName());
			  image.setImageResource(AllProducts.
					                 dough.
					                 get(MainActivity.pusitionItem).
					                 getProducts().
					                 get(i).getPictureId());
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
  		  break;
  	  }
  	  case 4:
  	  {
  		for(int i = 0; i < AllProducts.soups.get(MainActivity.pusitionItem).getProducts().size(); i++)
		  {
			  final int k;
			  k = i;
			  ImageView image = new ImageView(this);
			  TextView text = new TextView(this);
			  text.setText(AllProducts.
					                 soups.
					                 get(MainActivity.pusitionItem).
					                 getProducts().
					                 get(i).getName());
			  image.setImageResource(AllProducts.
					                 soups.
					                 get(MainActivity.pusitionItem).
					                 getProducts().
					                 get(i).getPictureId());
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
  		  break;
  	  }
  	  case 5:
  	  {
  		for(int i = 0; i < AllProducts.chops.get(MainActivity.pusitionItem).getProducts().size(); i++)
		  {
			  final int k;
			  k = i;
			  ImageView image = new ImageView(this);
			  TextView text = new TextView(this);
			  text.setText(AllProducts.
					                 chops.
					                 get(MainActivity.pusitionItem).
					                 getProducts().
					                 get(i).getName());
			  image.setImageResource(AllProducts.
					                 chops.
					                 get(MainActivity.pusitionItem).
					                 getProducts().
					                 get(i).getPictureId());
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
  		break;
  	  }
  	  case 6:
  	  {
  		for(int i = 0; i < AllProducts.dumplings.get(MainActivity.pusitionItem).getProducts().size(); i++)
		  {
			  final int k;
			  k = i;
			  ImageView image = new ImageView(this);
			  TextView text = new TextView(this);
			  text.setText(AllProducts.
					                 dumplings.
					                 get(MainActivity.pusitionItem).
					                 getProducts().
					                 get(i).getName());
			  image.setImageResource(AllProducts.
					                 dumplings.
					                 get(MainActivity.pusitionItem).
					                 getProducts().
					                 get(i).getPictureId());
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
  		  break;
  	  }
  	  } 
	  
	  for(int i = 0; i < list.size(); i++)
	  {
		  LinearLayout layout = new LinearLayout(this);
		 
		  layout.addView(list.get(i).getImage());
		  layout.addView(list.get(i).getText());
		  layout.setGravity(Gravity.BOTTOM);
		  row.addView(layout);
		  if(i%3 == 0) {
			            table.addView(row);
			            row = new TableRow(this);
		               }
	  }
	 
// */
  }
 
 
}//*/