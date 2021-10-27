/*
Oscar Breen, Russell Goyachev, Ethan Lam
APCS
HW25 -- Do I repeat myself? -- recursion and while loops compared
2021-10--26
time spent: 1
*/
public class repeater {
  public static String fenceW(int numPosts){
int counter = 1;
    if (counter <= numPosts) {
    System.out.print("|");
  }
      while(counter < numPosts) {
            System.out.print("--|");
                counter++;
          }
return "";
  }

public static String fenceR(int numPosts){
  if (numPosts == 1){
    System.out.print("|");
  }
    else {
    fenceR((numPosts - 1));
    System.out.print("--|");
  }
  return "";
}
public static void main(String[] args) {
System.out.println(fenceW(2));
System.out.println(fenceR(6));
    }
  }
