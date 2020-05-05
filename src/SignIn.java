import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SignIn extends Supermarket {
	JLabel title;
	JTextField id;
	JLabel idIdentifier;
	JButton submitId;
	JButton guest;
	JButton newAccount;
	
	public SignIn() {
		title = new JLabel("Sign In Here!");
		id = new JTextField(40);
		idIdentifier = new JLabel("ID number:");
		submitId = new JButton("Log In");
		guest = new JButton("Order as Guest");
		newAccount = new JButton("Create a new Account here");
		
		title.setBounds(300, 20, 200, 30);
		id.setBounds(170, 70, 100, 30);
		idIdentifier.setBounds(60, 70, 100, 30);
		submitId.setBounds(300, 200, 200, 30);
		guest.setBounds(300, 300, 200, 30);
		newAccount.setBounds(300, 400, 200, 30);
		
		submitId.addActionListener((ActionEvent e) -> {
			if (super.getCustomers().contains(id.getText())
					|| super.getEmps().contains(id.getText())) {
				Test.clear();
				//Test.order(super.getItems());
			}
		});
	}
	public void add(JFrame f) {
		f.add(title);
		f.add(id);
		f.add(idIdentifier);
		f.add(submitId);
		f.add(guest);
		f.add(newAccount);
	}
}
