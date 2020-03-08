public class Animal {
  public String name;
  public int count;
  public String origin;
  
  // constructor below 
public Animal(String name,int count, String origin){
  this.name = name;
  this.count = count;
  this.origin = origin;
}
//getter; return of name
public String getName(){
  return name;
}

//Getter; return the value of count
public int getCount() {
  return count;
}
//Getter; return the value of origin
public String getOrigin() {
  return origin;
}

//    #Setter; update name to the value passed in as a parameter
public void setName( String name, String newName) {
  this.name = newName;
}

// setter; update count to the value passed in as a parameter
public void setCount(int count, int newCount) {
  this.count = newCount;
}

//Setter; update origin to the value passed in as a parameter
public void setOrigin(final String origin, final String newOrigin) {
  this.origin = newOrigin;
}

//Return a string containing an Animal name, count, and origin
//   #in a human-readable formreturn 
//"There are "+str(self.count)+" "+self.name+" from origin "+self.origin

public String toString() {
  return "There are " + this.count + " " + this.name + " from origin " + this.origin;
}
}
