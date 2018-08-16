package tictactoe;

/**
 * Types of pieces in the game.
 * 
 * @author Jim
 */
public enum Player {
	X("X", 1),
	O("O", -1),
	NONE("", 0);
	
	public final String text;
	public final int value;
	
	/**
	 * Constructor.
	 * @param text is text of player.
	 * @param value is value of player.
	 */
	private Player(String text, int value) {
		this.text = text;
		this.value = value;
	}
}
