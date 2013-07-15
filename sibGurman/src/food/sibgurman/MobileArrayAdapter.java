package food.sibgurman;

import food.sibgurman.R;
import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileArrayAdapter extends ArrayAdapter<ItemList> {
    private final Context context;
    private List<ItemList> items;

    public MobileArrayAdapter(Context context, List<ItemList> infoButtons) {
        super(context, R.layout.listitem, infoButtons);
        this.context = context;
        this.items = infoButtons;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.listitem, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.label);
        TextView textView2 = (TextView) rowView.findViewById(R.id.ingredients);
        
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);

        textView.setText(items.get(position).getName());
        textView2.setText(items.get(position).getIngr());
        imageView.setImageResource(items.get(position).getPictureName());

        return rowView;
    }//*/
}