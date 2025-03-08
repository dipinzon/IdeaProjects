package Classes.practice;

import java.util.ArrayList;

public class arrayListPractice {
    //ArrayList

    public void arrList(ArrayList<String> lista) {

        System.out.println(lista);

        //Size
        System.out.println(lista.size());

        //Get
        System.out.println(lista.get(1));

        //Set
        lista.set(2, "Leche");
        System.out.println(lista);

        //remove
        lista.remove(0);
        System.out.println(lista);

        //Index
        System.out.println(lista.indexOf("Queso"));
    }
}
