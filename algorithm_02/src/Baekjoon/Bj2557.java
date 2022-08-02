package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        int temp = 0;
        for(int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < list.length -1; i++) {
            for (int j = i+1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}
