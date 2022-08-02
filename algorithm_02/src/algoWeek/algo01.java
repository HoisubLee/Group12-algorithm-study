package algoWeek;

public class algo01 {
    public static String solution(int a, int b) {
        String answer = "";
        int days = 0;

        for (int i = 1; i < a; i++) {
            if (i < 8) {
                if (i == 2) {
                    days += 29;
                } else if (i % 2 == 0) {
                    days += 30;
                } else {
                    days += 31;
                }
            } else {
                if (i % 2 == 0) {
                    days += 31;
                } else {
                    days += 30;
                }
            }
        }

        days += b;

        System.out.println("days : "+days);
        switch (days%7) {
            case 0 :
                answer = "THU";
                break;
            case 1 :
                answer = "FRI";
                break;
            case 2 :
                answer = "SAT";
                break;
            case 3 :
                answer = "SUN";
                break;
            case 4 :
                answer = "MON";
                break;
            case 5 :
                answer = "TUE";
                break;
            case 6 :
                answer = "WED";
                break;
            default:
                break;
        }

        return answer;
    }
}
