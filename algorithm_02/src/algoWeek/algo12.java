package algoWeek;

public class algo12 {
    public static boolean solution(int x) {
        boolean answer = true;
        //자리수 쪼개기
        String s = ""+x;
        int sum = 0;
        //각 자리의 숫자 sum에 더하기
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.substring(i,i+1));
        }
        answer = (x%sum == 0);

        return answer;
    }
}
