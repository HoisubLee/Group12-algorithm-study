import java.util.Arrays;

public class algo02 {
    // arraylist 사용
    public static int[] solution(int[] arr, int divisor) {
        int count = 0;
        int total = 0;
        int[] answer = {};

        for(int i = 0; i < arr.length; i++) {
            if( arr[i]%divisor == 0) {
                total++;
            }
        }
        if (total == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            answer = new int[total];
            for(int i = 0; i < arr.length; i++) {
                if( arr[i]%divisor == 0) {
                    answer[count] = arr[i];
                    count++;
                }
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
