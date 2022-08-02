package algoWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class algo19 {
    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        answer = new String[strings.length];
        ArrayList<String> array = new ArrayList<>();
        for (String string : strings) {
            array.add(string.charAt(n) + string);
        }
        Collections.sort(array);

        for (int i = 0; i < array.size(); i++) {
             answer[i] = array.get(i).substring(1);
        }

        return answer;
    }


    //강사님 것
    public static String[] solution2(String[] strings, int n) {
        //인덱스 뽑기
        //인덱스기준 사전순 정리
        //같은문자있는 것 사전순 정리

        //위 내용보다
        //주어진
        String[] answer = new String[strings.length];
        ArrayList<String> stringsArr = new ArrayList<>();

        for (String string : strings) {
            stringsArr.add(string.charAt(n) + string);
        }
        // [usun, ebed, acar]

        Collections.sort(stringsArr);
        // [acar, ebed, usun]

        for (int i = 0; i < stringsArr.size(); i++) {
            answer[i] = stringsArr.get(i).substring(1);
        }
        // [car, bed, sun]

        return answer;
    }
    // 자주쓰는 코드를 스니펫으로 저장해두면 유용하다. InteliJ 스니펫 이라고 검색하여 알아볼 것
}
