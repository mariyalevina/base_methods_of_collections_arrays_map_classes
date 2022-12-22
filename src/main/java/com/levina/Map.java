package com.levina;

import java.util.HashMap;
import java.util.Iterator;

public class Map {
    public static void main(String... args) {
        java.util.Map<String, String> email = new HashMap<>();
        email.put("trifrigrebetti-9565@yopmail.com", "Круглов Сергей");
        email.put("tefrigreisedei-4845@yopmail.com", "Петров Петр");
        email.put("nennillellouquo-7990@yopmail.com", "Круглов Сергей");
        email.put("crokebeyabau-5467@yopmail.com", "Петров Сергей");

        System.out.println(email.containsKey("nennillellouquo-7990@yopmail.com"));
        System.out.println(email.containsValue("Круглов Сергей"));

        Iterator iterator = email.keySet().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = email.get(key);
            System.out.println(key);
            System.out.println(value);
        }

        java.util.Map<String, String> email2 = new HashMap<>();
        email2.put("baunerouhouffa-1540@yopmail.com", "Левин Алексей");
        email2.putAll(email);

        System.out.println((String) email2.get("tefrigreisedei-4845@yopmail.com"));

        email2.replace("tefrigreisedei-4845@yopmail.com", "Петров Петр", "Левина Мария");
        System.out.println((String) email2.get("tefrigreisedei-4845@yopmail.com"));
    }
}
