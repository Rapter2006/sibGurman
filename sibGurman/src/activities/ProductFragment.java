package activities;
import adapters.ProductAdapter;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import classes.AllProducts;

import com.actionbarsherlock.app.SherlockListFragment;

public class ProductFragment extends  SherlockListFragment{

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
	  Log.d("My", "in da product_fragment");
	  ProductAdapter productAdapter = new ProductAdapter(getActivity().getBaseContext(),
            		   AllProducts.soups.get(0).getProducts());
      setListAdapter(productAdapter);
      return super.onCreateView(inflater, container, savedInstanceState); 
  }
}