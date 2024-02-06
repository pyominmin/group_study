*덧셈식 출력하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(a + " + " + b + " = " + c);
    }
}

*문자열 붙여서 출력하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.print(a+b);
    }
}

*문자열 돌리기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int l = a.length();
        
        for(int i = 0; i < l; i++){
            System.out.println(a.charAt(i));
        }
    }
}

*홀짝 구분하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2==0){
            System.out.print(n + " is even");
        }else{
            System.out.print(n + " is odd");
        }
    }
}

*문자열 겹쳐쓰기
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        for(int i = 0; i < s; i++){
            answer += my_string.charAt(i);
        }
        int j = 0;
        while(j < overwrite_string.length()){
            answer += overwrite_string.charAt(j);
            j++;
        }
        int k = j + s;
        while(k<my_string.length()){
            answer += my_string.charAt(k);
            k++;
        }
        return answer;
    }
}
