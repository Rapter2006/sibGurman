package adapters;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import classes.Product;
import food.sibgurman.R;

public class ProductAdapter extends ArrayAdapter<Product> {
    private final Context context;
    private List<Product> items;

    public ProductAdapter(Context context, List<Product> products) {
        super(context, R.layout.product, products);
        this.context = context;
        this.items = products;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.product, parent, false);

        TextView textViewNameProduct = (TextView) rowView.findViewById(R.id.nameProduct);
        TextView textViewDescriptionProduct = (TextView) rowView.findViewById(R.id.descriptionProduct);
        TextView textViewStorageProduct = (TextView) rowView.findViewById(R.id.storageProduct);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageProduct);
        
        textViewNameProduct.setText(items.get(position).getName());
        textViewDescriptionProduct.setText(items.get(position).getDescription());
        textViewStorageProduct.setText(items.get(position).getStorage());
        imageView.setImageResource(items.get(position).getPictureId());

        return rowView;
    }
}