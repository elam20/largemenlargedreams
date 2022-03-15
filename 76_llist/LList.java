// WON (Brian, Paul, Ethan)
//APCS
//HW 76 -- We Got a Little Ol' Convoy -- Ah, breaker one-nine, this here's the Rubber Duck
//2020--03--14
//time spent: .5 hours
/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    if(_size > 0){
      LLNode cur = _head;
      for(int i = 0 ; i < _size - 1 ; i += 1){
        cur = cur.getNext();
      }
      LLNode nextNode = new LLNode();
      nextNode.setCargo(newVal);
      nextNode.setNext(null);
      cur.setNext(nextNode);

    }
    else{
      _head = new LLNode();
      _head.setCargo(newVal);
    }
    _size += 1;
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
      LLNode cur = _head;
    for(int i = 0 ; i < index ; i += 1){
      cur = cur.getNext();
    }
    return cur.getCargo();
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    LLNode cur = _head;
    LLNode newNode = new LLNode();
    LLNode tempNode = new LLNode();
    newNode.setCargo(newVal);
    for(int i = 0 ; i < index - 1 ; i += 1){
      cur = cur.getNext();
    }

    if(index < _size){
      tempNode = cur.getNext().getNext();
    }
    cur.setNext(newNode);
    cur.getNext().setNext(tempNode);
    return newVal;

  }


  //return number of nodes in list
  public int size()
  {
    return _size;
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString()
  {
    LLNode cur = _head;
    String res = "[ ";
    for(int i = 0 ; i < _size ; i += 1){
      res += cur.getCargo() + ", ";
      cur = cur.getNext();
    }
    res.substring(0, res.length() - 2);
    res += "]";
    return res;
  }


  //main method for testing
  public static void main( String[] args )
  {

    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );
  /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LList
