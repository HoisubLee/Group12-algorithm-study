package algoWeek;

public class algo22 {
    public static int solution(String s) {
        int answer = 0;
        String answerString ="";
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > '0' && s.charAt(i) < '9') {
                answerString += s.charAt(i);
            } else {
                for (int j = 0; j < numbers.length; j++) {
                    if(s.length() >= i+numbers[j].length() && numbers[j].equals( s.substring(i,i+numbers[j].length()))) {
                        answerString += j;
                        System.out.println(numbers[j] + ":" + i);
                        i += numbers[j].length() - 1;
                        System.out.println(answerString);
                        break;
                    }
                }
            }
        }
        answer = Integer.parseInt(answerString);

//        s = s.replace("zero","0");
//        s = s.replace("one","1");
//        s = s.replace("two","2");
//        s = s.replace("three","3");
//        s = s.replace("four","4");
//        s = s.replace("five","5");
//        s = s.replace("six","6");
//        s = s.replace("seven","7");
//        s = s.replace("eight","8");
//        s = s.replace("nine","9");
//
//
//        answer = Integer.parseInt(s);
        return answer;
    }
}
