import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class Supermarket extends Test
{
	private ArrayList<Item> items;
	private ArrayList<Employee> emps;
	private ArrayList<Department> depts;
	private ArrayList<Customer> customers;
	private Date date;
	private BigDecimal funds;
	
	
	
	//I thought about doing the add methods with generics, however
	//each is appended to different lists, so it wouldn't work unless
	//I tested the types, resulting in large if statements anyway
	public void add(Item i) { items.add(i); }
	public void add(Employee e) { emps.add(e); }
	public void add(Department d) { depts.add(d); }
	public void add(Customer c) { customers.add(c); }
	
	
	public boolean remove(Item i, int amount) {
		//Note that this doesn't add funds back to the store after items are
		//remvoved
		int loc = 0;
		boolean found = false;
		while (!found && loc < items.size()) {
			if (items.get(loc).equals(i)) {
				found = true;
				loc -= 1; //Because it gets inced at the end
			}
			loc += 1;
		}
		//Use of ternary operator
		loc = found ? loc : -1;
		
		if (loc != -1) {
			Item searched_item = items.get(loc);
			if (searched_item.getStock() - amount >= 0) {
				searched_item.setStock(
						searched_item.getStock() - amount
						);
				return true;
			}
		}
		return false;
	}
	
	public<T> boolean safeRemove(ArrayList<T> list, T toRemove) {
		int loc = list.indexOf(toRemove);
		if (loc != -1) {
			list.remove(loc);
			return true;
		}
		return false;
	}

	//Generics
	//Didn't want to rewrite everyhing from the remove thing, so I addced the "removeIfFound" option
	public boolean look(ArrayList<? extends Identifyable> list, Identifyable i, boolean removeIfFound) {
		int loc = 0;
		boolean found = false;
		//Can't do this with indexOf because indexOf compares objects not equality
		//There's probably a way to do this with Iterators, but they were not covered in this class
		while (loc < list.size() && !found) { 
			if (list.get(loc).getIdentificationNumber()
					.contentEquals(i.getIdentificationNumber()))
			{
				found = true;
				if (removeIfFound) 
					//Remove by index here
					{ list.remove(loc); }
					//loc doesn't matter after this point, so don't need to worry about the
					//fact that loc now is the index greater than the correct one
			}
			loc += 1;
		}
		return found;
	}
	
	//Couldn't get good uses of generics here because each
	//type is stored in a differnt list, so I would need a bunch of instanceof
	//stuff to get it to work 
	public boolean remove(Department d) {
		return look(depts, d, true);
	}	
	public boolean remove(Customer c) {
		return look(customers, c, true);
	}	
	public boolean remove(Employee e) { 
		return look(emps, e, true);
	}
	public boolean contains(Employee e) {
		return look(emps, e, false);
	}
	public boolean contains(Customer c) {
		return look(customers, c, false);
	}
	public boolean contains(Department d) {
		return look(depts, d, false);
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public ArrayList<Employee> getEmps() {
		return emps;
	}
	public void setEmps(ArrayList<Employee> emps) {
		this.emps = emps;
	}
	public ArrayList<Department> getDepts() {
		return depts;
	}
	public void setDepts(ArrayList<Department> depts) {
		this.depts = depts;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	public BigDecimal getFunds() {
		return funds;
	}
	public void setFunds(BigDecimal funds) {
		this.funds = funds;
	}		
}