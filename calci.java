import java.util.*;
class calci {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number with space in between");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
       System.out.println("addition:"+c);
       System.out.println("subtraction:"+d);
       System.out.println("multipication:"+e);
       if(b==0){
           System.out.println("division by 0 is not possible");
       }
       else{
           float f=(float)a/b;
           System.out.println("division:"+f);
       }
       
    }
    }
