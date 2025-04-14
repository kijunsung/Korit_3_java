package org.example;

abstract class Program {
    public Program() {}
    abstract void develop();
    abstract void defineStructure();
}

class Java extends Program {
    @Override
    public void develop() {
        System.out.println("자바 프로그램을 개발합니다.");
    }
    @Override
    public void defineStructure() {
        System.out.println("메모리를 정리합니다.");
    }
}

class C extends Program {
    @Override
    public void develop() {
        System.out.println("c프로그램을 개발합니다");
    }
    @Override
    public void defineStructure() {
        System.out.println("구조체를 정의합니다.");
    }

}
public class Casting {
    public static void main(String[] args) {
        Program Java = new Java();
        Program C = new C();

        Java.develop();
        Java.defineStructure();

        C.develop();
        C.defineStructure();


    }
}
