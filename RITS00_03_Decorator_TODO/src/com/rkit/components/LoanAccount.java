package com.rkit.components;

//A concrete Component
public class LoanAccount extends Account {

	@Override
	public int getODLimit() {

		return 1000;
	}

}
