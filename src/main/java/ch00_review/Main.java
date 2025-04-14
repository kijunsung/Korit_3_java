package ch00_review;


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int num1 = 10;
        int num2 = 20;
        Calculator calculator1 = new Calculator();
        int add = calculator1.add(num1, num2);
        System.out.println(add);

        int num3 = 200;
        int num4 = 100;
        Calculator calculator2 = new Calculator();
        int sub = calculator2.sub(num3, num4);
        System.out.println(sub);




    }

}
