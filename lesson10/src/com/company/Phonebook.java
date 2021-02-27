package com.company;

import java.util.*;

public class Phonebook  {

    private HashMap<String, List<Long>> phoneNumber;

    public Phonebook() {
        this.phoneNumber = new HashMap<>();
    }

    public void add(String name, Long number) {
        List<Long> num = new ArrayList<>();

        if (this.phoneNumber.containsKey(name)){
            num = this.phoneNumber.get(name);
            num.add(number);
            this.phoneNumber.put(name, num);
        }
        else {
            num.add(number);
            this.phoneNumber.put(name, num);
        }
    }

    public String get(String s){
        String res = "";

        if (this.phoneNumber.containsKey(s)) {
            res = "Телефон(ы) " + s + ": " +
                    this.phoneNumber.get(s).toString()
                            .replace("[","")
                            .replace("]", "")
                            .replace(",", "")
                            .trim();
        } else {
            res = "Такого номера нет";
        }
        return res;
    }
}