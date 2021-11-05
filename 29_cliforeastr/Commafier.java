/*
Oscar Breen, Ethan Lam
APCS
HW30 -- Stackin' -- recursive and for each loop
2021-11-2
time spent: 2
DISCO right to left vs left to right matters a lot
QCC: none
*/
public class Commafier{

public static String commafyF(int x){


String n = x + "";
int commafied = (n.length() - 1) / 3; ;

for(int i = 1; i<= commafied; i++){

n= n.substring(0 , n.length()- 3*i - (i-1))
 + "," +  n.substring (n.length() - 3*i - (i-1));

}

return n;
}

public static String commafyR(int x){
String n = x + "";
if (n.length() <= 3) {
return n;
}
else {
return commafyR(Integer.parseInt(n.substring(0 , n.length()-3))) + "," + n.substring(n.length() -3);
}
}

public static void main(String [] args){
System.out.println(commafyF(1000));
System.out.println(commafyF(10002));
System.out.println(commafyF(155500));
System.out.println(commafyR(1000));
System.out.println(commafyR(10002));
System.out.println(commafyR(155500));
}
}
