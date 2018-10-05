package day4.shortCaculation;

public class Main {
    private int x;

    public static void main(String[] args){
        int x=1;int y=2;
        if(x==1||(y=10)==10){
            System.out.println(y);
        }
        int a=1;int b=2;
        if((b=10)==10||a==1){
            System.out.println(b);
        }

        String s = null;
        if(s!=null && s.equals("승언")){

        }

        //s에 String객체가 할당이 안됬는데 함수를 실행

//        if(s.equals("승언") && s!=null ){
//
//        }

    }

}
