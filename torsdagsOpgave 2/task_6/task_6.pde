void setup() {
  // task 6.c
  divisible(10);
}
// task 6.a
int divisible (int number) {
  // task 6.b
  for (int i = 1; i<=100; i++) {
    if (i % number == 0) {
      println(i);
    }
  }
  return 0;
}
