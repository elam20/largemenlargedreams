/*
Oscar Breen, Russel Goychayev, Ethan Lam
APCS
HW21 -- STAtisTically Speaking... Making code for our pre-break main.
DISCO: int and double cna use generlaly same methods slightly altered
QCC: what is the NaN error?
*/

public class Stats {

  public static int mean(int a, int b){
int sum = (a + b);
int rem = (sum % 2);
if (rem == 0){
int  avg = ( sum / 2 );
return avg;
}
else{
int avg = ((sum + 1)/ 2);
return avg;
}
}

  public static double mean(double a, double b) {
double sum = (a + b);
double avg = (sum / 2);
return avg;
  }

  public static int max(int a, int b) {
if (a > b){
  return a;
}
else {
return b;
}
  }

  public static double max(double a, double b) {
  if (a > b){
    return a;
  }
  else {
  return b;
  }
    }

  public static int geoMean(int a, int b) {
int mult = a * b;
double sqrt = ( Math.pow(mult, 0.5));
return (int)sqrt;
}

  public static double geoMean(double a, double b) {
double mult = a * b;
double sqrt = ( Math.pow(mult, 0.5));
return sqrt;
  }
  public static int max(int a, int b, int c) {
  if ((a > b) & (a > c)){
    return a;
  }
  if ((c > b) & (c > a)){
    return c;
  }
  else {
  return b;
  }
    }

  public static double max(double a, double b, double c) {
  if ((a > b) & (a > c)){
    return a;
  }
  if ((c > b) & (c > a)){
    return c;
  }
  else {
  return b;
  }
    }

  public static int geoMean(int a, int b, int c) {
  int mult = a * b * c;
  double sqrt = ( Math.pow(mult, 0.5));
  return (int)sqrt;
  }

  public static double geoMean(double a, double b, double c) {
    double mult = a * b * c;
    double sqrt = ( Math.pow(mult, 0.5));
    return (int)sqrt;
    }


  //main method for testing functionality
  public static void main( String[] args ) {
//as intended
System.out.println(mean (5, 10));
System.out.println(mean (5.0, 10.0));
System.out.println(max (5, 6));
System.out.println(max (5.0, 6.0));
System.out.println(geoMean (5, 6));
System.out.println(geoMean (5.0, 6.0));
System.out.println(max (5, 6, 7));
System.out.println(max (5.0, 6.0, 7.0));
System.out.println(geoMean (5, 6, 7));
System.out.println(geoMean (5.0, 6.0, 7.0));

// maybe break
System.out.println(mean (-1000000, -10000000));
System.out.println(mean (-5.0, 10.0));
System.out.println(max (5000, -6));
System.out.println(max (5.000, 16.0));
System.out.println(geoMean (45, -6));
System.out.println(geoMean (55.0, -6.0)); // gives NaN?
System.out.println(max (5, 5, 7));
System.out.println(max (5.0, 6.0, 7.0));
System.out.println(geoMean (-5, -6, -7));
System.out.println(geoMean (-5.0, -6.0, -7.0));
  }

}//end class
