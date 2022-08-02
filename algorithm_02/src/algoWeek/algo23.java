package algoWeek;

public class algo23 {
    //시저 암호
    public static String solution(String s, int n) {
        //각 문자들을 확인해서 대문자인지, 소문자인지 확인 후 n만큼 더해주었다.
        //범위를 넘어가면 -26을 시행했다.
        String answer = "";
        char[] array = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                continue;
            }
            int convertNum = (char)((int)array[i] + n);
            if ((array[i] >= 'A' && array[i] <= 'Z') && convertNum > 'Z' ) {
                array[i] = (char)(convertNum - 26);
            } else if ((array[i] >= 'a' && array[i] <= 'z') && convertNum > 'z' ) {
                array[i] = (char)(convertNum - 26);
            } else {
                array[i] = (char)convertNum;
            }
        }
        for (int i = 0; i < array.length; i++) {
            answer += array[i];
        }

        return answer;
    }
}
