package com.watts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TheListInterface {
	private String[] fuzzballTeamArray = {"Victor Reboots", "Beto Warrior", "Hugo Iron Wall", "Gilberto Slenderman", "Isaac Beaver", "Rodrigo Smith"};
	private List<String> fuzzballTeamList;
	private ListIterator<String> listIterator;

	public void listInterfaceBasics() {
		fuzzballTeamList = Arrays.asList(fuzzballTeamArray);
		
		Collections.shuffle(fuzzballTeamList);
		
		System.out.println("\nArrays printed directly only show memory allocation: " + fuzzballTeamArray);
		System.out.println("\nOn the other hand; Lists can be printed directly. Here's your Fuzzbal team: " + fuzzballTeamList);
	}
	
	public void listInterfaceIterator() {
		byte counter     = 0;
		fuzzballTeamList = new ArrayList<String>();
		
		for(String player : fuzzballTeamArray) {
			fuzzballTeamList.add(player);
		}
		
		Collections.shuffle(fuzzballTeamList);
		listIterator = fuzzballTeamList.listIterator();
		
		System.out.println("PFB the Teams Created:");
		printListThroughIterator(listIterator);
		
		System.out.println("\nRemoving The Last Team...");
		while(counter <= 1) {
			listIterator.previous();
			listIterator.remove();
			
			counter++;
		}
		counter = 0;


		// Since in the previous iterator we reached the end of the list. Now we have to go back in that list.
		while(listIterator.hasPrevious()) {
			listIterator.previous();
		}
		
		System.out.println("\nPFB the Teams Left:");
		printListThroughIterator(listIterator);

	}
	
	public void listInterfaceRangeView() {
		List<String> rangeList = fuzzballTeamList.subList(1, 3);
		
		System.out.println("The complete list: " + fuzzballTeamList);
		System.out.println("The range chosen: " + rangeList);
	}
	
	private void printListThroughIterator(ListIterator<String> listIterator) {
		byte counter = 0;
		
		for(byte i=0; i<fuzzballTeamList.size(); i+=2) {
			System.out.println("******************");
			
			while(listIterator.hasNext()) {
				System.out.println("- " + listIterator.next());
				
				if(counter == 1) {
					counter = 0;
					break;
				}
				
				counter++;
			}
		}
	}

}
