import javax.swing.JOptionPane;

/**
 * This simple program will perform a loop 7 times. 
 * It will ask the user to enter a number each time.
 * The numbers will be summed up using an accumulator variable.
 */

public class loopAccumulator
{
  public static void main(String[] args)
  {
    int accum = 0; // Accumulator variable initialized to 0.
    int number;    // Number inputted by user.
    int controlLoop; // Loop control variable.
    String keyInput; // Input from JOptionPane.
    
    for (controlLoop = 1; controlLoop <= 7; controlLoop++)
    {
      // Prompt the user for a number
      keyInput = JOptionPane.showInputDialog("Enter a number.");
      number = Integer.parseInt(keyInput);
      accum += number;      
      // System.out.println(number + " " + controlLoop);      
    }    
    
    // Display the sum of numbers entered.
    JOptionPane.showMessageDialog(null, "The sum of the numbers you entered is: " + accum + ".");
       
    System.exit(0);
  }
}
