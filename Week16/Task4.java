package Week16;


public class Task4
{
    public void check (String ulc)
    {
        String upp = ulc.toUpperCase();
        System.out.println("upper case:"+ upp);
        
        String low = ulc.toLowerCase();
        System.out.println("Lower case:"+ low);
        
        //titlecase
        String[] words = ulc.split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for(String word: words)
        {
            String first = word.substring(0,1).toUpperCase();
            String rest = word.substring(1).toLowerCase();
            
            sb.append(first).append(rest).append(" ");
        }
        
        System.out.println(sb);
        
    }
    public static void main(String[]args)
    {
        Task4 obj = new Task4();
        
        obj.check("subrodh chapagain");
    
    }
} 