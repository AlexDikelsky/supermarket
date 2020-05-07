import javax.swing.*;
import java.awt.event.*;

public class SignIn {
	JLabel title;
	JTextField id;
	JLabel idIdentifier;
	JButton submitId;
	JButton newAccount;
	Supermarket supermarket;
	
	public SignIn(Supermarket supermarket) {
		this.supermarket = supermarket;
		
		title = new JLabel("Sign In Here!");
		id = new JTextField(40);
		idIdentifier = new JLabel("ID number:");
		submitId = new JButton("Log In");
		newAccount = new JButton("Create a new Account here");
		
		title.setBounds(300, 20, 200, 30);
		id.setBounds(170, 70, 100, 30);
		idIdentifier.setBounds(60, 70, 100, 30);
		submitId.setBounds(300, 200, 200, 30);
		newAccount.setBounds(300, 400, 250, 30);

		newAccount.addActionListener(
				(asdf) -> {
					Test.newObj(supermarket, Thing.CUSTOMER);
				});
		
		submitId.addActionListener((ActionEvent hlsadf) -> {
			if (supermarket.contains(new Customer(id.getText()))) {
				Test.order(this.supermarket);
			}
			else if ( supermarket.contains(new Employee(id.getText()))) {
				Test.pick(this.supermarket);
			}
			else {
				JOptionPane.showMessageDialog(title, "Unrecognized ID");
			}
		});
	}
	
	public void add(JFrame f) {
		f.add(title);
		f.add(id);
		f.add(idIdentifier);
		f.add(submitId);
		f.add(newAccount);
	}
}
