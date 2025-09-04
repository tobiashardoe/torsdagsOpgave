// task 1.a
String month="Marts";
int days= 30;
String dage =" dage";

// task 1.b
switch(month){
  case "Januar":
  days=31;
  break;
  case "Februar":
  days=28;
  break;
  case "Marts":
  days=31;
  break;
  case "April":
  days=30;
  break;
  case "Maj":
  days=31;
  break;
  case "Juni":
  days=30;
  break;
  case "Juli":
  days=31;
  break;
  case "August":
  days=31;
  break;
  case "September":
  days=30;
  break;
  case "Oktober":
  days=31;
  break;
  case "November":
  days=30;
  break;
  case "December":
  days=31;
  break;
}
// task 1.c

  println( month+ " har " +days +dage);
  
  /* en anden måde at skrive det på er 
  switch(month){
  case "Januar":
  case "Marts":
  case "Maj":
  case "Juli":
  case "August":
  case "Oktober":
  case "December":
  days=31;
  break;
  
  case "April":
  case "Juni":
  case "September":
  case "November":
  days=30;
  break;
  
   case "Februar":
  days=28;
  break;
}*/
