
public class GumballMachine {

	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	int state = SOLD_OUT;
	int count = 0;

	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}

	public void insertQuarter() {
		// TODO write code : valid state for this transition is NO_QUARTER

	}

	public void ejectQuarter() {
		// TODO write code : valid state for this transition is HAS_QUARTER
	}

	public void turnCrank() {
		// TODO write code : valid state for this transition is HAS_QUARTER
	}

	public void dispense() {
		// TODO write code : valid state for this transition is SOLD and count
		// >0
	}

	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = NO_QUARTER;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004\n");
		result.append("Inventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\nMachine is ");
		if (state == SOLD_OUT) {
			result.append("sold out");
		} else if (state == NO_QUARTER) {
			result.append("waiting for quarter");
		} else if (state == HAS_QUARTER) {
			result.append("waiting for turn of crank");
		} else if (state == SOLD) {
			result.append("delivering a gumball");
		}
		result.append("\n");
		return result.toString();
	}
}
