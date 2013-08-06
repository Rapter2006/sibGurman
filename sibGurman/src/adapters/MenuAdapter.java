package adapters;


import java.util.List;
import classes.ItemMenu;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import food.sibgurman.R;


//Класс - адаптер для ItemMenu
public class MenuAdapter extends ArrayAdapter<ItemMenu> {
    private final Context context;
    private List<ItemMenu> items;

    public MenuAdapter(Context context, List<ItemMenu> infoButtons) {
        super(context, R.layout.menu_item, infoButtons);
        this.context = context;
        this.items = infoButtons;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.menu_item, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.labelMenu);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logoMenu);

        textView.setText(items.get(position).getLabel());
        imageView.setImageResource(items.get(position).getPictureName());

        return rowView;
    }
}