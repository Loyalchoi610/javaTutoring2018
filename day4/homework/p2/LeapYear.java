package day4.homework.p2;

//주어진 연도가 윤년인지 아닌지를 출력하는 프로그램을 설계하고 작성하세요.
//
//        윤년: 연도가 4 로 나누어지고 100으로 나누어지지 않는 연도. 단 400으로 나누어지면 윤년
//
//        Example
//
//        1796년은 4로 나누어지고 100으로 나누어지지 않으므로 윤년임
//        그러나 400으로 나누어지면 그 연도는 윤년임
//        2000년은 윤년이나 1800년은 윤년이 아님
//
//        아래의 뼈대 코드에서 isLeapYear 함수 내용물을 작성하세요.
//        isLeapYear 함수는 연도를 정수로 받아서 윤년이면 true, 아니면 false 를 반환하는 함수입니다.
public class LeapYear
{
    public static boolean isLeapYear(int year) {
        if(year%4==0 && (year%100!=0 || year%400==0)){
            return true;
        }
        else{
            return false;
        }
        // fill here!
    }

    public static void main(String[] args)
    {
        // 여기에 test code를 작성해서 작성한 isLeapYear 함수를 테스트해볼 수 있습니다.
        // 예: System.out.println(isLeapYear(2000));    // true 출력
        //     System.out.println(isLeapYear(1800));    // false 출력
        System.out.println(isLeapYear(2000));    // true 출력
        System.out.println(isLeapYear(1800));
    }
}
