import javax.swing.*;
import java.awt.event.*;

public class NewCustomer {
	private JLabel title;
	private JLabel name_tag;
	private JButton submit;
	private JTextField nameField;
	private JLabel result;
	
	public void add(JFrame f) {
		f.add(nameField);
		f.add(title);
		f.add(name_tag);
		f.add(submit);
		f.add(result);
	}
	
	public NewCustomer(Supermarket supermarket) {
		title = new JLabel("Create New Account");
		name_tag = new JLabel("Name:");
		submit = new JButton("Submit");
		nameField = new JTextField();
		result = new JLabel();
		
		title.setBounds(100, 20, 300, 30);
		name_tag.setBounds(40, 70, 90, 30);
		submit.setBounds(40, 200, 90, 30);
		nameField.setBounds(140, 70, 100, 30);
		result.setBounds(100, 150, 300, 30);
		
		submit.addActionListener(
				(e) -> {
					String newID = IdentProducer.newStr();
					result.setText(
							"Your ID is: " + newID);
					supermarket.add(new Customer(newID, nameField.getText()));
				}
				);
	}
}
