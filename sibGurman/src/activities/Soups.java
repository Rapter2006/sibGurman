package activities;

import adapters.BrandAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import classes.AllProducts;

import com.actionbarsherlock.app.SherlockListFragment;




public class Soups extends SherlockListFragment{
@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
   	{  
	   
	    
	    BrandAdapter adapter = new BrandAdapter(getActivity().getBaseContext(), AllProducts.soups);
	    setListAdapter(adapter); 
	  
	    View view =  super.onCreateView(inflater, container, savedInstanceState); 
	    
	    return view;		
	    //return super.onCreateView(inflater, container, savedInstanceState); 
    }


@Override
   public void onActivityCreated(Bundle savedInstanceState)
   { 
	super.onActivityCreated(savedInstanceState);
	
	this.getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
	     public void onItemClick(AdapterView<?> parent, View view,
                 int position, long id)
	     	{	    	 //
	    	 
               Log.d("My", AllProducts.soups.get(position).getNameBrand());
               FragmentTransaction fTrans = getFragmentManager().beginTransaction();
               Fragment frag1 = new ProductFragment();
               Soups.this.getListView().setVisibility(View.INVISIBLE);
               fTrans.replace(android.R.id.content, frag1).addToBackStack(null);
               
               
               fTrans.commit();
               //*/
               //ProductAdapter productAdapter = new ProductAdapter(getActivity().getBaseContext(), 
            	//	   AllProducts.soups.get(position).getProducts());
       	       //setListAdapter(productAdapter); 
               
	     	}
	     
		});
   }



}