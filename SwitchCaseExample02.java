import java.util.Scanner;

public class SwitchCaseExample02 {
    public static void main(String[] args) {
        String level=null;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Level: ");
        level = input.next();

        switch(level)
        {
            case "Beginner":
                System.out.println("You need to go for training.");
                break;
            case "Intermediate":
                System.out.println("You don't need to go for training.");
                break;
            case "Expert":
                System.out.println("You are invited to train our people.");
                break;
            default:
                System.out.println("You don't belong here!!!");
        }
                
        input.close();
    }
}
