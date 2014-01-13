package headfirst.composite.menu;

import java.util.Iterator;
import java.util.ArrayList;

public class Menu extends MenuComponent {
	ArrayList menuComponents = new ArrayList();
	String name;
	String description;
  
	public Menu(final String name,
final  String description) {
		this.name = name;
		this.description = description;
	}
 
	public void add(final MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
 
	public void remove(final MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
 
	public MenuComponent getChild(final int i) {
		return (MenuComponent)menuComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}
 
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = 
				(MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
}
