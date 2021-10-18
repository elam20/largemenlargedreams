//Oscar Breen, Russell Goychayev, Ethan lam
//APCS
//HW18 -- CPA-One -- Writing the UML Diagram as code
//2021--10--18
//DISCO --constructors can run loops
//QCC-- should they be directly printing out the -
//information and is there a way to limit constrcutors if certain things are not met
//(passwords, pin, etc)
//Team Sexys Latest and Greatest Q2 Response: We kNow because Java let us run the consturctor in the first place
//Team Sexys Latest and Greatest Q3 Response: attempt to run an object as a string
import java.util.Scanner;
public class BankAcc{
String Name;
String password;
int Pin;
double AccNum;
double balance;
public BankAcc(String Name){
  System.out.println("welcome " + Name);
  }

  public BankAcc(String Name, String password){
    if (password == "mypassword"){
    System.out.println("correct password");
}
  else {
      System.out.println("Wrong password");
}
}

public BankAcc(double bal){
  balance = bal;
  System.out.println("Balance of " + balance);
  }

  public BankAcc(int Pin){
    if (Pin == 1234){
    System.out.println("correct Pin");
}
  else {
      System.out.println("Wrong Pin");
}
    }

public double Deposit(double dep){
  double AccNum = balance + dep;
System.out.println(AccNum + "");
return AccNum;
}

public double Withdraw(double with){
  double AccNum = balance - with;
  System.out.println(AccNum + "");
return AccNum;
}

public void PrintInfo (String Name, String password, int Pin, double balance){
  System.out.println("Account holder:" + Name + " password:" + password + "Pin:" + Pin + "" + "balance:" + balance);
}

  public static void main( String[] args ) {
BankAcc OscarName = new BankAcc("Oscar Breen");
BankAcc OscarPas = new BankAcc("Oscar Breen" , "mypassword");
BankAcc OscarPin = new BankAcc(1234);
BankAcc OscarBal = new BankAcc(100.0);
OscarBal.Deposit(40.0);
OscarBal.Withdraw(30.0);
  }
}
