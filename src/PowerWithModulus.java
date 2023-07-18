import java.util.Scanner;

public class PowerWithModulus {
    public static int powerModulus(int A,int B,int C){
        int val=1;
        for(int i=1;i<=B;i++){
            val=val*A;
        }
        return (val%C);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  A=sc.nextInt();
        int  B=sc.nextInt();
        int  C=sc.nextInt();
        int val=powerModulus(A,B,C);
        System.out.println(val);

    }
}