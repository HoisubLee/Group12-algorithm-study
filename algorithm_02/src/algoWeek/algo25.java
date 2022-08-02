package algoWeek;

public class algo25 {
    public static int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                 if(i%j == 0) {
                     count++;
                     System.out.println("i : "+i+", j:"+j);
                 }
            }
            if (count%2 == 0) {
                answer += i;
                System.out.println("answer "+answer);
            } else {
                answer -= i;
                System.out.println("answer "+answer);
            }
            count = 0;
        }
        return answer;
    }
}

//제곱수인 경우 약수의 개수가 홀수임을 이용해서
//Math.sqrt(i)를 사용