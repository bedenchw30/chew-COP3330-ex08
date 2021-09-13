import java.util.Scanner;
public class Exerciseeight {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt();

        int totalSlices = pizzas*slices;

        System.out.println(people + " people with " + pizzas + " pizzas (" + totalSlices +" slices)");
        System.out.println("Each person gets " + totalSlices/people + " pieces of pizza.");
        System.out.println("There are " + (totalSlices%people) + " leftover pieces. ");


    }
}
