package day4.switchBreak;

public class Main {
    public static void main(String[] args) {
        char a = 'A';
        switch (a) {
            case 'A':
                System.out.println("1");
                break;
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            default:
                System.out.println("2");
                break;


        }
    }
}
