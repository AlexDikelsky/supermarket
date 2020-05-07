import javax.swing.*;
import java.awt.event.*;

public class NewEmployee {
	private JLabel title;
	private JLabel name_tag;
	private JTextField nameField;
	private JLabel dept_tag;
	private JTextField deptField;
	private JButton submit;
	private JLabel result;
	
	public void add(JFrame f) {
		f.add(nameField);
		f.add(title);
		f.add(name_tag);
		f.add(submit);
		f.add(result);
		f.add(deptField);
		f.add(dept_tag);
	}
	
	public NewEmployee(Supermarket supermarket) {
		title = new JLabel("Create New Department");
		name_tag = new JLabel("Name:");
		nameField = new JTextField();
		dept_tag = new JLabel("Dept ID :");
		deptField = new JTextField();
		submit = new JButton("Submit");
		result = new JLabel();
		
		title.setBounds(100, 20, 300, 30);
		name_tag.setBounds(40, 70, 90, 30);
		nameField.setBounds(140, 70, 100, 30);
		dept_tag.setBounds(40, 120, 90, 30);
		deptField.setBounds(140, 120, 100, 30);
		submit.setBounds(40, 200, 90, 30);
		result.setBounds(100, 150, 300, 30);
		
		submit.addActionListener(
				(e) -> {
					Department d = new Department(deptField.getText());
					if (supermarket.contains(d)) {
						String newID = IdentProducer.newStr();

						supermarket.add(new Employee(nameField.getText(), newID, d));										
						result.setText( "The Employee ID is: " + newID);
					}
					else {
						JOptionPane.showMessageDialog(title, "Invalid Department ID");
					}
					
				}
				);
	}
}
