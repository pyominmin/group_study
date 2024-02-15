*수열과 구간 쿼리 4

  class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j=s; j<=e; j++) {
               if(j%k==0){
                    arr[j] += 1;   
                } 
            }
        }
        return arr;
    }
}

*배열 만들기 2

  import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        for(int i = l; i <= r; i++) {
            String num =  String.valueOf(i);
            String[] nums = num.split("");
            int numLength =  nums.length;
            int count = 0;
                for (int j = 0; j < numLength; j++) {
                    if (nums[j].equals("0") || nums[j].equals("5")) {
                        count++;
                    }
                }
                if(count == numLength) {
                    list.add(i);
                }
            }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        if(answer.length == 0) {
           answer = new int[] {-1};
            return answer;
        }
        return answer;
    }
}

* 카운트 업

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        int j = 0;
        for (int i = start_num; i <= end_num; i++) {
            answer[j] = i;
            j++; // 배열 인덱스를 증가시켜 다음 값을 할당할 위치로 이동
        }
        return answer;
    }
}

*콜라츠 수열 만들기

class Solution {
   public int[] solution(int n) {
       String str = n + " ";
       while (n != 1) { // n이 1이 아닌 동안
           n = n % 2 == 0 ? n / 2 : 3 * n + 1;
           str += n + " ";
       }
       String[] arr = str.split(" ");
       int[] answer = new int[arr.length];
       for(int i=0; i<answer.length; i++){
           answer[i] = Integer.parseInt(arr[i]);
       }
       return answer;
   }
}

* 배열만들기
class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        int index = 0;
        for(int i = 0;  i < arr.length;) {
            if(stk.length == 0) {
                stk = new int[1];
                stk[index++] = arr[i];
                i++;
            } else {
                if(stk[stk.length-1] < arr[i]) {
                    stk = Arrays.copyOf(stk, stk.length+1);
                    stk[stk.length-1] = arr[i];
                    i++;
                } else {
                    stk = Arrays.copyOf(stk, stk.length-1);
                    index--;
                    if(index < 0) {
                        index = 0;
                    }
                }
            }
        }
        return stk;
    }
}
