public class BigSib{
    String helloMsg;

    public BigSib(String Msg){
      setHelloMsg(Msg);
    }

    public void setHelloMsg (String input) {
      helloMsg = input;
    }

    public String greet (String phrase) {
      helloMsg = phrase;
    }

    public String greet (String name) {
        return helloMsg + " " + name;
    }
}
