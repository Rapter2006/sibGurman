package activities;


import java.util.ArrayList;
import java.util.List;

import adapters.MobileArrayAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import classes.ItemList;

import com.actionbarsherlock.app.SherlockListFragment;

import food.sibgurman.R;

public class FragmentThree extends SherlockListFragment{
	private List<ItemList> listProducts = new ArrayList<ItemList>();

@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
   	{
		listProducts.add(new ItemList("«Борщ»","Свинина, лук, картофель, говядина", R.drawable.borsh));
		listProducts.add(new ItemList("Грибной суп «Домашние Секреты»", "Зелень, морковь, лук, грибы", R.drawable.mashrooms));
		listProducts.add(new ItemList("«Cолянка»", "Свинина, лук, масло, колбасы", R.drawable.sol9nka));
		MobileArrayAdapter adapter = new MobileArrayAdapter(getActivity().getBaseContext(), listProducts);
		setListAdapter(adapter);
		return super.onCreateView(inflater, container, savedInstanceState);
   }
}
