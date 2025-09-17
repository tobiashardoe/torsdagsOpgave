Circle[] circles = new Circle[10];


void setup() {
  size (500, 500);
  Circle c1 = new Circle (50, 50);
  for (int i = 0; i<circles.length; i++) {
    circles[i] = new Circle ((int)random(width), (int)random(height));
    circles[i].display();
    frameRate(30);
  }
}
void draw(){
  background(0);
for(Circle newCircle:circles){
newCircle.move(1,1);

}


}
