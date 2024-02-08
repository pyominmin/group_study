*코드 처리하기//다른사람 코드 참고

class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(current);
            }
        }
      return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}

*등차수열의 특정한 항만 더하기//다른사람 코드 참고
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 1; i <= included.length; i++){
           if(included[i-1] == true){
               answer += (a+(i-1)*d); //등차수열의 합 a= a+(n-1)d
           }
        }
        return answer;
    }
}

*1-1 주사위 게임 2
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a != b && a != c && b != c){
            answer = a + b + c;
        } else if(a == b && a != c && b == c){
              answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else if(a != b && a == c && b == c){
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else if(a == b && a == c && b != c){
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));    
        }else if(a != b && a != c && b == c){
              answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else if(a != b && a == c && b != c){
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else if(a == b && a != c && b != c){
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }else {
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }
        return answer;
    }
}

1-2 주사위 게임 2 //간단화
class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        if(a == b && b == c){
            answer = answer * (a*a+b*b+c*c) * (a*a*a+b*b*b+c*c*c);
        } else if(a == b || a == c || b == c){
            answer = answer * (a*a+b*b+c*c);
        }
        return answer;
    }
}
    
*원소들의 곱과 합
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int count1 = 0;
        int count2 = 1;
        for(int i = 0; i < num_list.length; i++){
            count1 += num_list[i];
            count2 *= num_list[i];
        }
        int pow = (int)Math.pow(count1, 2);
        if(pow > count2){
            answer = 1;
        }else if (pow < count2){
            answer = 0;
        }else{
            return 0;
        }
        return answer;
    }
}

*이어 붙인 수
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String str1 = "";
        String str2 = "";
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 != 0){
                str1 += num_list[i];
            } else {
                str2 += num_list[i];
            }
        }
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        answer = num1 + num2;
        return answer;
    }
}
