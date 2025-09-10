// task 1.a.b
void setup() {
  greetingFromMethod();
  printMessage("This is the message");
  nameAndAge("Tobias ", 23);
}
void greetingFromMethod() {
  println("Hello from the method");
}
// task 1.c
void printMessage(String msg) {
  println(msg);
}
// task 1.d
void nameAndAge(String navn, int alder) {
  println("My name is " + navn + ", I am " + alder + " years old");
}
