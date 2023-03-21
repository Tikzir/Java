import java.util.Scanner;

public class basketball {
    public static void main (String[] args){

//FIRST====================================================

players Player1 = new players();

//SECOND ==================================================

players Player2 = new players("Silv", "Gon", 1.53, 18, 20, "pivot");

//Third ==================================================

players Player3 = new players();

Player3.setname("Karen");
Player3.setLastName("Carter");
Player3.setHeight(1.66);
Player3.setAge(20);
Player3.setDorsal(90);
Player3.setPosition(30);

//KEYBOARD

Scanner keyboard = new Scanner(System.in);

System.out.println("Enter the players name");
Player1.setName(keyboard.nextLine());

System.out.println("Enter the players name");
Player1.setLastName(keyboard.nextLine());

System.out.println("Enter the players name");
Player1.setHeight(keyboard.nextDouble());

System.out.println("Enter the players name");
Player1.setAge(keyboard.nextInt());

System.out.println("Enter the players name");
Player1.setDorsal(keyboard.nextInt());

System.out.println("Enter the players name");
Player1.setPosition(keyboard.nextLine());


keyboard.close();

System.out.println(Player1);
    }
}
