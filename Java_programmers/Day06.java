*마지막 두 원소

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        int a = num_list[num_list.length - 2];
        int b = num_list[num_list.length - 1];
        
        if(a < b){
            answer[answer.length - 1] = b - a;
        }else{
            answer[answer.length - 1] = b * 2;
        }
        
        return answer;
    }
}

* 수 조작하기 1

class Solution {
    public int solution(int n, String control) {
        for(int i = 0; i < control.length(); i++){
            switch(control.charAt(i)){
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}

* 수 조작하기 2

class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 1; i < numLog.length; i++){
            if(numLog[i] - numLog[i - 1] == 1){
                answer += 'w';
            }else if(numLog[i] - numLog[i - 1] == -1){
                answer += 's';
            }else if(numLog[i] - numLog[i - 1] == 10){
                answer += 'd';
            }else{
                answer += 'a';
            }
        }
        return answer;
    }
}

*수열과 구간 쿼리 3

  class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int n = 0;
        for(int i =0; i<queries.length; i++){
            n = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = n;
        }
        return arr;
    }
}

*수열과 구간 쿼리 2
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int s = queries[i][1];
            int s = queries[i][2];
            
            int min = Integer.MAX_VALUE;
            for(int j = s; j <= e; j++){
                if(arr[j] > k && arr[j] < min){
                    min = arr[j];
                }
            }
            answer[i] = min == Integer.MAX_VALUE? -1 : min;
        }
        return answer;
    }
}
