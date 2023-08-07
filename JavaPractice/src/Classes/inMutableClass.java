package Classes;

import java.util.ArrayList;

/*
Steps for creating a immutable class:
1. Make your class final :
If you make your class final, no class will be able to extend it, hence will not be able override methods of this class.
2. Declare all instance variable with private and final :
If you make instance variable private, no outside class will be able to access instance variables and if you make them final, you can not change it.
3. Say no to setter methods :
Don’t create setter method for any instance variables, hence there will be no explicit way to change state of instance variables.
4. Initialize all variables in constructor :
You can initialize variables in constructor. You need to take special care while working with mutable object. You need to do deep copy in case of imutable objects.
5. Perform cloning of mutable objects while returning from getter method:
If you return clone of object from getter method, it won’t return original object, so your original object will remain intact. I will explain this more in later part of this tutorial.
*
*/
public final class inMutableClass {
    private final String countryName;

    private final ArrayList listOfStates;

   public inMutableClass(String countryName, ArrayList listOfStates)
   { this.countryName = countryName;
     //this.listOfStates = listOfStates; ******
     //DeepCopu
     ArrayList tempList = new ArrayList();
     for(int i = 0; i < listOfStates.size();i++)
     {
         tempList.add(listOfStates.get(i));
     }
     this.listOfStates = tempList;
   }

    public String getCountryName() {
        return countryName;
    }

    public ArrayList getListOfStates() {
        //return listOfStates;*****
        //Clone
        return (ArrayList) listOfStates.clone();
    }

}
