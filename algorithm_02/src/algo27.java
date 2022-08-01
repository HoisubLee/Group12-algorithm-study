import java.util.Arrays;

public class algo27 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (budget - d[i] >= 0) {
                budget = (budget - d[i]);
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}

//최장길이수열 LIS