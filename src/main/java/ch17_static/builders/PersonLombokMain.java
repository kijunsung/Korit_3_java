package ch17_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok person1 = PersonLombok.builder()
                .name("안근수")
                .age(38)
                .address("부산")
                .build();
        System.out.println(person1);



    }
}
