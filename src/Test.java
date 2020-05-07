import java.math.BigDecimal;
import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Test {
	//Note that this is not private
	static JFrame f;
	public static void pick(Supermarket s) {
		JFrame custFrame = new JFrame();
		Choose c = new Choose(s);
		c.add(custFrame);

		custFrame.setLayout(null);
		custFrame.setSize(300, 300);
		custFrame.setVisible(true);

	}
	public static void newObj(Supermarket s, Thing which) {
		JFrame custFrame = new JFrame();
		
		switch (which) {
		case CUSTOMER:
			NewCustomer n = new NewCustomer(s);
			n.add(custFrame);	
			break;
		
		case DEPARTMENT:
			NewDepartment o = new NewDepartment(s);
			o.add(custFrame);
			break;
		
		case EMPLOYEE:
			NewEmployee p = new NewEmployee(s);
			p.add(custFrame);
			break;
			
		case ITEM:
			NewItem q = new NewItem(s);
			q.add(custFrame);
			break;
		}
		
		custFrame.setLayout(null);
		custFrame.setSize(300, 300);
		custFrame.setVisible(true);

	}
	public static void order(Supermarket s) {
		JFrame second = new JFrame();
		
		OrderPage a = new OrderPage(s);
		
		a.add(second);
		
		second.setLayout(null);
		second.setSize(700, 700);
		second.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		f = new JFrame();
//		
//		/*Row c = new Row(new Item("Abc", BigDecimal.valueOf(34), 2, "ER"), 10);
//		c.add(f);		
//		JLabel g = new JLabel();
//		JButton h = new JButton("Compute Price");
//		
//		g.setBounds(200, 300, 50, 50);
//		h.setBounds(300, 300, 50, 50);
//		
//		h.addActionListener(
//				(ActionEvent e) -> {
//					g.setText(c.getPrice().toString());
//				}
//				);
//		f.add(g);f.add(h);*/
//		
		ArrayList<Item> l = new ArrayList<Item>();
		l.add(new Item("a", BigDecimal.valueOf(4), 4, "cationNumber"));
		l.add(new Item("londsfgasdf", BigDecimal.valueOf(4), 4, "other"));
		
		ArrayList<Customer> c = new ArrayList<Customer>();
		c.add(new Customer("dsf"));
		
		ArrayList<Department> d = new ArrayList<Department>();
		d.add(new Department("sdfsd"));
		d.add(new Department("one"));
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee("abcdefg"));
		e.add(new Employee("adf"));
		
		Supermarket m = new Supermarket();
		m.setItems(l);
		m.setDepts(d);
		m.setEmps(e);
		m.setCustomers(c);
		
		m.remove(new Department("one"));
//		System.out.println(m.remove(new Employee("abcdefg")));
//		System.out.println(m.contains(new Employee("adf")));
//		System.out.println(m.contains(new Employee("abcdefg")));
//		
//		System.out.println(m.getEmps());
//		
//		System.out.println(d);
//		System.out.println(m.remove(new Item("cationNumber"), 2));
//		System.out.println(m.remove(new Item("cationNumber"), 2));
//		System.out.println(m.remove(new Item("cationNumber"), 2));
//		System.out.println(m.remove(new Item("sdfn"), 2));
//		System.out.println(l);
////		
		//Choose ch = new Choose(m);
		//ch.add(f);
		SignIn gf = new SignIn(m);
		gf.add(f);
//		
//		JButton j = new JButton("sdfsdf");
//		j.setBounds(0, 0, 22, 200);
////		j.addActionListener(
////				(ActionEvent e) -> { Test.clear(); });
////		f.add(j);
//		
		f.setSize(600, 600);
		f.setLayout(null);
		f.setVisible(true);
		
	} 
}