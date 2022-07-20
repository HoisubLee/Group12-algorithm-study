import java.util.*;

public class algo16 {
    public static int[] solution(int[] numbers) {

        int[] answer = {};
        List<Integer> mergedNumbers = new ArrayList<>();
        List<Integer> sameNumbers = new ArrayList<>();
        List<Integer> resultarray = new ArrayList<>();
        List<Integer> finalarray = new ArrayList<>();
        int count = 0;
        Arrays.sort(numbers);

        mergedNumbers.add(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] != numbers[i-1]) {
                mergedNumbers.add(numbers[i]);
            } else {
                if (count == 0) {
                    sameNumbers.add(numbers[0]);
                    count++;
                }
                else if (numbers[i] != sameNumbers.get(count-1)) {
                    sameNumbers.add(numbers[i]);
                    count++;
                }
            }
        }

        //출력용
        System.out.println("merged---------------------------");
        for (int i = 0; i <mergedNumbers.size(); i++) {
            System.out.print(mergedNumbers.get(i)+" ");
        }
        System.out.println();
        System.out.println("same---------------------------");
        for (int i = 0; i <sameNumbers.size(); i++) {
            System.out.print(sameNumbers.get(i)+" ");
        }
        System.out.println();
        //출력 끝

        for (int i = 0; i < mergedNumbers.size() - 1; i++) {
            for (int j = i+1; j < mergedNumbers.size(); j++ ) {
                resultarray.add( mergedNumbers.get(i) + mergedNumbers.get(j) );
            }
        }

        System.out.println("sum---------------------------");
        for (int i = 0; i <resultarray.size(); i++) {
            System.out.print(resultarray.get(i)+" ");
        }
        System.out.println();

        for (int i = 0; i <sameNumbers.size(); i++) {
            resultarray.add(sameNumbers.get(i) * 2);
        }

        System.out.println("add samenum*2---------------------------");
        for (int i = 0; i <resultarray.size(); i++) {
            System.out.print(resultarray.get(i)+" ");
        }
        System.out.println();

        int[] result = new int[resultarray.size()];
        result = new int[resultarray.size()];
        for (int i = 0; i < resultarray.size(); i++) {
            result[i] = resultarray.get(i).intValue();
        }

        Arrays.sort(result);

        finalarray.add(result[0]);
        for (int i = 1; i < result.length; i++) {
            if (result[i] != result[i - 1]) {
                finalarray.add(result[i]);
            }
        }
        System.out.println("sort and merge---------------------------");
        for (int i = 0; i <finalarray.size(); i++) {
            System.out.print(finalarray.get(i)+" ");
        }
        System.out.println();

        answer = new int[finalarray.size()];
        for (int i = 0; i < finalarray.size(); i++) {
            answer[i] = finalarray.get(i).intValue();
        }
        return answer;
    }
}


// HashSet 중복을 허락하지 않는 자료구조!!
