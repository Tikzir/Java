import java.util.Scanner;
 //works for inputs

//java = package; util = sub-package


class Main{

    public static void main (String[] args){
    System.out.println("HELLO WORLD");

//system is a class where it has all the access to the hardware


    Scanner keyboard = new Scanner(System.in);

    System.out.print("Ayo watchu name?");

    String name = keyboard.nextLine();
    
    System.out.println("hellow " + name);

    System.out.print("what's your height?");

    double  height = keyboard.nextDouble();

    System.out.print("whats your weight");

    double weight = keyboard.nextDouble();

    double height2 = height / 100;

    double imc = weight / (Math.pow(height2, 2));
    //printf sets the output format

    System.out.printf("your height in meters is: %.2f \n ", height2);

    System.out.printf("your imc is: %.2f \n", imc);
        

    if (imc <= 18.5){

        System.out.println("youre below the average");

    } else {

        if (imc >= 25){

            System.out.println("youre above the average");

        }
         else {
            System.out.println("youre on the average");
         }
    }

    keyboard.close();
    //closing the variable to avoid memory leaks
    
       }    
    }
