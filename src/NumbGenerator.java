import java.util.*;

public class NumbGenerator {

    public static void main(String[] args) {

        int attempt;
        int numb;
        int count = 0;

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        Random rnd1 = new Random();

        System.out.println("Guess up the number, its between 1 and 100!");
        System.out.println("Enter your number, please : ");

        attempt = input.nextInt();
        numb = rnd.nextInt(100) + 1;

            while (numb > attempt || numb < attempt) {

                    if (numb > attempt) {
                        System.out.println("Maybe try a smaller one");
                        System.out.print("The number was: " + rnd.nextInt(99)+ "\n");
                        numb = rnd1.nextInt(100) + 1;

                    } else {
                        System.out.println("Maybe try a bigger one");
                        System.out.println("The number was: " + rnd.nextInt(99)+"\n");
                        numb = rnd1.nextInt(100) + 1;

                    }

                attempt = input.nextInt();
                count++;
            }

        if (numb == attempt) {

            count++;
        }
        System.out.println("Wow, you guess it from " + count + "  attempts. Congrats!");
    }
}