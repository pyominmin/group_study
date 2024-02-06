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

*
