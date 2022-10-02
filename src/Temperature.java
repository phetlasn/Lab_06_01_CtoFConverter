import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        String trash;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        if(in.hasNextDouble()) {
            celsius = in.nextDouble();
            in.nextLine();
            fahrenheit = (celsius * 1.8) + 32;
            System.out.printf("The temperature in fahrenheit is %.2f%n",fahrenheit);

        }else {
            trash = in.nextLine();
            System.out.println("Invalid temperature entered: " + trash);
        }


    }
}
