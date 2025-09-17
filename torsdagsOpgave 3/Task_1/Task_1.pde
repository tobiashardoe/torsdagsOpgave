int[] arr = {28, 230, 9, 310, 72};
void setup(){

 getRandom();

}

int getRandom(){
int i = (int)random(arr.length);

return arr[i];
}
