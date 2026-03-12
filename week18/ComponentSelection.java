package week18;
import javax.swing.*;

public class ComponentSelection extends JFrame
{
  public ComponentSelection()
  {
      setTitle("Component Selection");
      setSize(500,500);
      
      JPanel panel = new JPanel();
      panel.setLayout(null); 
      panel.setBounds(20,30,400,400);
      
      JLabel name = new JLabel("Student Name");
      name.setBounds(50,50,100,30);
      
      JTextField txt = new JTextField();
      txt.setBounds(150,50,100,30);
      
      JLabel age = new JLabel("Age");
      age.setBounds(50,100,100,30);
      
      JTextField ageTxt = new JTextField();
      ageTxt.setBounds(150,100,150,30);
      
      JLabel number = new JLabel("Phone Number");
      number.setBounds(50,150,100,30);

      JTextField numTxt = new JTextField();
      numTxt.setBounds(150,150,150,30);
      
      JLabel genderLabel = new JLabel("Gender");
      genderLabel.setBounds(50,200,100,30);
      panel.add(genderLabel);

      JRadioButton male = new JRadioButton("Male");
      male.setBounds(150,200,80,30);

      JRadioButton female = new JRadioButton("Female");
      female.setBounds(230,200,80,30);   
       panel.add(male);
      panel.add(female);
      
      ButtonGroup bg = new ButtonGroup();
      bg.add(male);  //ButtonGroup Only one radio button can be selected at a time
      bg.add(female);
      
     
      JLabel hobbyLabel = new JLabel("Hobbies");
      hobbyLabel.setBounds(50,250,100,30);
      
      JCheckBox hobbie1 = new JCheckBox("Reading");
      hobbie1.setBounds(150,250,100,30);
      
      JCheckBox hobbie2 = new JCheckBox("Swimming");
      hobbie2.setBounds(250,250,100,30);
       
      JCheckBox hobbie3 = new JCheckBox("Coding");
      hobbie3.setBounds(150,280,100,30);
      
      JCheckBox hobbie4 = new JCheckBox("Sleeping");
      hobbie4.setBounds(250,280,100,30);
      
      panel.add(hobbyLabel);
      panel.add(hobbie1);
      panel.add(hobbie2);
      panel.add(hobbie3);
      panel.add(hobbie4);
      
      
      JLabel deptLabel = new JLabel("Department");
      deptLabel.setBounds(50,330,100,30);
      panel.add(deptLabel);
      
      String dept[] = {
         "HR",
         "Finance",
         "IT",
         "Marketing",
         "Sales",
         "Administration",
         "Customer Support",
         "Logistics",
         "Research",
         "Development",
         "Legal",
        "Operations"
      };
        // for java combo we use array to store predefinde datas...
      JComboBox deptBox = new JComboBox(dept);
      deptBox.setBounds(150,330,150,30);

      panel.add(deptBox);
      
      add(panel);
      panel.add(name);
      panel.add(txt);
      
      panel.add(age);
      panel.add(ageTxt);
      
      panel.add(number);
      panel.add(numTxt);
      
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
    }
    
    public static void main (String[]args)
        {SwingUtilities.invokeLater(() ->
        {
            ComponentSelection obj = new ComponentSelection();
           obj.setVisible(true);
         });
    }
}