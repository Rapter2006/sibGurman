package food.sibgurman;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.actionbarsherlock.app.SherlockListFragment;

public class FragmentTwo extends SherlockListFragment{
	private List<ItemList> listProducts = new ArrayList<ItemList>();

@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
   	{
		listProducts.add(new ItemList("«Солнцепек» с мясом","Свинина, лук, масло, молоко", R.drawable.android_logo));
		listProducts.add(new ItemList("«Солнцепек» с сыром и ветчиной", "Ветчина, яйца, лук, масло", R.drawable.cheese));
		listProducts.add(new ItemList("«Солнцепек» со сгущенным молоком", "Сгущенка, сахар, масло, молоко", R.drawable.android_logo));
		listProducts.add(new ItemList("«Солнцепек» с творогом", "Творог, яйца, масло, мука", R.drawable.android_logo));
		listProducts.add(new ItemList("«Солнцепек» c мясом и рисом","Cвинина, рис, масло, мука", R.drawable.android_logo));
		MobileArrayAdapter adapter = new MobileArrayAdapter(getActivity().getBaseContext(), listProducts);
		setListAdapter(adapter);
		return super.onCreateView(inflater, container, savedInstanceState);
   }
}
