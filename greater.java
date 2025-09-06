import java.util.Scanner;

class greater {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers with space in between");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
             System.out.println(a);
        }
        else{
             System.out.println(b);
        }
    }
}
