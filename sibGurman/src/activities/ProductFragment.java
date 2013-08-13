package activities;
import adapters.ProductAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import classes.AllProducts;

import com.actionbarsherlock.app.SherlockListFragment;

public class ProductFragment extends  SherlockListFragment{

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
	  ProductAdapter productAdapter = null;
	 //Log.d("My", "in da product_fragment");
	  switch(MainActivity.className)
	  {
	  case 1: 
	  { productAdapter = new ProductAdapter(getActivity().getBaseContext(),
       		   AllProducts.pelmens.get(MainActivity.pusitionItem).getProducts());
	    break; 
	  }
	  case 2: 
	  { productAdapter = new ProductAdapter(getActivity().getBaseContext(),
       		   AllProducts.pancakes.get(MainActivity.pusitionItem).getProducts());
	  	break;  
	  }
	  case 3:
	  {
		  productAdapter = new ProductAdapter(getActivity().getBaseContext(),
       		   AllProducts.dough.get(MainActivity.pusitionItem).getProducts());
		  break;
	  }
	  case 4:
	  {
		  productAdapter = new ProductAdapter(getActivity().getBaseContext(),
       		   AllProducts.soups.get(MainActivity.pusitionItem).getProducts());
		  break;
	  }
	  case 5:
	  {
		  productAdapter = new ProductAdapter(getActivity().getBaseContext(),
       		   AllProducts.chops.get(MainActivity.pusitionItem).getProducts());
		  break;
	  }
	  case 6:
	  {
		  productAdapter = new ProductAdapter(getActivity().getBaseContext(),
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
  }
}