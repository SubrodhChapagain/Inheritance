import java.util.*;


/**
 * Write a description of class Songs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Songs
{
    public static void main(String[] args)
    {
        LinkedList<String> songs = new LinkedList<>();
        songs .add("Bohemain Rhapsody");
        songs .add("Blinding Lights");
        songs .add("Imagine");
        songs.addFirst("Billie Jean");
        songs.addLast("Rolling in the Deep");
        songs.remove(1);
        for (String song: songs)
        {  
            System.out.println(song);
        }
    }
}
