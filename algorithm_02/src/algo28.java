public class algo28 {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        long left = n;
        long right = m;
        //최대공약수 저장 (n,m같을 때를 대비하여 m을 저장해둠)
        long GCD = m;

        while(right != 0 && left%right != 0) {
            GCD = left%right;
            left = right;
            right = GCD;
        }
        answer[0] = (int)right;

        answer[1] = (int)((n * m )/ GCD);

        return answer;
    }
}
