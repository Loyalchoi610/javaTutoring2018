package day4.nestedIfElse;

public class Main {
    public static void main(String[] args){
        boolean a = false;
        boolean b = true;
        if(a)
            if(b)
                System.out.println("2");
        else
            System.out.println("3");
        System.out.println("4");
        //4
    }
}
