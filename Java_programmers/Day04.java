*n의 배수
  class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if(num%n == 0){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}

*공배수
class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        int num = n*m;
        
        if(number%n==0 && number%m ==0){
            answer=1;
        }else if(number%num == 0){
            answer=1;
        }else{
            answer=0;
        }
           
        return answer;
    }
}

*홀짝에 따라 다른 값 반환하기
class Solution {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % 2 == 1 && i % 2 == 1) {
				answer += i;
			}else if (n % 2 == 0&&i % 2 == 0) {
				answer += (int) Math.pow(i, 2);// Math.pow = 거듭 제곱 구하기

			}
		}
		return answer;
	}
}

*조건 문자열
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals(">") && eq.equals("=")){
            return n >= m ? 1 :0;
        }else if(ineq.equals("<") && eq.equals("=")){
             return n <= m ? 1 :0;
        }else if(ineq.equals(">") && eq.equals("!")){
             return n < m ? 0 :1;
        }else if(ineq.equals("<") && eq.equals("!")){
            return n > m ? 0 :1;
        }else{
            return 0;
        }
        
    }
}

*flag에 따라 다른 값 반환하기
  class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag == true){
            answer = a+b;
        }else{
            answer = a-b;
        }
        return answer;
    }
}
