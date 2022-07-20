import java.util.*;

public class algo21 {
    public static boolean isPrime (int n) {

        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i+1; j < nums.length - 1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) {
                        list.add(sum);
                    }
                }
            }
        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        return list.size();
    }

}
