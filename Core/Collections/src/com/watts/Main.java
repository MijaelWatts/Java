package com.watts;

public class Main {

    public static void main(String[] args) {
//    	TheSetInterface setCollection = new TheSetInterface();
    	TheListInterface listCollection = new TheListInterface();

//        System.out.println("\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> THE SET INTERFACE <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
//        System.out.println("\n \t------- Set Interface Basics -------");
//        setCollection.setInterfaceBasics();
//        System.out.println("\n \t------- Set Interface Bulks -------");
//        setCollection.setInterfaceBulks();
        
        System.out.println("\n \t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> THE LIST INTERFACE <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("\n \t------- List Interface Basics -------");
        listCollection.listInterfaceBasics();
        System.out.println("\n \t ------- List Interface Iterator -------");
        listCollection.listInterfaceIterator();
        System.out.println("\n \t ------- List Interface Range View -------");
        listCollection.listInterfaceRangeView();
    }
    
}
