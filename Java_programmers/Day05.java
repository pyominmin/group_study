*주사위 게임 2
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
