/**
 * This class implements a vendor that sells one kind of items. A vendor carries
 * out sales transactions.
 */
public class Vendor {
	// Fields:
	private int priceOfTheItem;
	private int howManyInStock;
	private int moneyPutIn;
	private int change;

	/**
	 * Constructs a Vendor
	 * 
	 * @param price the price of a single item in cents (int)
	 * @param stock number of items to place in stock (int)
	 */
	public Vendor(int itemPrice, int stock) {
		howManyInStock = stock;
		priceOfTheItem = itemPrice;
		change = 0;
	}

	/**
	 * Sets the quantity of items i1n stock.
	 * 
	 * @param stockNumber number of items to place in stock (int)
	 */

	public void setStock(int stockNumber) {
		howManyInStock = stockNumber;
	}

	/**
	 * Returns the number of items currently in stock.
	 * 
	 * @return number of items currently in stock (int)
	 */
	public int getStock() {
		return howManyInStock;
	}

	/**
	 * Adds a specified amount (in cents) to the deposited amount.
	 * 
	 * @param number of cents to add to the deposit (int)
	 */

	public void addMoney(int cents) {
		moneyPutIn += cents;
	}

	/**
	 * Returns the currently deposited amount (in cents).
	 * 
	 * @return number of cents in the current deposit (int)
	 */
	public int getDeposit() {
		return moneyPutIn;
	}

	/**
	 * Implements a sale. If there are items in stock and the deposited amount is
	 * greater than or equal to the single item price, then adjusts the stock and
	 * calculates and sets change, sets deposit to 0 and returns true; otherwise
	 * refutnds the whole deposit (moves it into change) and returns false.
	 * 
	 * @return true for a successful sale, false otherwise (boolean)
	 */

	public boolean makeSale() {
		if (howManyInStock > 0 && moneyPutIn >= priceOfTheItem) {
			howManyInStock--;
			change = priceOfTheItem - moneyPutIn;
			moneyPutIn = 0;

			return true;

		}
		change = moneyPutIn;
		moneyPutIn = 0;
		// No need for an else statement for this second retrun because the first return
		// would bring you out of the method
		return false;
	}

	/**
	 * Returns and zeroes out the amount of change (from the last sale or refund).
	 * 
	 * @return number of cents in the current change (int)
	 */

	public int getChange() {
		// Setting temp var here so you can reset the change and return its value in the
		// same method
		int temp = change;
		change = 0;
		return temp;

	}
}
