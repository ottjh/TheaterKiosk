import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //"Note that the program does nothing if they are not 21 or over…"
        //We aren't making a failure state here? Okay, but it feels wrong.
        //declare int customerAge = 0;
        //output "Please enter your age: "
        //scanner input and test age to be valid integer
        //if age>=21 then output "You have entered: " + customerAge + ". You are over 21. You get a wristband."
        Scanner in = new Scanner(System.in);
        int customerAge = 0;
        String trash = "";

        System.out.print("Please enter your age in numeric digits: ");
        //Now to test if it's an integer
        if(in.hasNextInt())
        {
            customerAge = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Please start over and enter an age in numeric digits not : " + trash + ".");
        }

        //Now to test if they are over 21
        if (customerAge >= 21)
        {
            System.out.println("You have entered: " + customerAge + ". You are 21 or older. You get a wristband.");
        }
        //For my own sanity, I am including what would've been done in a failure state
        //else
        //{
            //System.out.println("You have entered: " + customerAge + ". You are not old enough.");
        //}
    }
}