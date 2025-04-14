package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {

    public static void main(String[] args) {
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "name = 홍길동");
        map.put("rating", "rating = vip");
        map.put("age", "age = 30");

        listMap.add(map);

        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("name", "name = 김기영");
        map1.put("rating", "rating = gold");
        map1.put("age", "age = 35");

        listMap.add(map1);

        for(Map<String, Object> strMap : listMap){

            //System.out.println(strMap);
            System.out.println(strMap.get("name") + " ");
            System.out.println(strMap.get("rating") + " ");
            System.out.println(strMap.get("age") + " ");

        }



        }

    }
