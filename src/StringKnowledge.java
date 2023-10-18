import java.util.Scanner;
public class StringKnowledge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //question 1
        System.out.println("input String A");
        String a = sc.nextLine();
        System.out.println("input String B");
        String b = sc.nextLine();
        if (endOther(a, b)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
    public static boolean endOther(String a, String b) {
        if (a.toLowerCase().contains(b.toLowerCase())) {
            return a.toLowerCase().indexOf(b.toLowerCase()) == (a.length() - b.length());
        }
        else if (b.toLowerCase().contains(a.toLowerCase())) {
            return b.toLowerCase().indexOf(a.toLowerCase()) == (b.length() - a.length());
        }
        else {
            return false;
        }
    }
}