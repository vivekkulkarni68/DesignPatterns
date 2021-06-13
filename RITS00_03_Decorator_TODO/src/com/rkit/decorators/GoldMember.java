package com.rkit.decorators;

//A concrete Decorator
//TODO fix compilation problems and then proceed
public class GoldMember extends Clubmember {
	private int GOLD_MEMBER_BENEFIT = 2000;

	// TODO get access to account;
	@Override
	public int getODLimit() {
		// TODO#1 get accountHolders existing ODLimit
		// TODO#2 : Decorate the object by adding extra OD limit for Gold
		// members
		return 0;
	}

}
