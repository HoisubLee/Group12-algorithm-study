public class algo05 {
    public static String solution(String s) {
        String answer = "";
        String tempWord = "";
        // " "를 구분자로 하여 단어 분할
        String[] array = s.split(" "); // 뒷부분 공백이 있는경우 문제가 생김. "try woder "

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                // 단어의 짝수번째 문자
                if (j % 2 == 0) {
                    // 소문자이면 대문자로 변경
                    if (array[i].charAt(j) >= 97 && array[i].charAt(j) <= 122) {
                        tempWord += (char) ((int) (array[i].charAt(j)) - 32);
                    }
                    //대문자이면 그대로
                    else {
                        tempWord += (char) ((int) (array[i].charAt(j)));
                    }
                }
                // 단어의 홀수번째 문자
                else {
                    // 대문자이면 소문자로 변경
                    if (array[i].charAt(j) >= 65 && array[i].charAt(j) <= 90) {
                        tempWord += (char) ((int) (array[i].charAt(j)) + 32);
                    }
                    //소문자이면 그대로
                    else {
                        tempWord += (char) ((int) (array[i].charAt(j)));
                    }
                }
            }
            answer += tempWord;
            //마지막 단어 제외하고 개행 추가
            if (i < array.length-1) {
                answer += " ";
            }
            tempWord = "";
        }

        return answer+="";
    }
}
