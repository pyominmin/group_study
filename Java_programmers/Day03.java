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
