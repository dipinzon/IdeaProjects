import Classes.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;

public class Main {

    public void getObject(superClass Object2)
    {
        System.out.println(Object2);
    }
    public static void main(String[] args) {

        //General Validation Check
        ///////////////////////////
        //String[] groceries = new String[] {"corn", "chocolate","jelly beans","cookies"};

        /*for(String item : groceries) {
            System.out.println(item.length());
        }*/

        //1. Simple Array
        // /////////////

        //Declaring Array
        //---------------
        //String[] words = {"Ford","Audi","Tesla","Tesla","Honda","GM","GM","Lincoln","Mazda"};
        //Crating an Empty Array
        //----------------------
        /*String[] words = new String[5];
        words[0] = "Ford";
        words[1] = "Audi";
        words[2] = "Tesla";
        words[3] = "Tesla";
        words[4] = "Honda";
        arrayPractice arrayP = new arrayPractice();
        arrayP.simpleArray(words);*/

        //1.1 2D Array
        //////////////
        //char[][] letters = {{'A', 'a'}, {'B', 'b'}, {'C', 'c'}};
        //traverse2DArray tarray = new traverse2DArray();
        //tarray.majorOrder(letters); //horizontally through each row starting at the first row and ending with the last
        //System.out.println();
        //tarray.columnOrder(letters); //vertically down each column starting at the first column and ending with the last.

        //2.1 ArrayList
        //////////////////

        /*arrayListPractice arrLista = new arrayListPractice();
        ArrayList<String> lista = new ArrayList<String>(); ///No primitive types allowed
        lista.add("Pan");
        lista.add("Queso");
        lista.add("Huevos");
        lista.add(2, "Galletas");
        lista.add("Salsa");
        System.out.println(lista.get(0));
        arrLista.arrList(lista);*/

        //2.2 LinkedList
        //////////////////
        //Uses a doubly linked list. It provides efficient insertion and deletion operations but slower random access.
        //It is suitable for scenarios that involve frequent insertions or deletions.
        /*LinkedList<String> days = new LinkedList<String>();
        days.add("monday");
        days.add("tuesday");
        System.out.println(days);
        System.out.println(days.get(0));//others: getFirst()/getLast()*/

        //2.2 HashMap (Collection of value pairs)
        //////////////////
        //To declare a HashMap, we need to state the data type of both the key and the value.
        //Note that a HashMap only takes in reference type values

        HashMap<String, Integer> teaSleeping = new HashMap<>();
        teaSleeping.put("Uno", 1);
        teaSleeping.put("Dos", 2);
        System.out.println(teaSleeping);
        //Accesing
        int hashValue = teaSleeping.get("Uno");
        System.out.println(hashValue);
        //Remove All -- teaSleeping.clear
        //Size
        System.out.println(teaSleeping.size());
        //Traversing
        for(String key : teaSleeping.keySet()) {
            System.out.println("Brew " + key + " tea at " + teaSleeping.get(key));
        }
        //Other Methods .containdKey() (true or false), .replace(), .keySet(), .values()
        System.out.println(teaSleeping.keySet());
        System.out.println(teaSleeping.values());

        //2.2 Sets --> A Set stores an unordered collection of unique values. In this article
        //////////////////




        //3. FizzBuzz (Mathematical Operators)
        //////////////////
        //fizzBuzz datos = new fizzBuzz();
        //List<String> lista = datos.fizzBuzz(10);
        //System.out.println(lista);

        //accesorMethods gett = new accesorMethods("Pedro");
        //System.out.println(gett.getNombre());
        //gett.setNombre("Juan");
        //System.out.println(gett.getNombre());

        //4. Inheritance
        ////////////////

        //subClass inherit = new subClass();
        //System.out.println(inherit.shape);
        //System.out.println(inherit.isCocked);

        //5. Polymorphism
        /////////////////

        /*superClass polym1 = new superClass("circle");
        polym1.move();

        subClass polym2 = new subClass();
        polym2.move(); //Method move() with the same signature of the superclass method was override

        //Using a Subclass in Place of its Superclass
        superClass polym3 = new subClass();
        polym3.move();

        //Arraylist that holds objects of a superclass
        superClass object1 = new subClass();
        superClass[] data = {object1};

        //Sending an Object as a Parameter
        Main mainC = new Main();
        superClass object2 = new subClass();
        mainC.getObject(object2);*/



    }
}