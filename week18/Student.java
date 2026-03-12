package week18;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Student {

    // Student attributes
    private int id;
    private String name;
    private String gender;
    private String skill;
    private String course;

    // List to store all students
    static ArrayList<Student> studentList = new ArrayList<>();


    // Constructor to create a student
    public Student(int id, String name, String gender, String skill, String course) {

        this.id = id;
        this.name = name;
        this.gender = gender;
        this.skill = skill;
        this.course = course;
    }


    // Getter methods
    public int getId(){ return id; }

    public String getName(){ return name; }

    public String getGender(){ return gender; }

    public String getSkill(){ return skill; }

    public String getCourse(){ return course; }



    // Add student if ID is unique
    public static void addStudent(Student student){

        for(Student s : studentList){

            if(s.getId() == student.getId()){
                System.out.println("ID already exists");
                return;
            }
        }

        studentList.add(student);
    }



    // Delete student using ID
    public static void deleteStudent(int id){

        for(Student s : studentList){

            if(s.getId() == id){
                studentList.remove(s);
                return;
            }
        }
    }

    
    
    // GUI PART
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration System");
        frame.setSize(700,500);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Form Panel
        JPanel form = new JPanel(new GridLayout(5,2));

        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();

        JComboBox<String> course =
                new JComboBox<>(new String[]{"BSc","BBA","BIT"});


        // Gender
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);


        // Skills
        JCheckBox java = new JCheckBox("Java");
        JCheckBox python = new JCheckBox("Python");

        JPanel skillPanel = new JPanel();
        skillPanel.add(java);
        skillPanel.add(python);


        form.add(new JLabel("Student ID"));
        form.add(idField);

        form.add(new JLabel("Student Name"));
        form.add(nameField);

        form.add(new JLabel("Course"));
        form.add(course);

        form.add(new JLabel("Gender"));
        form.add(genderPanel);

        form.add(new JLabel("Skills"));
        form.add(skillPanel);



        // Buttons
        JPanel buttons = new JPanel();

        JButton submit = new JButton("Submit");
        JButton reset = new JButton("Reset");
        JButton search = new JButton("Search");
        JButton delete = new JButton("Delete");

        buttons.add(submit);
        buttons.add(reset);
        buttons.add(search);
        buttons.add(delete);



        // JTable
        String[] columns = {"ID","Name","Course","Gender","Skill"};

        DefaultTableModel model =
                new DefaultTableModel(columns,0){

                    public boolean isCellEditable(int r,int c){
                        return false;
                    }
                };

        JTable table = new JTable(model);

        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scroll = new JScrollPane(table);


        frame.add(form,BorderLayout.NORTH);
        frame.add(buttons,BorderLayout.CENTER);
        frame.add(scroll,BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
