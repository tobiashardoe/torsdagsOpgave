void setup() {
  String printWord = "Datamatiker";
  printPartOfWord(printWord,0,3);
  println(printPartOfWord(printWord,0,3));
 println(printPartOfWord(printWord,printWord.length()-4,printWord.length()));
  
}
String printPartOfWord( String word, int start, int end) {
  if (start < 0 || end > word.length() || start > end){
    println("Der er fejl i dine indeks");
}
  return word.substring(start,end);
}

// man kommer out of bounds, hvis man har negative værdier, startværdien er højere end slutværdien
