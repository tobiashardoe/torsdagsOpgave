String address;

int addition;

float division;

String msg;

//task 4 a.b.c.
void setup(){  

address= "Fiskovej 18";
addition= 15+31;
division= 50.0/7.0;
msg= "Tobias Hardø";

println("Adresse: "+address);
println("15+31: "+addition);
println("50/7: "+division);
println("Hej, mit navn er: "+msg);

//task 4 d.

address= "navnegade2";
addition= 16+21;
division= 27.0/6.0;
msg= "navnegade2, 37, 4.5";

println("Adresse: "+address);
println("16+21: "+addition);
println("27/6: "+division);
println("Dette er de nye svar: "+msg);

//task 4. e
address= "navnegade2, København";
addition= 16+21+19;
division= 27.0/6.0/2;
msg= "address  = navnegade2 København, addition = 56, division = 2,25";

println("Adresse: "+address);
println("16+21+19: "+addition);
println("27/6/2: "+division);
println("Dette er de nye svar: "+msg);

//task 4. f

addition++;
division++;
println(addition);
println(division);

// task 4. g

addition+=3;
division+=3;
println(addition);
println(division);

// task 4. h

addition--;
division--;
println(addition);
println(division);



}
