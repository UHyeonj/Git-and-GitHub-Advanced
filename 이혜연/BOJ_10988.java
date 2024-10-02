import java.util.Scanner;

public class BOJ_10988{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();

        int num=0;

        for(int i=0;i<word.length()-1;i++){
            char front=word.charAt(i);
            char last=word.charAt(word.length()-i-1);
            if(front!=last){
                num=num+1;
            }
        }
        if(num==0){System.out.println(1);}
        else{System.out.println(0);}
    }
}