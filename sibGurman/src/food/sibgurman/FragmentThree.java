package food.sibgurman;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockListFragment;
//import classes.ItemList;

public class FragmentThree extends SherlockListFragment{
	private List<ItemList> listProducts = new ArrayList<ItemList>();

@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
   	{
		listProducts.add(new ItemList("«Элитные»","Свинина, лук, масло, молоко", R.drawable.));
		listProducts.add(new ItemList("Манты «Сибирские»", "Свинина, говядина, лук, масло", R.drawable.android_logo));
		listProducts.add(new ItemList("«Смешарики»", "Свинина, лук, масло, молоко", R.drawable.android_logo));
		listProducts.add(new ItemList("«Едим дома» Классические", "Cвинина, говядина, масло, мука", R.drawable.android_logo));
		listProducts.add(new ItemList("«Едим дома» Сибирские","Cвинина, говядина, масло, мука", R.drawable.android_logo));
		MobileArrayAdapter adapter = new MobileArrayAdapter(getActivity().getBaseContext(), listProducts);
		setListAdapter(adapter);
		return super.onCreateView(inflater, container, savedInstanceState);
   }
}
