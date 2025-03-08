package Classes.practice;

public class subClass extends superClass{
    public subClass(){
        super("Flat");
    }

    @Override
    public void move(){
        System.out.println("The penguin waddles away");
    }

}
