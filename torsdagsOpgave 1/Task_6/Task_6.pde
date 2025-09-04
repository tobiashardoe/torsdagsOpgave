// task 6.a
int r=color(255,0,0);
int y=color(255,255,0);
int g=color(0,255,0);
int o=color(150);
// task 6.b
int light1=r;
int light2=y;
int light3=g;

//task 6.c
void setup(){
  size (400,400);
  background(0);
  rectMode(CENTER);
  fill(130);
  rect(width/2,height/2,130,300);
  frameRate(30);
}

// task 6.d 
void draw(){
  int cycle=frameCount % 240;
if (cycle<60){
  light1=r;
  light2=o;
  light3=o;
} else if (cycle>=60 && cycle<120){
  light1=r;
  light2=y;
  light3=o;
} else if (cycle>=120 && cycle<180){
  light1=o;
  light2=o;
  light3=g;
} else {
  light1=o;
  light2=y;
  light3=o;
}
// 6.e
fill(light1);
ellipseMode(CENTER);
ellipse(width/2,height/4,90,90);
fill(light2);
ellipse(width/2,height/2,90,90);
fill(light3);
ellipse(width/2,height*0.75,90,90);

 }
