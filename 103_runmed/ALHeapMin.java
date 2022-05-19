/*
Fred (Brian kang, Brian Wang, Ethan lam)
APCS
2022--05--18
HW103 Actual heaping steaming heap of
Time spent: literally too many hrs
*/
import java.util.ArrayList;
public class ALHeapMin{
  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeapMin()
  {
    _heap = new ArrayList();
  }


  public int size(){
    return _heap.size();
  }


  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
    return _heap.toString();
  }//O(n)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
    return _heap.isEmpty();
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peek()
  {
    if(_heap.size() > 0){
      return _heap.get(0);
    }
    else{
      return null;
    }
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO: 1. Insert as next child. 2. While current node is greater than parent node, swap.
   * <your clear && concise procedure here>
   */
   public void add( Integer addVal ){
     _heap.add(addVal);
     if(_heap.size() > 1){
       int curInd = _heap.size() - 1;
       int parInd = (curInd-1)/2 ;
       while(_heap.get(curInd)<_heap.get(parInd)){
         swap(curInd, parInd);
         curInd = parInd;
         parInd = (curInd - 1)/2;
     }
   }
 }//O(log n)


  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO: 1. While node has children, swap node and least child. Go to just swapped node. 2. repeat. 3. Cut tail.
   * <your clear && concise procedure here>
   */
  public Integer remove()
  {
    if ( _heap.size() == 0 )
      return null;

    //store root value for return at end of fxn
    Integer retVal = peek();

    //store val about to be swapped into root
    Integer foo = _heap.get( _heap.size() - 1);

    //swap last (rightmost, deepest) leaf with root
    swap( 0, _heap.size() - 1 );

    //lop off last leaf
    _heap.remove( _heap.size() - 1);

    // walk the now-out-of-place root node down the tree...
    int pos = 0;
    int minChildPos;

    while( pos < _heap.size() ) {

      //choose child w/ min value, or check for child
      minChildPos = minChildPos(pos);

      //if no children, then i've walked far enough
      if ( minChildPos == -1 )
        break;
      //if i am less than my least child, then i've walked far enough
      else if ( foo.compareTo( _heap.get(minChildPos) ) <= 0 )
        break;
      //if i am > least child, swap with that child
      else {
        swap( pos, minChildPos );
        pos = minChildPos;
      }
    }
    //return removed value
    return retVal;
  }//O(log n)


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
    if(2*pos+2<_heap.size()){
      return minOf(2*pos+1, 2*pos+2);
    }
    else if(2*pos+1<_heap.size()){
      return 2*pos+1;
    }
    else{
      return -1;
    }
  }//O(1)


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );
  }
}
