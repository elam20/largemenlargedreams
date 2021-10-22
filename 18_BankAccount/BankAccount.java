/**
Sexy: Oscar Breen, Ethan Lam, Russell Goychayev
APCS
HW18: CPA-One -- building a better class
2021-10-17
instance variables for storing...
   account holder's full name
   account password
   4-digit PIN
   9-digit account number
   account balance
and methods for...
   setting each attribute
   printing out all of an account’s info at once
   depositing money
   withdrawing money
**/

/**
DISCO
Leading zeros are problematic in short and int data types. Why? Who knows.
Used strings instead to fix this problem.
Gained clarity on constructors and an apparent default constructor in java.
Remembered how to type cast from the summer homework.
Remembered how to code in minor steps and how to code smartly.
Q1-4 are on piazza. Lucky us.
---------------------------------------------
QCC
A few minor discrepancies:
1) Why double? You aren't converting currencies or anything. Float precision should be fine.
2) How to resolve leading zero(s) problem? string formatting like python or a method to that same purpose.
3) The template at
https://github.com/ap251/closet/blob/main/18_BankAccount/BankAccount.java
has the mutator methods set up to return values. This betrays the definition of a mutator
method. Unless a mutator method can change a variable and also return that variable.
However, would it return the old or new value of said variable?
4) Short or int for pin and acctNum? These variables can still be of use as strings, and
arguably of better use. Problems were encountered when dealing with leading zeros.
5)
gentleman.setBalance((float)0.00);//sets bal to 0.00 units of currency
System.out.println("account bal: " + gentleman.bal);
The above prints "0.0", despite the specified precision of two decimal places. Maybe this has to
do with the precision of the print method. This could mean that there is
another print method that specifies the precision of numerical values.
---------------------------------------------
Q2) This is evidenced when initializing integer variables. We do not use
the new constructor. Java just does it's thing there.
Q3) You can run
System.out.print((String)<object name>);
in the main method of a java file. The data type of the object should not be
string and be different than string. If there is an error, then you will discover
that you cannot do such. If there is not an error, then you will discover
that you can do such.
**/

public class BankAccount {

  //instance variables
public String fullName;
private String passwd;

// public short pin;
// public int pin;
// short and int lead to problems with leading zeros
public String pin; // solution: use String instead
private String acctNum;

public float bal; //float and not double because double is too precise for this purpose
  //---------------------------------------------


  //mutators
  public void setName( String newName ) {
    // INSERT YOUR CODE HERE
    fullName = new String(newName);
  }

  public void setPasswd( String newPasswd ) {
    // INSERT YOUR CODE HERE
    passwd = new String(newPasswd);
  }
  /**
  retired method:
  public void setPin( short newPin ) {
    // INSERT YOUR CODE HERE
    pin = (short)newPin;
  }
  **/

  public void setPin( String newPin ) {
    // INSERT YOUR CODE HERE
    pin = new String(newPin);
  }

  public void setAcctNum( String newAcctNum ) {
    // INSERT YOUR CODE HERE
    acctNum = new String(newAcctNum);
  }

  public void setBalance( float newBalance ) {
    // INSERT YOUR CODE HERE
    bal = (float)newBalance;
  }
  //---------------------------------------------


  public void deposit( float depositAmount ) {
    // INSERT YOUR CODE HERE
    bal += (float)depositAmount;
  }

  public void withdraw( float withdrawAmount ) {
    // INSERT YOUR CODE HERE
    bal -= (float)withdrawAmount;
  }


  //overridden toString()
  public String toString() {
    // INSERT YOUR CODE HERE
    String infoPub;
    String infoPriv;
    infoPub = new String("Account holder's full name: " + fullName + "; "
    + "4-digit PIN: " + pin + "; "
    + "account bal: " + bal);
    infoPriv = new String("Account password: " + passwd + "; "
    + "9-digit account number: " + acctNum);

    String infoAll;
    infoAll = new String(infoPub +  "; " + infoPriv);
    return infoAll;
  }


  //main method for testing
  public static void main( String[] args ) {
    // INSERT YOUR METHOD CALLS FOR TESTING HERE
    BankAccount gentleman = new BankAccount();


    System.out.println("---------------------------------------------");

    gentleman.setName("Beef Wellington");
    System.out.println("Account holder's full name: " + gentleman.fullName);

    gentleman.setPasswd("password123");
    System.out.println("Account password: " + gentleman.passwd);

    /**
    retired method calls for testing:
    gentleman.setPin((short)0123);
    System.out.println("4-digit PIN: " + gentleman.pin); // --> 83
    gentleman.setPin((short)123); //
    System.out.println("4-digit PIN: " + gentleman.pin); // --> 123
    //based on this, we can conclude that leading zeros in short cause the input to be processed differently
    //How to get around this?
    //Some sort of try catch structure. If there is/are (a) leading zero/zeros, do foo
    //We will use Strings for now to get around this leading zero problem. Maybe later
    //we can follow up on this and implement it proprerly.
    //Similar logic can be applied to check the length of the input. if the given length
    is not equal to the required length, do foo
    The same kind of logic applies to the withdraw and deposit methods. Right now, the
    input of these methods can be positive or negative, even though that
    doesn't make sense. The bank doesn't give you money when you deposit money,
    and vice versa.
    **/

    gentleman.setPin("0123");//sets pin to 0123
    System.out.println("4-digit PIN: " + gentleman.pin);

    gentleman.setAcctNum("000000000");//sets account number to 000000000
    System.out.println("9-digit account number: " + gentleman.acctNum);

    gentleman.setBalance((float)0.00);//sets bal to 0.00 units of currency
    System.out.println("account bal: " + gentleman.bal);

    gentleman.deposit((float)10.00); //deposits 10.00 units of currency. Does not tell you previous balance, present balance, or amount deposited.
    System.out.println("(Un)Successfully deposited your money. You want to know how much you deposited? That'll be extra.");

    gentleman.withdraw((float)10.00); //withdraws 10.00 units of currency. Does not tell you previous balance, present balance, or amount withdrawn.
    System.out.println("(Un)Successfully withdrew your money. You want to know how much you withdrew? That'll be extra.");

    System.out.println("---------------------------------------------");
    System.out.println(gentleman.toString());
    System.out.println();
    System.out.println("Come again, esteemed customer!");
    System.out.println("---------------------------------------------");
  }//end main()
}//end class BankAccount
