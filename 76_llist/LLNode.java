// WON (Brian, Paul, Ethan)
//APCS
//HW 75 -- Nodal Recall -- Linked Lists
//2020--03--13
//time spent: .3 hours

public class LLNode {

  private String cargo;
  private LLNode next;

  public LLNode() {

  }

  public String getCargo() {
    return cargo;
  }
  public LLNode getNext() {
    return next;
  }

  public void setCargo(String x) {
    cargo = x;
  }
  public void setNext(LLNode x) {
    next = x;
  }

}
