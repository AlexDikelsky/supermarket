import javax.swing.*;
import java.awt.event.*;

public class Choose {
	private JButton newCust;
	private JButton newEmp;
	private JButton newDept;
	private JButton newItem;
	
	public void add(JFrame f) {
		f.add(newCust);
		f.add(newEmp);
		f.add(newDept);
		f.add(newItem);
	}
	
	public Choose(Supermarket s) {
		newCust = new JButton("Customer");
		newEmp = new JButton("Employee");
		newDept = new JButton("Department");
		newItem = new JButton("Item");
		
		newCust.setBounds(20, 20, 150, 30);
		 newEmp.setBounds(20, 60, 150, 30);
		newDept.setBounds(20, 100, 150, 30);
		newItem.setBounds(20, 140, 150, 30);

		newCust.addActionListener( (e) -> { Test.newObj(s, Thing.CUSTOMER); });
		newEmp .addActionListener( (e) -> { Test.newObj(s, Thing.EMPLOYEE); });
		newDept.addActionListener( (e) -> { Test.newObj(s, Thing.DEPARTMENT); });
		newItem.addActionListener( (e) -> { Test.newObj(s, Thing.ITEM); });
	}
}
