boolean happy = true;

void setup() {
  if (iAmHappy())
  {
    println("I clap my hands");
  } else
  {
    println("I don't clap my hands");
  }
  // task 2.b
  int answer = sum(27, 53);
  println ("The sum of that is: " + answer);
}

boolean iAmHappy() {
  // fill out what is missing here:
  // task 2.a
  return happy;
}
// task 2.b
int sum (int a, int b) {
  int total = a+b;
  return total;
}
