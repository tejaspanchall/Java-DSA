import java.util.*;

public class CountingOccurance {
    public static void main(String[] args) {

        int num = 123432333;
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 3) {
                count++;
            }
            num = num / 10;
        }
        System.err.print(count);
    }
}
