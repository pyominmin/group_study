*문자열 섞기
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i = 0; i < str1.length(); i++){
            answer+ = String.valueOf(str1.charAt(i))+str2.charAt(i);//String.valueOf는 변환해주는 것
        }
        
        return answer;
    }
}

*문자 리스트를 문자열로 변환하기
class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(int i = 0; i < arr.length; i++){
        answer += arr[i];
        }
        return answer;
    }
}

*문자열 곱하기
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i< k; i++){
            answer += my_string;
        }
        return answer;
    }
}

*더 크게 합치기
class Solution {
    public int solution(int a, int b) {
      String str1 = String.valueOf(a)+String.valueOf(b);
       String str2 = String.valueOf(b)+String.valueOf(a);
        if(Integer.parseInt(str1)>Integer.parseInt(str2)){
         return Integer.parseInt(str1);
       }else{
           return Integer.parseInt(str2);
       }
    }
}

//String -> int  변환 : Integer.parseInt()
//int -> String  변환 : String.valueOf()

*두 수의 연산값 비교하기
class Solution {
    public int solution(int a, int b) {
        String str = String.valueOf(a)+String.valueOf(b);
       int answer = 2*a*b;
        if(Integer.parseInt(str)> answer){
            return Integer.parseInt(str);
        }else{
            return answer;
        }
    }
}
