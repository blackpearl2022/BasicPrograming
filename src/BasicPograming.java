import java.util.Scanner;

public class BasicPograming {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int large;

        if (a>b)
            large = a;
        else
            large = b;
        if (c>large)
            large = c;
        System.out.println("Largest number among 3 numbers :"+ large);
    }
    }

