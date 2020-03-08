from Animal import Animal as Animal
#Gets all the information from the Animal.py file

#Create a new class called Zoo
class Zoo(object):

    #Constructor; what happens when a new Zoo is made, requires no parameters
    def __init__(self):
        #Create a list of Animal objects
        self.animalList = []
        #Add new Animal objects to the list
        self.animalList.append(Animal("aardvark", 3, "San Diego Zoo"))
        self.animalList.append(Animal("zebra", 5, "Chyenne Mountain Zoo"))
        self.animalList.append(Animal("elephant", 17, "San Diego Zoo"))
        self.animalList.append(Animal("bird", 120, "Chyenne Mountain Zoo"))
        self.animalList.append(Animal("lion", 7, "Brooklyn Zoo"))
        self.animalList.append(Animal("tiger", 9, "Brooklyn Zoo"))
        self.animalList.append(Animal("giraffe", 4, "Chyenne Mountain Zoo"))

    #Returns the animal with the largest count
    def maxAnimal(self):
        #Start the max at 0
        maxCount = 0
        #Loop through each Animal in the list
        for A in self.animalList:
            #Compare each Animal count to the max; if it's larger than the max...
            if A.getCount() > maxCount:
                #Set the max to this new count
                maxCount = A.getCount()
                #Set the biggest animal name to this animal's name
                maxName = A.getName()
        #Once the loop is complete, return the animal with the largest count
        return maxName

    #Returns the animal with the smallest count
    def minAnimal(self):
        #Set the smallest count and name to the first animal in the list
        minCount = self.animalList[0].getCount()
        minName = self.animalList[0].getName()
        #Loop through each Animal in the list
        for A in self.animalList:
            #Compare each Animal count to the min; if it's smaller than the min...
            if A.getCount() < minCount:
                #Set the min to this new count
                minCount = A.getCount()
                #Set the smallest animal name to this animal's name
                minName = A.getName()
        #Once the loop is complete, return the animal with the smallest count
        return minName

    # Increase each count by amt
    def increaseZoo(self, amt):
        #Loop through each Animal in the list
        for A in self.animalList:
            #Set the count of this Animal to the old count + amt
            A.setCount(A.getCount() + amt)

    #Return a string containing all Animal information
    def toString(self):
        #Create a string to hold all the animals
        animalString = ""
        #Loop through each Animal in the list
        for A in self.animalList:
            #Add each Animal as a string, plus a new line at the end
            animalString = animalString + A.toString() + "\n"
        #Once the loop is complete, return the string
        return animalString

#Main method, tests all methods above
def main():
    #Create a new Zoo object
    myZoo = Zoo()

    #Print out the max and min Animal, then a new line
    print("Animal with largest number in myZoo is "+ myZoo.maxAnimal())
    print("Animal with smallest number in myZoo is "+ myZoo.minAnimal())
    print("")
    #Increase every Animal's count by 1
    myZoo.increaseZoo(1)
    #Print out all Animal information
    print(myZoo.toString())

#Run main when this file is run
main()
