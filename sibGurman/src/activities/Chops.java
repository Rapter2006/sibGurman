package activities;

import adapters.BrandAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import classes.AllProducts;
import com.actionbarsherlock.app.SherlockListFragment;

public class Chops extends SherlockListFragment{
@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
   	{  
	    BrandAdapter adapter = new BrandAdapter(getActivity().getBaseContext(), AllProducts.chops);
	    setListAdapter(adapter);
		return super.onCreateView(inflater, container, savedInstanceState);
   }
}
