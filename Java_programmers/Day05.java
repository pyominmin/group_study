class Solution {
    public String solution(String code) {
        String rat = "";
        int mode = 0;
        for(int i = 0; i < code.length(); i++){
            char ch = code.charAt(i);
            if(ch == '1'){
                mode = 0;
                continue;
            }else if(ch == '0'){
                mode = 1;
            }
            for(int j = 0; j < rat.length(); j++){
             if(i == j){
                 continue;
             }   
                
            }if(mode == 0 && i % 2 == 0){ 
                rat += ch;
            }if(mode == 1 && i % 2 != 0){ 
                rat += ch; 
            }
    }
          return rat; 
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
