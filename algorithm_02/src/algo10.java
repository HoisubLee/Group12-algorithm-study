public class algo10 {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int smaller = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smaller ) {
                smaller = arr[i];
            }
        }

        System.out.println(smaller);
        return answer;
        //하다 맘ㅠㅠ
    }
}

//Arrays.stream(arr).min().getAsInt();
//Arrays.stream(arr).filter(n->n!=min)
//n!=min 이 조건임
//arraycopy()