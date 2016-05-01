import java.awt.Menu;
import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator{
	
	ArrayList<MenuItem> items;
	int index;
	
	public PancakeHouseIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(index>=items.size()){
			return false;
		}
		else{
			return true;
		}
		
	}

	@Override
	public Object next() {
		MenuItem menuItem = items.get(index);
		index = index + 1;
		return menuItem;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
