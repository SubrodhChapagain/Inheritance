package Week16;
import java.util.Arrays;


/**
 * Write a description of class CensusProcessor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CensusProcessor
{
    public static Student[] parseCSV(String[] csvData)
    {
       Student[] students = new Student[csvData.length -1]; 
       
       for(int i=1; i<csvData.length; i++)
       {
           String line = csvData[i]; // get every data in line form csv[1]="" into string i.e. single line
           
           String[] spl = line.split(",");
           for(int j=0; j<spl.length;j++)
           {
               spl[j] = spl[j].trim();
           }
           
           String name = spl[0];
           int age = Integer.parseInt(spl[1]);
           String school = spl[2];
           int grade = Integer.parseInt(spl[3]);
           String citizenship = spl[4];
           String phone = spl[5];
           
           students[i-1] = new Student(name,age,school,grade,citizenship,phone);
           
        }
        return students;
    }
    
        public static void main(String[] args) {
        
        String[] csvData = {
          "Name,Age,School,Grade,Citizenship,Phone",
           "Ram Bahadur Thapa,18,Itahari Int. College,12,01-0012345,9841234567",
             "Sita Kumari Rai,17,Itahari Int. College,11,01-0054321,9807654321",
           "Hari Prasad Sharma,19,ICK College,12,02-0098765,9812345678",
             "Gita Devi Tamang,16,ICP College,10,03-0011111,9800000000",
             "Bikash Kumar Limbu,18,Itahari Int. College,12,01-0077777,9841111111",
             "Anita Rai,17,ICK College,11,04-002222,981234",
            "Deepak Shah,20,ICP College,12,01-00ABCDE,9867890123"
                 };
        
        Student[] students = parseCSV(csvData);

        for (Student s : students) {
            System.out.println(s);
        }
        
        System.out.println(generateReport(students));
    }
    
    public static boolean isValidCitizenship(String cit)
    {
        if (cit.length() !=10)
        {
            return false;
        }
        
        if(cit.charAt(2)!= '-')
        {
            return false;
        }
        
        for(int i =0; i<2; i++)
        {
            if(!Character.isDigit(cit.charAt(i)))
            {
                return false;
            }
        }
        
        for(int i=3; i<10; i++)
        {
            if(!Character.isDigit(cit.charAt(i)))
            {
                return false;
            }
        }
        
        return true;
        
        //return cit.matches("\\d{2}-\\d{7}"); using regx
        
    }
    
    public void findBySchool(Student[] students, String school)
    {
        for (Student s: students)
        {
            if(s.getSchool().equalsIgnoreCase(school))
            {
                System.out.println(s); // if only name needed s.getName();
            }
        }
        
    }
    
    public void countByGrade(Student[] students, int grade)
    {
        int count =0;
        for(Student s: students)
        {
            if(s.getGrade() == grade)
            {
                count++;
            }
            
        }
        System.out.println("Number of students in grade " + grade + "is: " + count);
    }
    
       public static double averageAge(Student[] students) {
        double sum = 0;
         for (Student s : students) {
              sum += s.getAge(); 
        }
        return  (sum / students.length); 
    }
    
    public static String findLongestName(Student[] students)
    {
        Student longest = students[0];
        for(int i=1; i<students.length;i++)
        {
            if(students[i].getName().length()> longest.getName().length())
            {
                longest = students[i];
            }
        }
        return longest.getName();
    }
    
    public static String generateReport(Student[] students)
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("=============================================\n");
                   
        int total = students.length;
        int valid = 0;
        int invalid =0;
        
        for (Student s : students) 
        {
          if (isValidCitizenship(s.getCtzn()))
          {
            valid++;
           }
           else {
            invalid++;
           }
         }
         
        sb.append(String.format("Total Students: %d | Valid: %d | Invalid: %d\n\n", total, valid, invalid));
          
        for (Student s : students) 
        {
            String initial = s.getNameInitials();
            String check = isValidCitizenship(s.getCtzn())?"valid" : "Invalid";
            
            sb.append(String.format("%-10s %-25s %-5d %-7d %-10s\n",
            initial,
            s.getName(),
            s.getAge(),
            s.getGrade(),
            check));
            
        }
        
        double avg = averageAge(students);
        String longest = findLongestName(students);
        sb.append(String.format("Average age: %.2f\n", avg));
        sb.append (String.format("Longest name: %S\n",longest));
        
        return sb.toString();
    }
    
} 