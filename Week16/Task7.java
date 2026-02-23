package Week16;

public class Task7
{
    public boolean isValidPhone(String phone)
    {
        return phone.matches("(98|97)\\d{8}");
    }
    
    public static void main(String[] args)
    {
        Task7 hi = new Task7();
        System.out.println(hi.isValidPhone("9876542990"));
    }
}