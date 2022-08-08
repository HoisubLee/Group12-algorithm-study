package Programmers;

import java.util.HashSet;

public class Pro1845 {
    // 폰켓몬
    // N/2마리를 선택하는데 최대한 많은 종류의 폰켓몬을 선탟했을 때의 값을 리턴
    public static int solution(int[] nums) {
        int answer = 0;
        // 선택하는 폰켓몬 마리 수
        int picknum = nums.length/2;

        //HashSet을 이용하여 중복 값을 제거하여 저장.
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int num : nums) {
            hs.add(num);
        }
        answer = hs.size();

        // N/2마리를 선택하는데 중복되는 값이 더 많다면(종류가 없다면)
        // 해당 결과를 return
        // 종류가 많다면 N/2마리 선택한 것이 최대값이기 때문에 해당값 리턴
        if (answer < picknum) {
            return answer;
        } else {
            return picknum;
        }
    }
}
