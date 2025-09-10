
void setup() {

  Student s1= new Student ("Tobias", 23, false, "hold B");
  Student s2= new Student ("Nana", 22, false, "hold B");

  println(s1.name, s1.datamatikerTeam);
  println(s2.name, s2.datamatikerTeam);
  // task 5.c
  boolean areClassmates = isClassmates(s1, s2);
  if (areClassmates) {
    println(s1.name + " and " + s2.name + " are classmates");
  } else {
    println(s1.name + " and " + s2.name + " are not classmates");
  }
}

// task 5.a

boolean isClassmates(Student s1, Student s2) {
  // task 5.b
  if (s1.datamatikerTeam.equals (s2.datamatikerTeam) ) {
    return true;
  } else {
    return false;
  }
}
