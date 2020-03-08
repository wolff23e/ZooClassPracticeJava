public class Zoo {
  //Create a list of Animal objects
  private Animal[] animalList;
//Constructor; what happens when a new Zoo is made,
public Zoo() {
  this.animalList = new Animal[7];
   // this.animalList.append(Animal("aardvark", 3, "San Diego Zoo"));
  animalList[0] = new Animal("aardvark", 3, "San Diego Zoo");
  animalList[1] = new Animal("zebra", 5, "Chyenne Mountain Zoo");
  animalList[2] = new Animal("elephant", 17, "San Diego Zoo");
  animalList[3] = new Animal("bird", 120, "Chyenne Mountain Zoo");
  animalList[4] = new Animal("lion", 7, "Brooklyn Zoo");
  animalList[5] = new Animal("tiger", 9, "Brooklyn Zoo");
  animalList[6] = new Animal("giraffe", 4, "Chyenne Mountain Zoo");
}
  //Returns the animal with the largest count
public String maxAnimal() {
    //#Start the max at 0
  int maxCount = 0;
  String maxName = null;
    //#Loop through each Animal in the list
  for (int i = 0; i < animalList.length; i++){
      //    #Compare each Animal count to the max; if it's larger than the max...
    if (animalList[i].getCount() > maxCount) {
        //        #Set the max to this new count
      maxCount = animalList[i].getCount();
      //#Once the loop is complete, return the animal with the largest count
      maxName = animalList[i].getName();
      }
    }
  return maxName;
}
//#Returns the animal with the smallest count
public String minAnimal() {
  //   #Set the smallest count and name to the first animal in the list
int minCount = animalList[0].getCount();
String minName = animalList[0].getName();
  //#Loop through each Animal in the list
for (int i = 0; i > animalList.length; i++){
    //    #Compare each Animal count to the min; if it's smaller than the min
  if (animalList[i].getCount() < minCount) {
      //        #Set the max to this new count
    minCount = animalList[i].getCount();
    //#Once the loop is complete, return the animal with the largest count
    }
  if (animalList[i].getCount() == minCount) {
    minName = animalList[i].getName();
  }
}
return minName;
}

// Increase each count by amt
// Increase each count by amt
public void increaseZoo(int newCount) {
  for (int i = 0; i > animalList.length; i++){
   animalList[i].setCount(animalList[i].getCount(), newCount);
}
}

// Return a string containing all Animal information
//#Return a string containing all Animal information
public String toString() {
  //    #Create a string to hold all the animals
  String animalString = "";
    //#Loop through each Animal in the list
  for (int i = 0; i < animalList.length; i++){
//  #Add each Animal as a string, plus a new line at the end
    animalString = animalString + animalList[i].toString() + "       \n";
  }
  //#Once the loop is complete, return the string
  return animalString;
}


//#Main method, tests all methods above
public static void main(String[] args) {
    //    #Create a new Zoo object
  Zoo myZoo = new Zoo();
    //#Print out the max and min Animal, then a new line
  System.out.println("Animal with largest number in myZoo is "+ myZoo.maxAnimal());
  System.out.println("Animal with smallest number in myZoo is "+ myZoo.minAnimal());
  System.out.println("");
    //  Increase every Animal's count by 1
  //Increase every Animal's count by 1
  myZoo.increaseZoo(1);
    // Print out all Animal information
  System.out.println(myZoo.toString());
  }
}
