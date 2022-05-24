/*
Fred (Brian Wang, Brian Kang, Ethan Lam
APCS
HW105: Processing Pain
2022-05-23
time spent: 0.2 hrs

NOTE: 
What this does: Counts every time you click. That's it.

Why you care: Because you can do something whenever you click.
Or you can just count your cps for competitive minecraft gaming. 
*/

int counter = 0;
int timer = second();

void setup(){
 size(600, 600);
 
 
}

void draw(){

}

void mouseClicked(){
  if(timer < second() + 10){
    println(counter);
    counter ++;
  }
}
