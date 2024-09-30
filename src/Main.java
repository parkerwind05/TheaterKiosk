import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        int age = 0;
        System.out.println("Enter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();
            if(age>=21)
            {
                System.out.println("You are 21 or over. You get a wristband.");
            }

        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash + ", not your age!");
            System.out.println("Run the program again with correct input.");
        }
    }
}