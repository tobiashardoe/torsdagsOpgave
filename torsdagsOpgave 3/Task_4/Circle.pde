class Circle {
  int x;
  int y;

  Circle(int x, int y) {
    this.x=x;
    this.y=y;
  }

  void display() {
    ellipse (x, y, 50, 50);
  }
  void move(int moveX, int moveY){
  x+=moveX;
  y+=moveY;
  display();
  }
}
