package ru.otus.hw10.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private  Map<String, List<String>> guid;

    public PhoneBook() {
        guid = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (guid.containsKey(name)) {
            List<String> phoneNumbers = guid.get(phoneNumber);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            guid.put(name, phoneNumbers);
        }
    }

    public String find(String name) {
        guid.get(name);
        return name;
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (Map.Entry<String, List<String>> entry : guid.entrySet()) {
            List<String> phoneNumbers = entry.getValue();
            if (phoneNumbers.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}
