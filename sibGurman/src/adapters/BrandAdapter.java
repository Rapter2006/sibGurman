package adapters;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import classes.Brand;
import sequenia.sibgurman.R;

public class BrandAdapter extends ArrayAdapter<Brand> {
    private final Context context;
    private List<Brand> items;

    public BrandAdapter (Context context, List<Brand> brands) {
        super(context, R.layout.brand, brands);
        this.context = context;
        this.items = brands;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.brand, parent, false);

        TextView nameBrand = (TextView) rowView.findViewById(R.id.nameBrand);
        
        nameBrand.setText(items.get(position).getNameBrand());
        
        return rowView;
    }
}