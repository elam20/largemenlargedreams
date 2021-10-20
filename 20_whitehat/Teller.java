/*
Our Team: Russell Goychayev, Ethan Lam, Oscar Breen
Their Team Jason Zhou (Roster: Nina Jiang, John Gupta-she Duckies: Miss Alpaca,$
APCS
HW20 - External Audit
10/19/2021

DISCO: java Teller yields:

"Account locked. Id or Password Incorrect. Try Again

Welcome elmo. Nice to see you back!

Fetching info ... ... ...

Name: elmo
Account Id: 111111111
Balance: 69.0

Changing name ... ... ...

Name has been changed. Welcome elmoson!

Name: elmoson
Account Id: 111111111
Balance: 69.0

Changing password ... ... ...

Password has been changed, please reauthenticate!

Welcome elmoson. Nice to see you back!

Pin has been changed. Please reauthenticate!

Welcome elmoson. Nice to see you back!

Amount exceeds your balance, try a smaller amount! 69.0 USD available for withdrawal.

Withdrawing 10.0 USD. New Balance is 59.0 USD.

Balance has been updated. elmoson, you have 79.0 USD.

Name: elmoson
Account Id: 111111111
Balance: 79.0"

From this we can see that all is well and everything runs smoothly. This is because
the methods of class BankAccount are public. Therefore, we can use them in another class.
This is similar to HW 13 in which we had BigSib.java and Greet.java.

Q:

We can still initialize variables of the elmo object of class BankAccount even though these variables
are private. What does this mean?
*/

public class Teller {

public static void main(String[] args) {

BankAccount elmo = new BankAccount("elmo", "e", 111111111, 1011, 69);

        //authentication
        System.out.println("Autheticating ... ... ...\n");
        elmo.authenticate(1111111, "e");
        elmo.authenticate(111111111, "e");

        //Info
        System.out.println("Fetching info ... ... ...\n");
        System.out.println(elmo.toString());

        //Changing name
        System.out.println("Changing name ... ... ...\n");
        elmo.changeName("elmoson");
        System.out.println(elmo.toString());

        //Changing password
        System.out.println("Changing password ... ... ...\n");
        elmo.changePsswrd("newpass", "newpass");
        elmo.authenticate(111111111, "newpass");

        //Changing pin
        elmo.changePin(1458);
        elmo.authenticate(111111111, "newpass");

        //withdrawing and depositing
        elmo.withdraw(100);
        elmo.withdraw(10);
        elmo.deposit(20);
        System.out.println(elmo.toString());
        //correct outputs will have no errors

}
}
