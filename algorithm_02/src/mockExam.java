public class mockExam {
    public static String solution(int month, int day) {
        String answer = "";
        // 각 달에 해당하는 날자 수를 저장
        // index 0은 12월, 1은 1월 순..
        int[] monthdays = {31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

        // 현재 날짜와 남은날짜(98)를 더하고
        // 현대 달의 날짜수를 포함하여
        // 각 달의 날짜를 빼서 최종 날짜를 구함
        int Dday = 98 + day;


        while (Dday - monthdays[month] > 0) {
            Dday -= monthdays[month];
            month = (month + 1 )%12;
        }
        answer = month+"월 "+Dday+"일";
        return answer;
    }

}
