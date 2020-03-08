#Create a new class called Animal
class Animal(object):

    #Constructor; what happens when a new Animal is made, requires three parameters
    def __init__(self, name, count, origin):
        #Every animal has a name, count, and origin;
        #set these values based on the parameters
        self.name = name
        self.count = count
        self.origin = origin

    #Getter; return the value of name
    def getName(self):
        return self.name

    #Getter; return the value of count
    def getCount(self):
        return self.count

    #Getter; return the value of origin
    def getOrigin(self):
        return self.origin

    #Setter; update name to the value passed in as a parameter
    def setName(self, newName):
        self.name = newName

    #Setter; update count to the value passed in as a parameter
    def setCount(self, newCount):
        self.count = newCount

    #Setter; update origin to the value passed in as a parameter
    def setOrigin(self, newOrigin):
        self.origin = newOrigin

    #Return a string containing an Animal name, count, and origin
    #in a human-readable form
    def toString(self):
        return "There are "+str(self.count)+" "+self.name+" from origin "+self.origin
