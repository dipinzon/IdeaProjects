import Classes.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    /*public void getObject(superClass Object2)
    {
        System.out.println(Object2);
    }*/


    //CLASSSES
    static class MyRegex
    {
        static String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        public static String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
    }


    public static void main(String[] args) throws IOException {


        /*System.out.println(100 + 100 + "Diego");
        System.out.println("Diego" + 100 + 100);*/

        //General Validation Check
        ///////////////////////////
        //String[] groceries = new String[] {"corn", "chocolate","jelly beans","cookies"};

        /*for(String item : groceries) {
            System.out.println(item.length());
        }*/

        //1. Simple Array
        /////////////////////////////////////////////////////////////////////////

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
        /////////////////////////////////////////////////////////////////////////
        //char[][] letters = {{'A', 'a'}, {'B', 'b'}, {'C', 'c'}};
        //traverse2DArray tarray = new traverse2DArray();
        //tarray.majorOrder(letters); //horizontally through each row starting at the first row and ending with the last
        //System.out.println();
        //tarray.columnOrder(letters); //vertically down each column starting at the first column and ending with the last.

        //1.2 Remove an element of an Array
        /////////////////////////////////////////////////////////////////////////

        /*int [] originalArray = {1,2,3,4,5};
        int elementToRemove=4;

        arrayPractice arrayP = new arrayPractice();

        int[] newArray = arrayP.removeElement(originalArray,elementToRemove);
        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(newArray));*/

        //2.1 ArrayList
        ////////////////////////////////////////////////////////////////////////

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
        ////////////////////////////////////////////////////////////////////////
        //Uses a double linked list. It provides efficient insertion and deletion operations but slower random access.
        //It is suitable for scenarios that involve frequent insertions or deletions.
        /*LinkedList<String> days = new LinkedList<String>();
        days.add("monday");
        days.add("tuesday");
        System.out.println(days);
        System.out.println(days.get(0));//others: getFirst()/getLast()*/

        //2.2 HashMap (Collection of value pairs)
        ////////////////////////////////////////////////////////////////////////////
        //To declare a HashMap, we need to state the data type of both the key and the value.
        //Note that a HashMap only takes in reference type values

        /*HashMap<String, Integer> teaSleeping = new HashMap<>();
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
        System.out.println(teaSleeping.values());*/

        //2.2 Fibonacci with Hashmap BigO = O(n)
        /*Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        System.out.println(fiboNacci.fibMemo(10,map));
        System.out.println(map);*/


        //2.3 Sets --> A Set stores an unordered collection of unique values.
        //////////////////////////////////////////////////////////////////


        //3. FizzBuzz (Mathematical Operators)
        //////////////////////////////////////////////////////////////////
        //fizzBuzz datos = new fizzBuzz();
        //List<String> lista = datos.fizzBuzz(10);
        //System.out.println(lista);

        //accesorMethods gett = new accesorMethods("Pedro");
        //System.out.println(gett.getNombre());
        //gett.setNombre("Juan");
        //System.out.println(gett.getNombre());

        //4. Inheritance
        ////////////////////////////////////////////////////////////////

        //subClass inherit = new subClass();
        //System.out.println(inherit.shape);
        //System.out.println(inherit.isCocked);

        //5. Polymorphism
        //////////////////////////////////////////////////////////////////

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

        //5. Immutable class
        ////////////////////////////////////////////////////////

        /*ArrayList listOfStates = new ArrayList();
        listOfStates.add("Ontario");
        listOfStates.add("Quebec");
        listOfStates.add("Alberta");

        inMutableClass country  = new inMutableClass("Canada",listOfStates);
        System.out.println("Country : " + country.getCountryName());
        System.out.println("List of States: " + country.getListOfStates());

        // Is not enough to be immutable
        // It will be added to the list because we did not use clone in getListOfStates
        //We did not use clone in getListOfStates() method, so we are able to add “British” to the listOfStates.
        country.getListOfStates().add("British Columbia");
        //We did not do deep copy for listOfStates , so we are able to add “Nova Scotia” to the list.
        // It will be added to the list because we did not use deep copy in constructor
        listOfStates.add("Nova Scotia");
        System.out.println("Updated list: " + country.getListOfStates());*/

        //6.FindContinuousSequences
        /////////////////
        /*Object[] input = {1, 2, 3, 5, 9, "a", 6, 7, 8 ,4, "@", -5, -7, -3, -2, -1};
        List<List<Integer>> sequences = NumberSequenceFinder.findContinuousSequences(input);
        for (List<Integer> sequence : sequences) {
            System.out.println(sequence);
        }*/


        ///////////////////////////////////////////////////////////////////////////////////////
        ///HACKER RANK
        ///////////////////////////////////////////////////////////////////////////////////////
        /// ///////////////////////////////////////////////////////////////////////////////////

        /// /////
        //LOOPS
        /// /////
        /// ///////////////
        /*https://www.hackerrank.com/challenges/java-loops-i*/
        /*Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.*/
        /// ///////////////////
        /*int n = 2;
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + "x" + i + " = " + result);
        }
        We use the integers , , and  to create the following series:
         (a + 2^0*b + 2^n-1*b)
        You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers*/

        /// ////////////////////
        /*Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=1;i<=t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = a;
            for (int j = 0; j < n; j++) {
                result += (int) (Math.pow(2, j) * b);
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();*/

        /////////////////////////
        /*A byte is an 8-bit signed integer.
        A short is a 16-bit signed integer.
        An int is a 32-bit signed integer.
        A long is a 64-bit signed integer.
        Given an input integer, you must determine which primitive data types are capable of properly storing that input.*/
        /// ///////////////////////

        /*Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-(Math.pow(2,64-1))  && x<=(Math.pow(2,64 -1 )-1)) System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }*/
        /// //////////
        //STRINGS
        /// //////////

        /// ///////////////////////////
        /*Given a string, , and two indices,  and ,
         print a substring consisting of all characters in the inclusive range from start to end-1 .
         You'll find the String class' substring method helpful in completing this challenge.*/
        /// ///////////////////////////

        /*Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String result = S.substring(start, end);

        System.out.println(result);*/

        /// //////////////
        /*REGEX PATTERN*/
        /// //////////////
       /* Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            //evaluates the pattern through the Myregex class
            System.out.println(IP.matches(MyRegex.pattern));
        }
        in.close();*/

     //////////////////
     ///Data Structures
     //////////////////

     /////ARRAYS

     /*Scanner in = new Scanner(System.in);

     int n = in.nextInt();
     int a[] = new int[n];

     for(int i=0; i < n; i++){
        int val = in.nextInt();
        a[i] = val;
     }
     in.close();

     for (int i=0; i < a.length; i++){
         System.out.println(a[i]);
     }*/

     ///////ARRAY2D
     //https://www.hackerrank.com/challenges/java-2d-array/problem
        /*Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE, sum = 0;
        ;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + 2 < 6) && (j + 2) < 6) {
                    sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
                            + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    if (sum > maxSum)
                        maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
        in.close();*/

        /// ///ARRAYLIST
        //https://www.hackerrank.com/challenges/java-arraylist/problem
        /*Scanner sc = new Scanner(System.in);
        List<ArrayList<Integer>> listOfList = new ArrayList<ArrayList<Integer>>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < m; j++) {
                list.add(sc.nextInt());
            }
            listOfList.add(list);
        }

        int q = sc.nextInt();
        for (int k = 0; k < q; k++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            try {
                int v = listOfList.get(r - 1).get(c - 1);
                System.out.println(v);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }
        sc.close();*/


        /// ///LINKEDLIST


    }
}




