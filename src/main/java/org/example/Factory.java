package org.example;

import ch17_static.singleton.Samsung;
import ch17_static.singleton.SmartPhone;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {

    private String factoryName;

    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");

        String model = "갤럭시S26";
        String serial = null;

        Samsung samsung = Samsung.getInstance();


        serial = samsung.createSeiralNumber(model);

        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);

        return smartPhone;
    }
}