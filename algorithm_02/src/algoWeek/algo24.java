package algoWeek;

import java.util.*;
import java.util.regex.*;

public class algo24 {
        public static String solution(String new_id) {
            String answer = "";
            //1단계
            new_id = new_id.toLowerCase();
            System.out.println(new_id);
            System.out.println("-1step---------------");

            //2단계
            new_id = new_id.replaceAll("[^0-9a-z._-]","");
            System.out.println(new_id);
            System.out.println("-2step---------------");

            //3단계
            new_id = new_id.replaceAll("[.]+",".");
            System.out.println(new_id);
            System.out.println("-3step---------------");

            //4단계
            new_id = new_id.replaceAll("^[.]","");
            System.out.println(new_id);
            System.out.println("-4step---------------");
            new_id = new_id.replaceAll("[.]$","");
            System.out.println(new_id);
            System.out.println("-4step---------------");

            //5단계
            if (new_id.equals("")) {
                new_id = "a";
            }
            System.out.println(new_id);
            System.out.println("-5step---------------");

            //6단계
            if (new_id.length() > 15) {
                new_id = new_id.substring(0,15);
            }
            new_id = new_id.replaceAll("[.]$","");
            System.out.println(new_id);
            System.out.println("-6step---------------");

            //7단계
            if (new_id.length() < 3) {
                while( new_id.length() < 3 ) {
                    new_id += new_id.charAt(new_id.length() - 1);
                }
            }
            System.out.println(new_id);
            System.out.println("-7step---------------");

            return new_id;
        }
}
