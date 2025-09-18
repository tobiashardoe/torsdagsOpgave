int [][] board = new int [8][8];

void setup() {
  size(500, 500);
  for ( int i = 0; i<board.length; i++) {
    for (int j = 0; j<board[i].length; j++) {
      board[i][j] = (i+j) % 2;
      print(board[i][j]);
    }
    println();
  }
}
void draw() {
  int sideLength = 40;
  for (int x = 0; x<board.length; x++) {
    for (int y = 0; y<board[x].length; y++) {
      if (board[x][y] == 0) {
        fill (0);
      } else {
        fill (255);
      }
      rect(x*sideLength, y*sideLength, sideLength, sideLength);
    }
  }
}
