
package midtermexam_versiona_extensioncode;

/**
 *
 * @author bachn
 */
import java.util.Scanner;

public class TestUserprofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UserProfile placeHolder = new UserProfile("default","Comedy");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter your name: ");
        String name = input.nextLine();
        
        String[] genres = placeHolder.getGenres();
        
        System.out.println("Available genre: ");
        for (int i=0; i < genres.length; i++) {
            System.out.println(genres[i]);
        }
        
        System.out.print("\nPick yor favourite genre from above: ");
        String genre = input.nextLine();
        
        UserProfile u1 = new UserProfile(name, genre);
        
        System.out.println("Your profile has been created");
        
        
        
        
        
    }
    
}
