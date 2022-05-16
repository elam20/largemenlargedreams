/*
Fred (Brian Kang, Brian Wang, Ethan Lam)
APCS
HW99: Some Are More Equal Than Others, Codified
2022-05-13
time spent: 1hr + class time
*/
public interface PriorityQueue
{
    public void add( int x );

    public boolean isEmpty();

    public int peekMin();

    public int removeMin();
}
