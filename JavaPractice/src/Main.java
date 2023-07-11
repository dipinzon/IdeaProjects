import Classes.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //General Validation Check
        //String[] groceries = new String[] {"corn", "chocolate","jelly beans","cookies"};

        /*for(String item : groceries) {
            System.out.println(item.length());
        }*/

        //1. Simple Array///////////////
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
        //char[][] letters = {{'A', 'a'}, {'B', 'b'}, {'C', 'c'}};
        //traverse2DArray tarray = new traverse2DArray();
        //tarray.majorOrder(letters); //horizontally through each row starting at the first row and ending with the last
        //System.out.println();
        //tarray.columnOrder(letters); //vertically down each column starting at the first column and ending with the last.

        //2. ArrayList//////////////////
        /*arrayListPractice arrLista = new arrayListPractice();
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Pan");
        lista.add("Queso");
        lista.add("Huevos");
        arrLista.arrList(lista);*/

        //3. FizzBuzz (Mathematical Operators) //////////////////
        //fizzBuzz datos = new fizzBuzz();
        //List<String> lista = datos.fizzBuzz(10);
        //System.out.println(lista);

        //accesorMethods gett = new accesorMethods("Pedro");
        //System.out.println(gett.getNombre());
        //gett.setNombre("Juan");
        //System.out.println(gett.getNombre());

        //4. Inheritance
        subClass inhe = new subClass();
        System.out.println(inhe.shape);
        System.out.println(inhe.isCocked);

    }
}