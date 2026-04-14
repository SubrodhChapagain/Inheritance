package week21.week21;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.*;

public class EmploymentManagementSystem extends JFrame
{
    String[]button = {"Add Employment","View Emp","update","Delete","Search"};
    JPanel sideBar, main, header, display,footer;
    
    JPanel form, row1, row2, row3, row4, row5,row6;
    
    JButton btn;
    
    JTextArea displayArea;
    
    JLabel name, salary;
    JTextField nametxt, salarytxt;
    
    JLabel headerLbl, countLabel, mouseCoordinate;

    
    private JRadioButton full, part, contract;
    private ButtonGroup bg;
    private JLabel empType;
    
    
    private JCheckBox healthI, dentalI, retirementI;
    
    private JComboBox<String> departmentBox;
    
    
    public EmploymentManagementSystem()
    {
        setTitle("EmploymentManagementSystem");
        setSize(400,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        
        header = new JPanel();
        
        headerLbl = new JLabel("Employee Management System",JLabel.CENTER);
        header.setBackground(new Color(71,130,200));
        headerLbl.setForeground(Color.WHITE);
        header.add(headerLbl );
        
        
        
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void  mouseEntered(MouseEvent e)
            {
             header.setBackground(new Color(246,202,67));
             headerLbl.setText("Employee Records View");
            }
            
            @Override
            public void  mouseExited(MouseEvent e)
            {
             header.setBackground(new Color(71,130,200));
             headerLbl.setText("Employee Management System");
            }
            
        
        });
        
        add(header,BorderLayout.NORTH);
        
        sideBar = new JPanel();
        sideBar.setLayout(new BoxLayout(sideBar, BoxLayout.Y_AXIS));
        sideBar.setBorder(BorderFactory.createEmptyBorder(30, 10, 10, 20));
        
        for (String buttons: button)
            {
            btn = new JButton(buttons);
            btn.setMaximumSize(new Dimension(100,40));
            btn.setFocusable(false);
        
            if(buttons.equals("Add Employment"))
            {
                btn.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                         try{
                        String name = nametxt.getText();
                        if(name.isEmpty() || name.equalsIgnoreCase("Enter your name"))
                       {
                            throw new IllegalArgumentException("Name field cannot be empty");
                       }
                        
                        
                        String txtSalary = salarytxt.getText();
                        
                        for(char ch: txtSalary.toCharArray())
                        {
                            if(!Character.isDigit(ch) && Integer.parseInt(txtSalary)> 0)
                            {
                                throw new NumberFormatException("salary cannot be in alphabet");
                            }
                        }
                        
                        int salary= Integer.parseInt(txtSalary);
        
                        String type = "";
                        if(full.isSelected()) type = "Full Time";
                        else if(part.isSelected()) type = "Part Time";
                        else if(contract.isSelected()) type = "Contract";
        
                        String benefits = "";
                        if(healthI.isSelected()) benefits += "Health ";
                        if(dentalI.isSelected()) benefits += "Dental ";
                        if(retirementI.isSelected()) benefits += "Retirement ";
        
                        String department = departmentBox.getSelectedItem().toString();
        
                        displayArea.setText(
                                "Name: " + name + "\n" +
                                "Salary: " + salary + "\n" +
                                "Type: " + type + "\n" +
                                "Benefits: " + benefits + "\n" +
                                "Department: " + department
                        );
                    }
                    
                      catch(NumberFormatException n)
                      {
                          JOptionPane.showMessageDialog(null, n.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
                        }
                    catch(IllegalArgumentException ev)
                    {
                        JOptionPane.showMessageDialog(null, ev.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
                    }
                    catch(Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
                    }
                
                
                
                }
                    
                       
                });
            }
        
