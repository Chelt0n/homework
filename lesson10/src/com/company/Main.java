package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("слово");
        list.add("слово");
        list.add("слово");
        list.add("слово");
        list.add("слово");
        list.add("слово");
        list.add("слово");
        list.add("раз");
        list.add("два");
        list.add("три");
        list.add("четыре");
        list.add("пять");
        list.add("шесть");
        list.add("семь");
        list.add("восемь");
        Set<String> words = new HashSet<>(list);
        System.out.println(words);
        System.out.println(words.size() + "< число уникальных слов \n");


        Phonebook phonebook = new Phonebook();
        phonebook.add("Sergey",78454545L);
        phonebook.add("Sergey",881123545L);
        phonebook.add("Bob",884454123L);
        phonebook.add("Fedr",8843454123L);
        phonebook.add("Alex",8844512323L);


        System.out.println(phonebook.get("Bob"));
        System.out.println(phonebook.get("Sergey"));


    }

}
