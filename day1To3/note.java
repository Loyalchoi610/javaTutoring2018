package day1To3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class note {

    public static void main(String[] args) throws IOException {
        //page 5
        int digit = 'A';
        char character = 68;
        System.out.println(digit);
        System.out.println(character);
        //page 6
        int a = 4;
        int b = 2;
        System.out.println(a/b);

        int c = 4;
        double d = 2;
        System.out.println(c/d);
        //page 7
        Color color = new Color(0,255,255);
        System.out.println(color.R + " " + color.G +" "+ color.B);
        //왼쪽에서 오른쪽


//        String s="abc"
//        s[0] = "z"
//        cout << s -> "zbc"

        StringBuilder sss = new StringBuilder("abc");
        sss.append(1);
        System.out.println(sss.toString());


        System.out.println("abc" + 1 + 2 + 3);
        System.out.println("abc" + 1 + 2 * 3);



//        정수 + 정수
//        문자열 + 문자열
//        문자열 + 정수
//        우선순위 : 곱셈, 나눗셈 >>> 덧셈 뺄셈
//        (("abc"+1) + (2*3)

//        page 8
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();//1234 5678 9012

        StringTokenizer st = new StringTokenizer(s," ");
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());


    }
}
