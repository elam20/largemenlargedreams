/*
Fred (Brian kang, Brian Wang, Ethan lam)
APCS
2022--05--18
HW103 Actual heaping steaming heap of
Time spent: literally too many hrs

Disco:
some weird finnicky gimmick with remove and balancing min and max?

QCC:
work?
*/

import java.util.NoSuchElementException;
public class RunMed{
    /*
    algo:
    add new value to either min or max heap depending on if greater or less than current median
    if needed, balance min and max to be within 1 size of each other
    find the median from either taking the root of the larger heap or taking the average if same size

    DOES NOT WORK BECAUSE OF SOME FINNICKY REMOVE GIMMICK
    */
    ALHeapMin min;
    ALHeapMax max;

    public RunMed(){
        min = new ALHeapMin();
        max = new ALHeapMax();
    }

    public void add(int newVal){

      if(max.peek() != null && newVal < max.peek()){
        max.add(newVal);
      }
      else if(min.peek() != null){
        min.add(newVal);
      }
      else{
        max.add(newVal);
      }
      if(max.size() - min.size() > 1){
        min.add(max.remove());
        max.add(max.remove());
      }
      else if(min.size() - max.size() > 1){
        max.add(min.remove());
        //System.out.println("TEST\n" + min);
        //System.out.println(min.peek());
        min.add(min.remove());
        //System.out.println(min);
      }
    }

    public double getMedian(){
      if(min.size() + max.size() == 0){
        throw new NoSuchElementException();
      }
      else if(max.size() > min.size()){
        return max.peek();
      }
      else if(min.size() > max.size()){
        return min.peek();
      }
      else{
        return (min.peek() + max.peek() * 1.0)/2;
      }


    }

    public String toString(){
      return max.toString() + "\n" + min.toString();
    }


    public static void main(String[] testestestestest){
      RunMed medH = new RunMed();

      medH.add(1);
      System.out.println(medH.getMedian());
      System.out.println(medH + "\n");
      medH.add(2);
      System.out.println(medH.getMedian());
      System.out.println(medH + "\n");
      medH.add(3);
      System.out.println(medH.getMedian());
      System.out.println(medH + "\n");
      medH.add(4);
      System.out.println(medH.getMedian());
      System.out.println(medH + "\n");
      medH.add(5);
      System.out.println(medH.getMedian());
      System.out.println(medH + "\n");
      medH.add(6);
      System.out.println(medH.getMedian());
      System.out.println(medH + "\n");
      medH.add(7);
      System.out.println(medH.getMedian());
      System.out.println(medH + "\n");
      medH.add(8);
      System.out.println(medH.getMedian());
      System.out.println(medH + "\n");
      medH.add(9);
      System.out.println(medH.getMedian());
      System.out.println(medH + "\n");
      medH.add(10);
      System.out.println(medH.getMedian());
      System.out.println(medH + "\n");
      medH.add(11);
      System.out.println(medH.getMedian());
      System.out.println(medH + "\n");
    }

}
