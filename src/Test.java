import java.math.BigDecimal;
import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Test {
	//Note that this is not private
	static JFrame f;
	
	public static void clear() {
		f.removeAll();
		f.revalidate();
		f.repaint();
	}
	public static void order(ArrayList<Item> l) {
		OrderPage a = new OrderPage(l);
		a.add(f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		f = new JFrame();
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
		
		ArrayList<Department> d = new ArrayList<Department>();
		d.add(new Department("sdfsd"));
		d.add(new Department("one"));
		
		Supermarket m = new Supermarket();
		m.setItems(l);
		m.setDepts(d);
		m.remove(new Department("one"));
		System.out.println(d);
//		System.out.println(m.remove(new Item("cationNumber"), 2));
//		System.out.println(m.remove(new Item("cationNumber"), 2));
//		System.out.println(m.remove(new Item("cationNumber"), 2));
//		System.out.println(m.remove(new Item("sdfn"), 2));
//		System.out.println(l);
////		
//		SignIn e = new SignIn();
//		e.add(f);
//		
//		JButton j = new JButton("sdfsdf");
//		j.setBounds(0, 0, 22, 200);
////		j.addActionListener(
////				(ActionEvent e) -> { Test.clear(); });
////		f.add(j);
//		
//		f.setSize(600, 600);
//		f.setLayout(null);
//		f.setVisible(true);
		
	}

}
