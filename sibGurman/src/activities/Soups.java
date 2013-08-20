package activities;

import adapters.BrandAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import classes.AllProducts;
import classes.Transporter;

import com.actionbarsherlock.app.SherlockListFragment;


public class Soups extends SherlockListFragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
   	{    
	    BrandAdapter adapter = new BrandAdapter(getActivity().getBaseContext(), AllProducts.soups);
	    setListAdapter(adapter); 
	    if (MainActivity.lv != null)
     	   MainActivity.lv.setVisibility(View.VISIBLE);
	    return super.onCreateView(inflater, container, savedInstanceState);		
	}


@Override
   public void onActivityCreated(Bundle savedInstanceState)
   { 
	super.onActivityCreated(savedInstanceState);

	this.getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
	     public void onItemClick(AdapterView<?> parent, View view,
                 int position, long id)
	     	{	
	    	   //FragmentTransaction fTrans = getFragmentManager().beginTransaction();
               //Fragment frag1 = new ProductFragment();
               Transporter.positionBrand = position;
               MainActivity.className = 4;
               MainActivity.pusitionItem = position;
               MainActivity.ls = Soups.this.getListView();
               MainActivity.ls.setVisibility(View.INVISIBLE);
               Intent intent = new Intent(getActivity(), ProductFragment.class);
               startActivity(intent);
               //fTrans.replace(android.R.id.content, frag1).addToBackStack(null);
               //fTrans.commit();
	     	}
	     
		});
   }

}