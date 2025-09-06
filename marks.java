import java.util.Scanner;

class marks {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st subject marks:");
        int m1=sc.nextInt();
        System.out.println("enter 2nd subject marks:");
        int m2=sc.nextInt();
        System.out.println("enter 3rd subject marks:");
        int m3=sc.nextInt();
        int tmarks=m1+m2+m3;
        System.out.println("TOTAL MARKS:"+tmarks);
        int avg=tmarks/3;
        System.out.println("AVERAGE MARKS:"+avg);
    } 
}
