import javax.swing.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.util.ArrayList;

public class OrderPage extends Supermarket {
	
	private ArrayList<Row> rows;
	JLabel title;
	JButton calculate;
	JLabel total;
	JButton confirm;
	
	//Looks at supermarket, and 
	public OrderPage(ArrayList<Item> items) {
		
		title = new JLabel("Order");
		calculate = new JButton("Calc");
		total = new JLabel();
		confirm = new JButton("Confirm Purchase");
		
		title.setBounds(150, 10, 60, 30);
		calculate.setBounds(300, 10, 80, 30);
		total.setBounds(10, 10, 80, 30);
		confirm.setBounds(400, 10, 175, 30);
	
		calculate.addActionListener(
				(ActionEvent e) -> {
					calculate.setText(sumOverRows().toString());
				});
		confirm.addActionListener(
				(ActionEvent e) -> {
					//Mutates supermarket to increase funds
					//TODO This ignores stock of items
					super.setFunds(getFunds().add(sumOverRows()));
				
					
					});
					
		this.rows = new ArrayList<Row>();
		
		int h = 50;
		for (Item i : items) {
			rows.add(new Row(i, h));
			h += 50;
		}
	
	}
	public void add(JFrame f) {
		for (Row r : rows) {
			r.add(f);
		}
		f.add(calculate);
		f.add(title);
		f.add(total);
		f.add(confirm);
		
	}
	
	public BigDecimal sumOverRows() {
		BigDecimal sum = BigDecimal.valueOf(0);
		for (Row r : this.rows) { 
			sum = sum.add(r.getPrice());
		}
		return sum;
	}
}
