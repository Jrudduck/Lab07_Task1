import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for(int s = 30; s >= 0; s--) {
            System.out.print(s + " ");
        }
        System.out.println(" ");

        for(int t = 0; t <= 18; t += 3) {
            System.out.print(t + " ");
        }
        System.out.println(" ");

        for(int w = 10; w >= 0; w -= 2) {
            System.out.print(w + " ");
        }
    }
}