import java.util.Scanner;
public class checkprime {
    // method 1
   // public static boolean isprime(int n){
     //   boolean isprime=true;
       // for(int i=2;i<n;i++) {
         //if(n%i==0){
           //  isprime=false;

       //return isprime; }
    // method 2;
    public static boolean isprime(){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        for(int i=2;i<n;i++) {
            if(n%i==0){
                return false;
            }
        }
        return true; }
    // method 3 optimised approach
    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
            return false;}
        }
        return true;
    }
    //print all prime in a range
    //function calls a function for a task this type of function is called helper function
    public static void primecheck(int n){
        for (int i=2;i<=n;i++){
           if(isprime(i)){
               //true
               System.out.println(i);
            }
        }
    }

    public static void bintodec(int binnum){
        int pow=0;
        int dec=0;
        int mynum=binnum;
        while(binnum>0){
         int lastdigit=binnum%10;
         dec =dec +(lastdigit*(int) Math.pow(2,pow));
         pow++;
         binnum=binnum/10;
        } System.out.println("binnum" + mynum + " to dec num is "+ dec);
    }

    public static void dectobin(int decnum){
        int pow=0;
        int bin=0;
        while(decnum>0){
            int remainder=decnum%2;
            bin=bin+(remainder*(int)Math.pow(10,pow));
            pow++;
            decnum=decnum/2;
            //everytime dividing number by 2 to run the loop
        }System.out.println("binnum" + decnum + " to dec num is "+ bin);
    }
    public static void main(String args[]) {
       dectobin(5);
       System.out.println("function done!!");
    }
}
