Program to find century for a year:
Input1 : year = 1970
Output1 : 20 century 

Input2 : year = 1800
Output2 : 18 century

class Main(){
  public int centuryfromYear(int year){
    int result = 0;
    if(year % 100 == 0) result = year/100;
    else result = (year /100)+1;
  }
  return result;
}
