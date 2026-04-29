 
import java.util.*;


/**
 * Write a description of class emails here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class emails
{
    public static void main(String[] args)
    {
        String[] emails={"alice@gmail.com","bob@gmail.com","alice@gmail.com","charlie@gmail.com"};
        String result= findFirstDuplicateEmail(emails);
        System.out.println(result);
    }
    public static String findFirstDuplicateEmail(String[] emails)
    {
        HashSet<String> seen = new HashSet<>();
       
        for(String email: emails)
        {
            if(seen.contains(email))
            {
                return email;
            }
            seen.add(email);
        }
        return null;
    }
}
