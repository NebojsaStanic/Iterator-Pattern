import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
	
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs", true, 2.99);
		
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs,sausage", false, 2.99);
		
		addItem("Blueberries Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		
		addItem("Waffles", "Waffles with your choise of fruit", true, 2.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public Iterator createIterator(){
		return new PancakeHouseIterator(menuItems);
	}

}
