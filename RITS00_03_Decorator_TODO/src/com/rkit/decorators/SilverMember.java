package com.rkit.decorators;

//A concrete decorator
public class SilverMember extends Clubmember {
	private int GOLD_MEMBER_BENEFIT = 1000;
	// TODO get access to account;

	@Override
	public int getODLimit() {
		// TODO#1 get accountHolders existing ODLimit
		// TODO#2 : Decorate the object by adding extra OD limit for Silver
		// members
		return 0;
	}

}
