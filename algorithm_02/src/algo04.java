import java.util.Arrays;
public class algo04 {
    public static String solution(String[] participant, String[] completion) {
//        String answer = "";

        //참가자 중 동명이인 검색
//        int count = 0;
//        String[] same = {};
//        for (int i = 0; i < participant.length; i++) {
//            for (int j = i+1; j < participant.length; j++) {
//                boolean result = participant[i].equals(participant[j]);
//                if (result) {
//                    count++;
//                    System.out.println("people:"+participant[i]+"count:"+count);
//                }
//            }
//        }

//        String[] temp = participant;
//        boolean result = false;
//        for (int i = 0; i < participant.length; i++) {
//            for (int j = 0; j < completion.length; j++) {
//                result = temp[i].equals(completion[j]);
//                if (result) {
//                    temp[i] = null;
//                    completion[j] = null;
//                    break;
//                }
//            }
//        }
//
//        for (int i = 0; i < temp.length; i++) {
//            if (temp[i] != null) {
//                answer = temp[i];
//            }
//        }
//        return answer;

        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = participant[participant.length-1];

        for(int i=0; i<completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
            }
        }
        return answer;
    }
}
