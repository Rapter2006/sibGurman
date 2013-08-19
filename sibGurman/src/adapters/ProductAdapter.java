package adapters;

import java.util.List;

import sequenia.sibgurman.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import classes.Product;

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

        TextView firstNumber = (TextView) rowView.findViewById(R.id.numberOne);
        firstNumber.setText(Integer.toString(items.get(position).getPacks().get(0).getNumber())+ " ");
        
        TextView firstWeight = (TextView) rowView.findViewById(R.id.weightOne);
        firstWeight.setText(Double.toString(items.get(position).getPacks().get(0).getWeight())+ " ");
        
        TextView firstType = (TextView) rowView.findViewById(R.id.typeOne);
        firstType.setText(items.get(position).getPacks().get(0).getPackageType()+ " ");
        
        try{

            TextView secondNumber = (TextView) rowView.findViewById(R.id.numberTwo);
            secondNumber.setText(Integer.toString(items.get(position).getPacks().get(1).getNumber())+ " ");
            
            TextView secondWeight = (TextView) rowView.findViewById(R.id.weightTwo);
            secondWeight.setText(Double.toString(items.get(position).getPacks().get(1).getWeight())+ " ");
            
            TextView secondType = (TextView) rowView.findViewById(R.id.typeTwo);
            secondType.setText(items.get(position).getPacks().get(1).getPackageType()+ " ");      	
        
            TextView thirdNumber = (TextView) rowView.findViewById(R.id.numberThree);
            thirdNumber.setText(Integer.toString(items.get(position).getPacks().get(2).getNumber())+ " ");
            
            TextView thirdWeight = (TextView) rowView.findViewById(R.id.weightThree);
            thirdWeight.setText(Double.toString(items.get(position).getPacks().get(2).getWeight())+ " ");
            
            TextView thirdType = (TextView) rowView.findViewById(R.id.typeThree);
            thirdType.setText(items.get(position).getPacks().get(2).getPackageType()+ " ");
        }
        catch(Exception e)
        {}
        
        return rowView;
    }
}