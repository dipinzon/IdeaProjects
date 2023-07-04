import Classes.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1. Simple Array///////////////
        //String[] words = {"Ford","Audi","Tesla","Tesla","Honda","GM","GM","Lincoln","Mazda"};
        //arrayPractice arrayP = new arrayPractice();
        //arrayP.simpleArray(words);

        //2. ArrayList//////////////////
        /*arrayListPractice arrLista = new arrayListPractice();
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Pan");
        lista.add("Queso");
        lista.add("Huevos");
        arrLista.arrList(lista);*/

        //3. FizzBuzz//////////////////
        //fizzBuzz datos = new fizzBuzz();
        //List<String> lista = datos.fizzBuzz(10);
        //System.out.println(lista);

        accesorMethods gett = new accesorMethods("Pedro");
        System.out.println(gett.getNombre());
        gett.setNombre("Juan");
        System.out.println(gett.getNombre());

    }
}