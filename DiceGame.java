import java.util.Scanner;
import java.util.Random;
public class DiceGame {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int total = 0;
        System.out.println("Enter the # of dice");
        int trial = scanner.nextInt();
        if (trial > 0) {
            for (int i = 0; i < trial; i++) {
                int roll = random.nextInt(1, 7);
                dieroll(roll);
                System.out.println("you roll number "+roll+" dice");
                total += roll;
            }

            System.out.println("The total of rollling is " + total);

        } else {
            System.out.println("you enter invaid number");
        }
    }
    static void dieroll(int roll){
        String dice1= """
                
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                
           
                """;

        String dice2= """
                
                 -------
                |       |
                | ●   ● |
                |       |
                 -------
                
           
                """;
        String dice3= """
                
                 -------
                | ●     |
                |   ●   |
                |      ●|
                 -------
                
           
                """;
        String dice4= """
                
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                
           
                """;
        String dice5= """
                
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                
           
                """;
        String dice6= """
                
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                
           
                """;
        if(roll==1){
            System.out.printf("you rolling dice number is %d:%s",roll,dice1);

        }
      else  if(roll==2){
            System.out.printf("you rolling dice number is %d:%s",roll,dice2);

        }
       else  if(roll==3){
            System.out.printf("you rolling dice number is %d:%s",roll,dice3);


        }
       else if(roll==4) {
            System.out.printf("you rolling dice number is %d:%s", roll, dice4);
        }
             else if (roll==5) {
                System.out.printf("you rolling dice number is %d:%s", roll, dice5);
            } else if (roll == 6) {
                System.out.printf("you rolling dice number is %d:%s", roll, dice6);
            }
            else{
                System.out.println("wrong");
            }
        }}
