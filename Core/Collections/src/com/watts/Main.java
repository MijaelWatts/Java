package com.watts;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> contactsA = new ArrayList<>();

        contactsA.add("Lanie");
        contactsA.add("Eliette");
        contactsA.add("Mijael");
        contactsA.add("Mijael");

        Set<String> contactsB = new HashSet<>(contactsA); // Removes duplicates.
        Set<String> contactsC = new TreeSet<>(contactsA); // Removes duplicates and orders them in ascending order.
        Set<String> contactsD = new LinkedHashSet<>(contactsA); // Removes duplicates and respect the order in which
        // they were inserted.

        System.out.println("Displaying all contacts in list:");
        for(String contactName : contactsA) {
            System.out.println("ArrayList - " + contactName);
        }

        System.out.println("\nList without repeated contacts:");
        for(String contactName : contactsB) {
            System.out.println("HashSet - " + contactName);
        }

        System.out.println("\nList without repeated contacts in order:");
        for(String contactName : contactsC) {
            System.out.println("TreeSet - " + contactName);
        }

        System.out.println("\nList without repeated contacts respecting the insertion order:");
        for(String contactName : contactsD) {
            System.out.println("LinkedHashSet - " + contactName);
        }

        // Set Interface Bulk Operations
    }
}
