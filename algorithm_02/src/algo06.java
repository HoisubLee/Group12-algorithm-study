import java.util.*;
public class algo06 {
    public static int solution(int n) {
        int answer = 0;
        int length = 0;

        length = (int)(Math.log10(n)+1);

        for (int i = length; i > 0; i--) {
            double pow = Math.pow(10,i-1);
            int num = n / (int)pow;
            n -= num*pow;
            answer += num;
        }

        return answer;
    }
}
