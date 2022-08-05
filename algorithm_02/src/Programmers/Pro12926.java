package Programmers;

public class Pro12926 {
    public static String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                char ch = (char)(sb.charAt(i) + n);
                ch = (char)((ch%'A')+'A');
                sb.insert(i, (char) ((int) (sb.charAt(i) + n) % 'A' + 'A'));
                sb.delete(i + 1, i + 2);
            } else if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
                char ch = (char)(sb.charAt(i) + n);
                int a = (int)ch%(int)'a';
                ch = (char)(a+'a');
                sb.insert(i, (char) ((int) (sb.charAt(i) + n) % 'a' + 'a'));
                sb.delete(i + 1, i + 2);
            }
        }
        return answer;
    }
}
