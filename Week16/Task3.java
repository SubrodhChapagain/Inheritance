package Week16;


public class Task3
{
    public void find(String word)
    {
        word = "Hello World";
        
        int ind = word.indexOf("o");
        System.out.println("Index of 'o': " + ind);
        
        boolean cont= word.contains("World");
        System.out.println("contains world "+ cont);
        
        char at = word.charAt(4);
        System.out.println("Word at 4: "+at);
        
    }
    public static void main(String[]args)
    {
        Task3 obj =  new Task3();
        
        obj.find("Hello world");
    }
}