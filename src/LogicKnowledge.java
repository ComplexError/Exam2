import java.util.Scanner;
public class LogicKnowledge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //question 3
        System.out.println("input integers a, b, and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        System.out.println(greenTicket(a, b, c));

        //question 4
        System.out.println("input the quantity of choco:\n" +
                "small:\n" +
                "large:\n" +
                "sales goal:");
        int smolChoco = sc.nextInt();
        int largChoco = sc.nextInt();
        int chocoGoal = sc.nextInt();
        System.out.println(makeChocolate(smolChoco, largChoco, chocoGoal));
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }
        else if (a == b || b == c) {
            return 10;
        }
        else {
            return 0;
        }
    }

    public static int makeChocolate(int smolChoco, int largChoco, int chocogoal) {
        if (smolChoco + (largChoco * 5) < chocogoal) {
            return -1;
        }
        return chocogoal % 5;
    }
}
