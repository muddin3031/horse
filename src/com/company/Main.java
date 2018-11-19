package com.company;

public class Main {

    public static void main(String[] args) {
	Horse horse1 = new Mustang("Secretariat", 12000);
	Horse horse2 = new Mustang("dusty Trail", 22000);
	Horse horse3 = new Mustang("silver", 12000);

	Horse[] horse = new Horse[6];

	horse[1] = horse1;
	horse[3] = horse2;
	horse[5] = horse3;
	HorseBarn barn = new HorseBarn(horses);

	System.out.println(barn);
	System.out.println("dusty trail is in space: "+ barn.finHorseSpace("dusty trail"));

	barn.consolidate();
	System.out.println(barn);
	system.out.println("dusty trail is now in space: "+ barn.findHorseSpace("dusty Trail"));
    }
}
