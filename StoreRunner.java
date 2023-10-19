import java.util.Scanner;

public class StoreRunner {
    public static void main(String[] args) {

        // Creates a Scanner object - feel free to delete if not using!
        Scanner input = new Scanner(System.in);


        Cookie oatmeal = new Cookie("oatmeal", 3.75, true);
        System.out.println(oatmeal);



        // Closes the Scanner object
        input.close();

    }
}