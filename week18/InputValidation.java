package week18;
import javax.swing.*;

public class InputValidation extends JFrame
{
    JTextField txtName, txtAge, txtPhone;
    
    public InputValidation()
    {
        setTitle("Input Validation");
        setSize(500,400);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,50,50,50); //x,y,width,height
        
        JLabel name = new JLabel("Name");
        name.setBounds(50, 30, 80,30);
        panel.add(name);
        
        txtName = new JTextField();
        txtName.setBounds(120,30,130,30);
        panel.add(txtName);
        
        JLabel age = new JLabel("Age");
        panel.add(age);
        age.setBounds(50, 90, 80, 30);
        
        txtAge = new JTextField();
        panel.add(txtAge);
        txtAge.setBounds(120, 90, 130, 30);
        
        JLabel phone = new JLabel("Phone");
        panel.add(phone);
        phone.setBounds(50,150, 80,30);
        
        txtPhone = new JTextField();
        panel.add(txtPhone);
        txtPhone.setBounds(120,150,130,30);
        
        JButton submit = new JButton("Submit");
        panel.add(submit);
        submit.setBounds(150, 220, 100 ,30);
        
        submit.addActionListener(e -> validateInput());
        
        add(panel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
     private void validateInput()
    {
        String name = txtName.getText().trim();
        String ageText = txtAge.getText().trim();
        String phone = txtPhone.getText().trim();

        // 1. Presence validation
        if(name.isEmpty() || ageText.isEmpty() || phone.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"All fields are required!");
            return;
        }

        // 2. Type validation (Age must be numeric)
        if(!ageText.matches("\\d+")) {
         JOptionPane.showMessageDialog(this, "Age must be a number!");
         return;
        }
         
        int age = Integer.parseInt(ageText);
     
        // 3. Range validation
        if(age < 1 || age > 120)
        {
            JOptionPane.showMessageDialog(this,"Age must be between 1 and 120.");
            return;
        }

        // 4. Phone validation using Regex
        if(!phone.matches("\\d{10}"))
        {
            JOptionPane.showMessageDialog(this,"Phone number must be 10 digits.");
            return;
        }

        JOptionPane.showMessageDialog(this,"Validation Successful!");
    }

    public static void main (String[]args)
        {
            SwingUtilities.invokeLater(() ->
            {
               InputValidation obj = new InputValidation();
               obj.setVisible(true);
             });
    }
}