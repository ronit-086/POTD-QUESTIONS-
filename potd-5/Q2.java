 import java.util.*;
class Q2{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of Questions ");
    int n=sc.nextInt();
    System.out.println("\nenter time taken  to reach party ");
    int k=sc.nextInt();
    int min=0;
    int count =0;
    int remainingTime=240-k;
    for(int i=1;i<=n;i++){
        min+=i*5;
    if(min<=remainingTime){
    count++;
    }
}
    System.out.println(count);
    }
}