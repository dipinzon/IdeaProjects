package Classes;

public class superClass {
     public boolean isCocked = false;
     public String shape;

     public superClass(String shape)
     {
         this.shape = shape;
     }

     public void move()
     {
          System.out.println(shape);
     }
}

