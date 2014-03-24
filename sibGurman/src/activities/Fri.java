package activities;

import com.actionbarsherlock.app.SherlockListFragment;

import adapters.BrandAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import classes.AllProducts;
import classes.Transporter;

public class Fri extends SherlockListFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		BrandAdapter adapter = new BrandAdapter(getActivity().getBaseContext(),
				AllProducts.fri);
		setListAdapter(adapter);
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		this.getListView().setOnItemClickListener(
				new AdapterView.OnItemClickListener() {
					public void onItemClick(AdapterView<?> parent, View view,
							int position, long id) {
						MainActivity.className = 2;
						Transporter.positionBrand = position;
						MainActivity.pusitionItem = position;
						if (MainActivity.lv != null)
							MainActivity.lv.setVisibility(View.VISIBLE);
						Intent intent = new Intent(getActivity(),
								ProductFragment.class);
						startActivity(intent);
					}
				});
	}

}
