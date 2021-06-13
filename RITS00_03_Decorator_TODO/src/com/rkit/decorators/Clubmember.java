package com.rkit.decorators;

import com.rkit.components.Account;

//An abstract Decorator
public abstract class Clubmember extends Account {
	// TODO create a relation ship between this decorator
	// and

	@Override
	public abstract int getODLimit();

}
