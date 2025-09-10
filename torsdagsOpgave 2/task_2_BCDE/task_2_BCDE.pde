void setup() {
  // task 2.b
  int answer = sum(27, 53);
  println ("The sum of a + b is: " + answer);
  
  
  // task 2.c
  uCase("mit navn er tobias");
 
  
  // task 2.d
  if (upperCaseFirst ("This is the message")){
    println("true"); }
    else {
      println("false");
  }
}
// task 2.b
int sum (int a, int b) {
  int total = a+b;
  return total;
}


// task 2.c
String uCase (String lCase) {
  String upperCase = lCase.toUpperCase();
  println(upperCase);
  return upperCase;
}


// task 2.d
boolean upperCaseFirst(String str) {
  return Character.isUpperCase(str.charAt(0));
}

// task 2.e
