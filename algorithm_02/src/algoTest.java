public class algoTest {
    public static String solution(int n) {
        String answer = "";
        String num = n + "";
        int sum = 0;

        // num 내용의 역순으로 answer에 저장하기
        for (int i = num.length() - 1; i >= 0; i--) {
            char cNum = num.charAt(i);
            answer += cNum;
            sum += Character.getNumericValue(cNum);
            if (i == 0) {
                answer += "=";
            } else {
                answer += "+";
            }
        }
        answer += sum;

        return answer;
    }
}
