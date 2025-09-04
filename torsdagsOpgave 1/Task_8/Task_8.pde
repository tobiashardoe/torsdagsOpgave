int r=color(255,0,0);
int g=color(0,255,0);
int b=color(0,0,255);
int amountOfCircle=1;
int sizeOfCircle=30;
int x=0;
int y=0;

while(amountOfCircle<100){
  amountOfCircle=amountOfCircle+1;
  x=(int)random(100);
y=(int)random(100);
sizeOfCircle=(int)random(30);
r=(int)random(255);
g=(int)random(255);
b=(int)random(255);
  fill(r,g,b);
  circle(x,y,sizeOfCircle);
}
