package com.watts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TheSetInterface {
	
	/**
     * Method explaining with an example how the Set interface works.
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public void setInterfaceBasics(){
        int index = 0;
        List<String> phoneContacts = new ArrayList<>();
        

        phoneContacts.add("Lanie Watts");
        phoneContacts.add("Eliette Watts");
        phoneContacts.add("Mijael Watts");
        phoneContacts.add("Mijael Watts");

        Set<String> contactsHashSet = new HashSet<>(phoneContacts);
        Set<String> contactsTreeSet = new TreeSet<>(phoneContacts);
        Set<String> contactsLinkedHashSet = new LinkedHashSet<>(phoneContacts);

        String[] message = {
                "\nRepeated contacts removed (HashSet) order changes due to hash keys generated:",
                "\nRepeated contacts removed (TreeSet) ascending order:",
                "\nRepeated contacts removed (LinkedHashSet) insertion order respected:"
        };
        Set[] setArray = {contactsHashSet, contactsTreeSet, contactsLinkedHashSet};

        System.out.println("Original contacts (ArrayList):");
        for(String contactName : phoneContacts) {
            System.out.println(contactName);
        }

        while(index < 3){
            Set<String> setString = setArray[index];

            System.out.println(message[index]);

            for(String contactName : setString) {
                System.out.println(contactName);
            }

            index++;
        }
    }

    /**
     * Method explaining with an example how the Set interface Bulks work.
     */
    public void setInterfaceBulks() {
        Set<String> farmA = new LinkedHashSet<>();
        Set<String> farmB = new LinkedHashSet<>();

        farmA.add("Cows");
        farmA.add("Horses");
        farmA.add("Pigs");

        farmB.add("Chickens");
        farmB.add("Horses");
        farmB.add("Sheeps");

        System.out.println("Animals in Farm A: " + farmA);
        System.out.println("Animals in Farm B: " + farmB);

        // containsAll() returns true if s2 is a subset of s1.
        Set<String> container = new LinkedHashSet<>(farmA);
        boolean isASubSet = container.containsAll(farmB);

        // addAll() transforms s1 into the union of s1 and s2.
        Set<String> union = new LinkedHashSet<>(farmA);
        union.addAll(farmB);

        // retainAll() transforms s1 into the intersection of s1 and s2 (elements common to both sets).
        Set<String> intersection = new LinkedHashSet<>(farmA);
        intersection.retainAll(farmB);

        // removeAll() transforms s1 into the set difference of s1 and s2.
        Set<String> difference = new LinkedHashSet<>(farmA);
        difference.removeAll(farmB);

        System.out.println("\nFarmA contains the same animals of FarmB? " + isASubSet + (isASubSet ? container : ""));
        System.out.println("Union of FarmA and FarmB: " + union);
        System.out.println("Animals repeated in FarmA and FarmB: " + intersection);
        System.out.println("Animals in FarmA that exist not in FarmB:" + difference);
    }
    
    public void setInterfaceBasicsRealWorldScenario(){
    	
    	Set<Contact> contactSet = new LinkedHashSet<Contact>();
    	
    	Contact contact1 = new Contact("Mijael", "4773214613", "mijael@gmail.com");
    	contactSet.add(contact1);
    	
    	System.out.println(contactSet);
    	
    }

}
