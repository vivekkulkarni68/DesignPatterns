package com.rkit;

import java.io.Serializable;

public class ConnectionPool implements Serializable {
	// TODO#1 make this class singleton and run the test case to check if
	// It is singleton.

	public static ConnectionPool getInstance() {
		return null;
	}

	public Object clone() {
		return new ConnectionPool();
	}

}
