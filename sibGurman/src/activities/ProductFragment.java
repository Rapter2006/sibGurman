package activities;
import adapters.ProductViewAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import classes.AllProducts;
import classes.Transporter;

import com.actionbarsherlock.app.SherlockListFragment;

public class ProductFragment extends  SherlockListFragment{

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
	  ProductViewAdapter productAdapter = null;
	  switch(MainActivity.className)
	  {
	  case 1: 
	  { productAdapter = new ProductViewAdapter(getActivity().getBaseContext(),
       		   AllProducts.pelmens.get(MainActivity.pusitionItem).getProducts());
	    break; 
	  }
	  case 2: 
	  { productAdapter = new ProductViewAdapter(getActivity().getBaseContext(),
       		   AllProducts.pancakes.get(MainActivity.pusitionItem).getProducts());
	  	break;  
	  }
	  case 3:
	  {
		  productAdapter = new ProductViewAdapter(getActivity().getBaseContext(),
       		   AllProducts.dough.get(MainActivity.pusitionItem).getProducts());
		  break;
	  }
	  case 4:
	  {
		  productAdapter = new ProductViewAdapter(getActivity().getBaseContext(),
       		   AllProducts.soups.get(MainActivity.pusitionItem).getProducts());
		  break;
	  }
	  case 5:
	  {
		  productAdapter = new ProductViewAdapter(getActivity().getBaseContext(),
       		   AllProducts.chops.get(MainActivity.pusitionItem).getProducts());
		  break;
	  }
	  case 6:
	  {
		  productAdapter = new ProductViewAdapter(getActivity().getBaseContext(),
       		   AllProducts.dumplings.get(MainActivity.pusitionItem).getProducts());
		  break;
	  }
	  }
	  if (productAdapter!=null) setListAdapter(productAdapter);
	  
      return super.onCreateView(inflater, container, savedInstanceState); 
  }
  @Override
  public void onActivityCreated(Bundle savedInstanceState)
  { 
	super.onActivityCreated(savedInstanceState);
	MainActivity.lv = ProductFragment.this.getListView();
	
	this.getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
	     public void onItemClick(AdapterView<?> parent, View view,
                int position, long id)
	     	{	
	    	 Intent intent = new Intent(getActivity(), ProductActivity.class);
	    	 Transporter.positionProduct = position;
	    	 startActivity(intent);
	     	}
	     
		});
  }
}