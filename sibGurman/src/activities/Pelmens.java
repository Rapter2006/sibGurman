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
import android.widget.ListView;
import classes.AllProducts;
import classes.Transporter;

import com.actionbarsherlock.app.SherlockListFragment;


public class Pelmens extends SherlockListFragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
   	{    
	    BrandAdapter adapter = new BrandAdapter(getActivity().getBaseContext(), AllProducts.pelmens);
	    setListAdapter(adapter); 
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
	    	//   FragmentTransaction fTrans = getFragmentManager().beginTransaction();
             //  Fragment frag1 = new ProductFragment();//
               MainActivity.className = 1;
               Transporter.positionBrand = position;
               MainActivity.pusitionItem = position;
               if (MainActivity.lv != null)
            	   MainActivity.lv.setVisibility(View.VISIBLE);
            //   MainActivity.ls = Pelmens.this.getListView();
             //  MainActivity.ls.setVisibility(View.INVISIBLE);
               Intent intent = new Intent(getActivity(), ProductFragment.class);
               startActivity(intent);
               //if (MainActivity.mainListView != null) MainActivity.mainListView.setVisibility(View.VISIBLE);
               //fTrans.replace(android.R.id.content, frag1).addToBackStack(null);
               //fTrans.commit();
	     	}
		});
   }

}