package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Company {
    private int companyId;
    private String companyName;
    private String address;
    private String city;
    private String state;
    private String zopCode;
}
public class Test {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;
        String studentJson = null;


        Company company1 = new Company(100, "apple",
                "Apple Computer Inc. 1 infinite Loop", "copertino", "CA","95014");

        System.out.println("json 형태로 변환 : " + gson.toJson(company1));

        System.out.println("java 객체 형태로 출력 : " + company1);

        System.out.println("prettyPrinting 적용 후 출력 : \n" + gsonBuilder.toJson(company1));

        userJson = gsonBuilder.toJson(company1);

    }
}

