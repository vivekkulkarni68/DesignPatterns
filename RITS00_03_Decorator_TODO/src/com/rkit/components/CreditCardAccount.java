package com.rkit.components;

//A concrete Component
public class CreditCardAccount extends Account {

	@Override
	public int getODLimit() {

		return 2000;
	}

}
