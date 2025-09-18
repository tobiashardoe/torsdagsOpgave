import java.util.ArrayList;
ArrayList<Integer> numbers = new ArrayList();
ArrayList<String> names = new ArrayList();
ArrayList<Boolean> statements = new ArrayList();
void setup() {
  numbers.add(25);
  numbers.add(23);
  numbers.add(21);
  int total = sumOfNumbers(numbers);
  println("Sum of "+numbers.get(0)+" "+numbers.get(1)+" "+numbers.get(2)+": "+total);
  float averageNumber = averageAge(numbers);
println("The average number is: "+averageNumber);

  names.add("Person 1");
  names.add("Person 2");
  names.add("Person 3");
  printNames(names);

  statements.add(true);
  statements.add(false);
  statements.add(true);
}
int sumOfNumbers(ArrayList<Integer> sum) {
  int s = 0;
  for (int number : sum) {
    s += number;
  }
  return s;
}

void printNames(ArrayList<String> listToPrint) {
  for (String name : listToPrint) {
    println("Name: "+name);
  }
}

float averageAge ( ArrayList<Integer> avgAge) {
  if (avgAge == null || avgAge.size() == 0) {
    return 0;
  }
  int sum = 0;
  for ( int num:avgAge){
  sum+=num;
  
  }
  return sum / avgAge.size();
}
