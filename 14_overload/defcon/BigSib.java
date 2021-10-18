public class BigSib {
  String helloMsg;
  
  public BigSib(){
    helloMsg="Hello";
  }
  public BigSib(String msg) {
    helloMsg = msg;
  }
  public String greet(String person){
    return helloMsg + " " + person;
  }
}
