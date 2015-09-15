// initialization/EnumEx21.java
// TIJ4 Chapter Initialization, Exercise 21, page 207
/* Create an emun of the least-valuable six types of paper currency. Loop through
* the values() and print each value and its ordinal().
*/

public class EnumEx21 {
	public enum Bills {
		ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
	}
	public static void main(String[] args) {
		for(Bills b : Bills.values())
			System.out.println(b + ", ordinal " + b.ordinal());	
	}	
}

/*
输出：
ONE, ordinal 0
FIVE, ordinal 1
TEN, ordinal 2
TWENTY, ordinal 3
FIFTY, ordinal 4
HUNDRED, ordinal 5
*/
