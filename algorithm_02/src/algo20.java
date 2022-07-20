import java.util.*;

public class algo20 {
    //문자열 내림차순으로 배치하기
    public static String solution(String s) {
        //Collections.reverseOrder() 를 써서 정말 내림차순을 했다..
        String answer = "";
        Character[] array = new Character[s.length()];

        for (int i = 0; i < s.length(); i++) {
             array[i] = s.charAt(i);
        }

        Arrays.sort(array,Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            answer += array[i];
        }
        return answer;
    }
}

//join함수 활용