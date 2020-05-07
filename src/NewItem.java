import javax.swing.*;
import java.awt.event.*;
import java.math.BigDecimal;

public class NewItem {
	private JLabel title;
	private JLabel name_tag;
	private JTextField nameField;
	private JLabel price_tag;
	private JTextField priceField;
	private JButton submit;
	private JLabel result;
	
	public void add(JFrame f) {
		f.add(nameField);
		f.add(title);
		f.add(name_tag);
		f.add(submit);
		f.add(result);
		f.add(priceField);
		f.add(price_tag);
	}
	
	public NewItem(Supermarket supermarket) {
		title = new JLabel("Create New Item");
		name_tag = new JLabel("Name:");
		nameField = new JTextField();
		price_tag = new JLabel("Price:");
		priceField = new JTextField();
		submit = new JButton("Submit");
		result = new JLabel();
		
		title.setBounds(100, 20, 300, 30);
		name_tag.setBounds(40, 70, 90, 30);
		nameField.setBounds(140, 70, 100, 30);
		price_tag.setBounds(40, 120, 90, 30);
		priceField.setBounds(140, 120, 100, 30);
		submit.setBounds(40, 200, 90, 30);
		result.setBounds(100, 150, 300, 30);
		
		submit.addActionListener(
				(e) -> {
					if (priceField.getText().matches("[0-9]+(\\.[0-9][0-9])?")) {
						
						String newID = IdentProducer.newStr();
						result.setText( "The Item ID is: " + newID);

						supermarket.add(new Item(nameField.getText(), 
								BigDecimal.valueOf(Double.parseDouble(priceField.getText())),
								0, newID));
					}
					else {
						JOptionPane.showMessageDialog(title, "Invalid Price");
					}
					
				}
				);
	}
}
