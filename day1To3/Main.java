package day1To3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //Scanner sc = new Scanner(System.in);
        //int scread = sc.nextInt();
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int read = Integer.parseInt(br.readLine());
        //String s = sc.next();
        //int a = Integer.parseInt(sc.next());
        //double ad = Double.parseDouble(sc.next());

        String temp="ab";
        char temp_char = temp.charAt(1); // 'b'

        char[] data = new char[5];
        data[0] = 'a';
        data[1] = 'b';

        //4 바이트(1바이트 = 8비트) - 32비트(0001010 - 32개) - 2^32수를 표현
        int int_a = 1;
        short short_s = 1;

        // 4바이트
        float f = 2;
        // 8바이트
        double b = 2;

        //변수같은 객체
        String new_ss = new String();
        String ss = "승언";

        //ss = ss + "이"; // "승언이"
        ss = ss + 1; // "승언1"
        //printf("%d", a+b);
        //prinf("value of short : %d" , s);
        //"value of short".append(short 형 변수)


        //C언어에서는 불가능 , C++에서는 +에 대한 함수를 정의할수 있다.
        //1 + 2 -> 2
        //void +(int a, int b)


//        System.out.println("value of short " + s);
//        System.out.println(a + b);
        System.out.println(1 + 2);
        System.out.println(4 / 2 );
        System.out.println(3/4); // 3을 4로 나눈 몫
        System.out.println(5/4.0);
         System.out.println(4 / 2.0);
        System.out.println("");
        // 3 + 2 + "cse" -> "5cse
        System.out.println(3 + (2 + "cse"));
        System.out.println(24 / 4*2);
        System.out.println(24 * 4/2);
        System.out.println(ss);
        System.out.println("value of b : " + b);
//        System.out.println("value of s : " + s);
        //8바이트(2^64수를 표현)
        long c;
        char d  = 'a';

        //변수 - 사람
        // 이름 , 국적, 주소

        int [] p = new int[10];
        // 배열 10개 - 모든 배열이 0으로 초기화
        //p.length - 배열 p에 대한 길이값을 반환
        String[][] person = new String[10][10];
        person[0][0] = "승언";
        person[0][1] = "S.Korea";
        person[0][2] = "동수천로 34-1";


        // 1. 나이 person[0][3] = 25 short형 변수로 선언해야 될 상황에 "25"라는 Sting 변수가 들어갑니다.
        // String 변수 하나를 선언하는데 들어가는 메모리양이 short 변수보다 크다.

        // 2.같이 개발하는 사람 고려x
        // person[0] person[1] = 예측 가능
        // person[0][0 , 1 , 2 , 3 ] 주소인지 이름인지 다른사람이 봤을때는 알아볼수 x

        Person person_class = new Person();
        //R,G,B
        String rbgcolor = "0255255";
        //1. 12123148??
        // 0/255/255 - R/G/B Red의 값만 얻어오고 싶어(Blue, Green...)
        Color color = new Color(0,255,255);
        System.out.println("R, G, B, : "+ color.R + " " + color.G +" " + color.B);

    }
}
