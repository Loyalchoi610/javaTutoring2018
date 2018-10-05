package day4.homework.p1;

public class Employee
{
//    직원의 연봉과 근무평가등급을 받아 새 연봉을 계산하여 반환하는 함수를 작성하세요.
//
//    직원의 근무평가등급은 우수 보통과 불량 중 하나입니다.
//
//  1(우수) 등급을 받은 직원은 연봉이 6% 인상
//  2(보통) 등급을 받은 직원은 연봉이 4% 인상
//  3(불량) 등급을 받은 직원은 연봉이 2% 인상
//    아래 Employee 클래스 코드에서 applyIncreaseRate 함수의 내용물을 작성하세요.
//
//    예제 모범 출력은 아래 main 함수에 주석으로 있습니다.
    private Double salary;  // 연봉
    private int evalGrade;  // 근무평가등급

    public Employee(Double salary, int evalGrade) {
        this.salary = salary;
        this.evalGrade = evalGrade;
    }

    // get 함수 모음
    public Double getSalary() {
        return salary;
    }

    public int getEvalGrade() {
        return evalGrade;
    }

    // set 함수 모음
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setEvalGrade(int evalGrade) {
        this.evalGrade = evalGrade;
    }

    public void set(Double salary, int evalGrade) {
        this.salary = salary;
        this.evalGrade = evalGrade;
    }

    // 근무평가등급에 따라 현재 연봉을 인상시키고, 연봉 인상 금액을 반환한다.
    public Double applyIncreaseRate(){
        switch (evalGrade){
            case 1 :
                salary = salary*106/100;
                break;
            case 2 :
                salary = salary*104/100;
                break;
            case 3 :
                salary = salary*102/100;
                break;

        }
        // fill here!
        return salary;

    }

    public static void main(String args[]) {
        // 여기에 test code 를 작성해서 테스트해볼 수 있습니다.
        // 예:
           Employee emp = new Employee(2400.0, 1);
           System.out.println(emp.applyIncreaseRate()); // 2544.0 출력
    }

}