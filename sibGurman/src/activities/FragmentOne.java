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

public class FragmentOne extends SherlockListFragment{
	private List<ItemList> listProducts = new ArrayList<ItemList>();

@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
   	{
		listProducts.add(new ItemList("«Элитные»","Свинина, лук, масло, молоко", R.drawable.elite));
		listProducts.add(new ItemList("Манты «Сибирские»", "Свинина, говядина, лук, масло", R.drawable.manty));
		listProducts.add(new ItemList("«Смешарики»", "Свинина, лук, масло, молоко", R.drawable.smesh));
		listProducts.add(new ItemList("«Едим дома» Классические", "Cвинина, говядина, масло, мука", R.drawable.classic));
		listProducts.add(new ItemList("«Едим дома» Сибирские","Cвинина, говядина, масло, мука", R.drawable.sib));
		MobileArrayAdapter adapter = new MobileArrayAdapter(getActivity().getBaseContext(), listProducts);
		setListAdapter(adapter);
		return super.onCreateView(inflater, container, savedInstanceState);
   }
}
