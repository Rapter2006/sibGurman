package activities;

import adapters.BrandAdapter;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import classes.AllProducts;

import com.actionbarsherlock.app.SherlockListFragment;

public class Pancakes extends SherlockListFragment 
{
@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
   	{  
	    BrandAdapter adapter = new BrandAdapter(getActivity().getBaseContext(), AllProducts.pancakes);
	    setListAdapter(adapter);
	    View view = super.onCreateView(inflater, container, savedInstanceState);
	    Log.d("!!", "333");
		return view;
   }


   
}

