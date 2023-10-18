import java.util.Arrays;
import java.util.Scanner;
public class ArrayKnowledge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //question 5
        System.out.println("input String");
        String string = sc.nextLine();
        System.out.println(Arrays.toString(stringToArray(string)));

        //question 6
        System.out.println("input: start, stop, and step");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int step = sc.nextInt();
        System.out.println(Arrays.toString(generateArrayWithBounds(start, end, step)));
    }
    public static char[] stringToArray(String string) {
        char[] charArray = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            charArray[i] = string.charAt(i);
        }
        return charArray;
    }
    public static int[] generateArrayWithBounds(int start, int end, int step) {
        //this part was a little annoying
        double bounds = ((double) (end - start) / step);
        bounds = Math.ceil(bounds);
        int length = 0;
        int[] boundArray = new int[(int) bounds];
        while (length < bounds) {
            boundArray[length] = start;
            start = start + step;
            length++;
        }
        return boundArray;
    }
}
