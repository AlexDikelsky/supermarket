import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class Supermarket extends Test {
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
		
		System.out.println(loc);
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

	public boolean remove(Department d) {
		int loc = 0; 
		boolean found = false;
		while (loc < depts.size()) { 
			System.out.println(loc);
			if (depts.get(loc).equals(d)) {
				System.out.println("Made");
				depts.remove(loc);
			}
			loc += 1;
		}
		return !(loc == depts.size());
		
	}
	public boolean remove(Employee e) { 
		return safeRemove(emps, e);
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
