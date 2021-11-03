Team 1 Oscar Breen Roy Goyachev Ethan Lam
 APCS
 HW26 -- GCD Three Ways -- Recursion, while loop and hard code
 2021-10-27
 Time Spent: 1 hour

 DICSO:
 QCC: what is purpose of doing the "hard code" if it still uses a while loop anyway
*/

public class Stats {
 public static int gcd(int a, int b) { //hard coded loop
   int gcd = b;
   while (a % gcd != 0 || b % gcd != 0) {
     check--;
   }
   return gcd;
 }


 public static int gcdER(int a, int b) { //while loop
   if (a > b) {
     return gcdER(a - b, b);
   } else if (a < b) {
     return gcdER(a, b - a);
   } else {
     return a;
   }
 }


 public static int gcdEW(int a, int b) { //Recursion loop
   while (a != b) {
     if (a > b) {
       a -= b;
     } else {
       b -= a;
     }
   }
   return a;
 }

 public static void main(String[] args) {
  System.out.println(gcd(30 10));
  System.out.println(gcdER(100 16));
  System.out.println(gcdEW(100 35));


 }
}
