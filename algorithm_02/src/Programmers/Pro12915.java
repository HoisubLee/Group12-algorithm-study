package Programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Pro12915 {
    public static String[] solution(String[] strings, int n) {
        //strings 의 n번째
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].charAt(n)+strings[i];
        }
        Arrays.sort(answer);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].substring(1);
        }
        return answer;
    }

    public static String[] solution2(String[] strings, int n) {

        Arrays.sort(strings);
        Arrays.sort(strings, (s1,s2)->s1.charAt(n)-s2.charAt(n));

        return strings;
    }

    public static String[] solution3(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });
        return strings;
    }

//    public static String[] solution4(String[] strings, int n) {
//        List<Character> list = new HashSet<Character>();
//    }
}

