package day4.nestedIfElse;

public class Main {
    public static void main(String[] args){
        boolean a = false;
        boolean b = true;
        if(a)
            System.out.println("1");
            if(b)
                System.out.println("2");
        else
            System.out.println("3");
        System.out.println("4");
        //4만 출력됨
    }
}
