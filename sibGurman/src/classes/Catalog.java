package classes;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private double version;
    private List<ItemGroups> groups;
    
    private void initCatalog(double version)
    {
    	this.version = version;
    	groups = new ArrayList<ItemGroups>();
    }
    
    Catalog()
    {
    	initCatalog(0.0);
    }
    
    Catalog(double version)
    {
    	initCatalog(version);
    }
    
    int getLengthItemGroups()
    {
    	return groups.size();
    	
    }
    
    void addToItemGroups(ItemGroups group)
    {
    	groups.add(group);
    }

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}

	public List<ItemGroups> getGroups() {
		return groups;
	}

	public void setGroups(List<ItemGroups> groups) {
		this.groups = groups;
	}
}