            sideBar.add(btn);
            sideBar.add(Box.createVerticalStrut(10));
            add(sideBar, BorderLayout.WEST);
        }
        
        
        
        
        main = new JPanel();
        
        
        form = new JPanel();
        form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
        
        row1 = new JPanel();
        
        name = new JLabel("Full Name: ");
        
        nametxt = new JTextField(14);
        nametxt.setText("Enter your name");
        
        nametxt.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                if(nametxt.getText().equalsIgnoreCase("Enter your name"))
                {
                    nametxt.setText("");
                }
            }
            
            @Override
            public void focusLost(FocusEvent e)
            {
                if(nametxt.getText().equalsIgnoreCase(""))
                {
                    nametxt.setText("Enter your name");
                }
            }
        
        });
        
        
        
        nametxt.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                int counter = nametxt.getText().length();
                countLabel.setText("Character count: "+counter);
               }
            }
        });
        
        form.add(row1);
        row1.add(name);
        row1.add(Box.createHorizontalStrut(25));
        row1.add(nametxt);
        row1.setBackground(Color.WHITE);
        
        
        
        
        
        row2 = new JPanel();
        salary = new JLabel("Salary");
        salarytxt = new JTextField(14);
        
        
        
        form.add(row2);
        row2.add(salary);
        row2.add(Box.createHorizontalStrut(45));
        row2.add(salarytxt);
        row2.setBackground(Color.WHITE);
        
        
        
        
        row3 = new JPanel();
        empType = new JLabel("Employment Type");
        full = new JRadioButton("Full Time");
        part = new JRadioButton("Part Time");
        contract = new JRadioButton("Contract");
        
        bg = new ButtonGroup();
        bg.add(full);
        bg.add(part);
        bg.add(contract);
        
        form.add(row3);
        row3.add(empType);
        row3.add(Box.createHorizontalStrut(10));
        row3.add(full);
        row3.add(part);
        row3.add(contract);
        
        
        
        row4 = new JPanel();
        JLabel cb = new JLabel("Benefits: ");
        healthI = new JCheckBox("Healh Insurance");
        dentalI = new JCheckBox("Dental Insurance");
        retirementI = new JCheckBox("Retirement Insurance");
        
        
        form.add(row4);
        row4.add(cb);
        row3.add(Box.createHorizontalStrut(10));
        row3.add(full);
        row4.add(healthI);
        row4.add(dentalI);
        row4.add(retirementI);
        
        row5 = new JPanel();
        JLabel deplbl = new JLabel("Department ");
        String[] courses={"Computing","AI", "Multimedia", "Networking"};
        departmentBox = new JComboBox<>(courses);
        row5.add(deplbl);
        row5.add(Box.createHorizontalStrut(10));
        row5.add(departmentBox);
        form.add(row5);
        
        
        
    
        
        
        main.add(form);
        add(main,BorderLayout.CENTER);
        
        display = new JPanel();
        display.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        displayArea = new JTextArea(6,40);
        displayArea.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(displayArea);
        
        display.add(displayArea);
        display.add(scrollPane,new FlowLayout(FlowLayout.RIGHT));
        add(display,BorderLayout.EAST);
        
        
        
        
        
        
        
        
        
        
        
        footer = new JPanel();
        
        footer .setLayout(new BoxLayout( footer , BoxLayout.Y_AXIS));
        footer .setBorder(BorderFactory.createLineBorder(Color.BLACK));

        countLabel= new JLabel("Characters: 0");
        countLabel.setFont(new Font("Arial", Font.BOLD, 14));

        mouseCoordinate= new JLabel("Mouse Position: 0,0");
        mouseCoordinate.setFont(new Font("Arial", Font.BOLD, 14));

         footer .add(mouseCoordinate);
         footer .add(countLabel);
        
         
         
         
         addMouseMotionListener(new MouseMotionAdapter()
        {
            @Override
            public void  mouseMoved(MouseEvent e)
            {
                mouseCoordinate.setText("Mouse Position: "+e.getX()+""+e.getY());
                 
            }
            
            @Override
            public void  mouseDragged(MouseEvent e)
            {
                mouseCoordinate.setText("Mouse Position: "+e.getX()+""+e.getY());
                
            }
        
        });
        
        add(footer,BorderLayout.SOUTH);
        
        
        pack();
    }
    
    
    
    
    public static void main(String[]args)
    {
        SwingUtilities.invokeLater(() ->
        {
            new EmploymentManagementSystem().setVisible(true);
        
        });
    }
}