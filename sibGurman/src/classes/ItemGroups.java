package classes;

import java.util.ArrayList;
import java.util.List;


public class ItemGroups {
	private List<Item> items;

	public ItemGroups() {
		items = new ArrayList<Item>();		
	}
	
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
    
    int getItemsLength()
    {
    	return items.size();
    }
    
    void addToItems(Item item)
	{
		items.add(item);
	}
    
}
