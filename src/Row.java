import javax.swing.*;
import java.math.BigDecimal;

public class Row {
	private JLabel name;
	private JTextArea number;
	private JLabel price;
	private Item item;
	
	public Row(Item i, int h) {
		name = new JLabel(i.getName());
		number = new JTextArea();
		price = new JLabel(i.getPrice().toString());
		item = i;
		name.setBounds(20, h, 100, 30);
		number.setBounds(130, h, 10, 30);
		price.setBounds(150, h, 100, 30);
	}
	public BigDecimal getPrice() {
		if (number.getText().matches("[0-9]+")) {
			return BigDecimal.valueOf(Integer.parseInt(number.getText()))
					.multiply(item.getPrice());
		}
		else {
			return BigDecimal.valueOf(0);
		}
	}
	
	public void add(JFrame f) {
		f.add(name);
		f.add(price);
		f.add(number);
	}
	
}
