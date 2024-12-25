
import java.util.Scanner;

class Q2{
     public static void main(String []args ){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of string ");
      int n=sc.nextInt(); 
      sc.nextLine(); // to handle next line issue after n
      System.out.println("enter the string ");
      String s=sc.nextLine();
      s=s.toLowerCase(); // converting string to lower case 
      int hash[]=new int[26];
      for(int i=0;i<s.length();i++){
        hash[s.charAt(i)-'a']++; // counting frequency of each chara in the string 
      }
       int count =1;
       for(int i=0;i<hash.length;i++){
        if(hash[i]==0) // if any alphabhet in string in not present then it is not a pangram
        count=0;
       }
        if(count==0)
        System.out.println("NO");
        else 
        System.out.println("YES");


     }
}