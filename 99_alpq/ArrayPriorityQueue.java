/*
Fred (Brian Kang, Brian Wang, Ethan Lam)
APCS
HW99: Some Are More Equal Than Others, Codified
2022-05-13
time spent: 1hr + class time
*/
import java.util.ArrayList;
public class ArrayPriorityQueue{
  public ArrayList<Integer> pQueue = new ArrayList<Integer>();

  //amortized linear
  public void add(int x){
    pQueue.add(x);
  }

  //constant
  public boolean isEmpty(){
    return !(pQueue.size()>0);
  }

  //linear
  public int peekMin(){
    int minInd = 0;
    for(int i = 1 ; i < pQueue.size() ; i++){
      if(pQueue.get(minInd) > pQueue.get(i)){
        minInd = i;
      }
    }
    return pQueue.get(minInd);
  }

  //linear
  public int removeMin(){
    int minInd = 0;
    for(int i = 1 ; i < pQueue.size() ; i++){
      if(pQueue.get(minInd) > pQueue.get(i)){
        minInd = i;
      }
    }
    return pQueue.remove(minInd);
  }

  public String toString(){
    return pQueue.toString();
  }
}
