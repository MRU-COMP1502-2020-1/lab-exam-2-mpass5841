package lsystems;

public class LSystemSymbolException extends Exception {
	private char symbol;
	
	public LSystemSymbolException (char symbol) {
		this.symbol = symbol;
	}
	
	public Character getSymbol() {
		return symbol;
	}
}
