import java.sql.Array;
import java.util.*;

public class algo08 {
    public static long solution(long n) {
        long answer = 0;
        // 주어진 값 n의 자리수를 구한다 - length
        int length = (int)(Math.log10(n)+1);
        // 각 자릿수 값을 배열로 저장하기 위해 iArray 선언
        // 내림차순을 사용하기 위해 Integer타입으로 정의했다.
        Integer[] iArray = new Integer[length];

        // 10의 나머지값을 구하여 저장하고
        // 주어진 값을 10 나눠 다음 자릿수를 구할 수 있도록 했다.
        for (int i = 0; i < length; i++) {
            iArray[i] = (int) (n % 10);
            n /= 10;
        }

        // 내림차순 라이브러리를 사용했다.
        Arrays.sort(iArray,Collections.reverseOrder());

        //Interger 배열의 값들을 String에 저장한 후 Long타입으로 변환 하도록 했다.
        String s = "";
        for (int i = 0; i < length ; i++) {
            s += Integer.toString(iArray[i]);
        }

        answer = Long.parseLong(s);
        return answer;
    }
}

// 시행착오 -
//public static long solution(long n) {
//        long answer = 0;
//        String string = String.valueOf(n);
//        char[] cString = string.toCharArray();
//
//        Character[] charString = new Character[cString.length];
//
//        int i = 0;
//        for (char value : cString) {
//            charString[i++] = Character.valueOf(value);
//        }
//        for (int ii : charString) {
//            System.out.println(ii);
//        }
//        System.out.println("---------------------------------------");
//        Arrays.sort(charString,Collections.reverseOrder());
//
//        for (int ii : charString) {
//            System.out.println(ii);
//        }
//        return answer;
//    }
