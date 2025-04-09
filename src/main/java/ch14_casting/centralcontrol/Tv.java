package ch14_casting.centralcontrol;

public class Tv implements Power{
    @Override
    public void on() {
        System.out.println("Tv를 켭니다");
    }

    @Override
    public void off() {
        System.out.println("Tv를 끕니다");
    }

    public void  changeChannel() {
        System.out.println("TV체널을 변경합니다.");
    }
}
