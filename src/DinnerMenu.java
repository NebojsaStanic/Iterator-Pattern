
public class DinnerMenu implements Menu {
	
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Dinner 1", "First dinner", true, 2.60);
		addItem("Dinner 2", "Second dinner", false, 3.60);
		addItem("Dinner 3", "Third dinner", true, 4.60);
		addItem("Dinner 4", "Fourth dinner", false, 5.60);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems>=menuItems.length){
			System.out.println("Sorry, menu is full. Can't add item to menu.");
		}
		else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	} 
	
	public Iterator createIterator(){
		return new DinnerMenuIterator(menuItems);
	}

}
