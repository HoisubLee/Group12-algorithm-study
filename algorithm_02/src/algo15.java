import java.util.*;

public class algo15 {
    public static int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++ ) {
                if(arr[i] != arr[j]) {
                    list.add(arr[j]);
                    i = j;
                }
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}
