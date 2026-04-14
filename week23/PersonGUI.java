package week23;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PersonGUI extends JFrame
{
    private JTextField txtName, txtAge, txtExtra;
    private JComboBox<String> typeBox;
    private JTextArea outputArea;
    
    private ArrayList<Person> persons= new ArrayList<>();

    public PersonGUI()
    {
        setTitle("Person Management System");
        setSize(500,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));

        JPanel formPanel = new JPanel(new GridLayout(4,2,8,8));
        formPanel.setBorder(BorderFactory.createTitledBorder("Enter Details"));

        formPanel.add(new JLabel("Name:"));
        txtName = new JTextField();
        formPanel.add(txtName);

        formPanel.add(new JLabel("Age:"));
        txtAge = new JTextField();
        formPanel.add(txtAge);

        formPanel.add(new JLabel("Type:"));
        typeBox = new JComboBox<>(new String[]{"Student","Teacher"});
        formPanel.add(typeBox);

        formPanel.add(new JLabel("Course / Subject:"));
        txtExtra = new JTextField();
        formPanel.add(txtExtra);

        add(formPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();

        JButton btnCreate = new JButton("Create Object");
        JButton btnRole = new JButton("Show Roles");
        JButton btnLecture = new JButton("Take Lecture");

        buttonPanel.add(btnCreate);
        buttonPanel.add(btnRole);
        buttonPanel.add(btnLecture);

        add(buttonPanel, BorderLayout.CENTER);


        outputArea = new JTextArea(10,30);
        outputArea.setEditable(false);

        add(new JScrollPane(outputArea), BorderLayout.SOUTH);


        btnCreate.addActionListener(e -> createPerson());
        btnRole.addActionListener(e -> performRole());
        btnLecture.addActionListener(e -> takeLectures());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createPerson()
    {
        try{
        outputArea.setText("");
        //txtName, txtAge, txtExtra, typeBox outputArea
        String name = txtName.getText();
        if(name.isEmpty())
        {
            throw new IllegalArgumentException("Name field cannot be empty");
        }
        
        
        String age = txtAge.getText();
        for(char ch: age.toCharArray())
        {
            if(!Character.isDigit(ch))
            {
                throw new NumberFormatException("Age cannot be in alphabet");
            }
        }
        int ageValue = Integer.parseInt(age);
        if (ageValue < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
         }
        
         
        String type =  typeBox.getSelectedItem().toString();
        String subject = txtExtra.getText();
        if(subject.isEmpty())
        {
            throw new IllegalArgumentException("This field cannot be empty");
        }
     
        if(type.equals("Student")) {
            persons.add(new Student(name, ageValue, subject));
        } else {
            persons.add(new Teacher(name, ageValue, subject));
        }
        
        }
        
        catch(NumberFormatException ee)
             {
                 JOptionPane.showMessageDialog(this, ee.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
                  txtExtra.requestFocus();
                }
        catch(IllegalArgumentException e)
         {
            JOptionPane.showMessageDialog(this,e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
          }
        catch(Exception ex)
             {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
              }
    }


    private void performRole()
    {
        outputArea.setText("");
        for(Person p : persons){
            if(p instanceof Teacher teacher) {
                outputArea.append(teacher.performRole());
            }
            
            if(p instanceof Student s) {
                outputArea.append(s.performRole());
            }
        }
    }

    private void takeLectures()
    {
        //teacher
        outputArea.setText("");
        for(Person p : persons) {
            if(p instanceof Teacher teacher) {
                //teacher.takeLecture();
                outputArea.append(teacher.takeLecture());
            }
        }
    }

    private void clearFields()
    {
        txtName.setText("");
        txtAge.setText("");
        txtExtra.setText("");
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
            new PersonGUI().setVisible(true);
        });
    }
}
