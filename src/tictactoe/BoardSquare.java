package tictactoe;


import javafx.scene.shape.Rectangle;

/**
 * A single square on the game board.
 * 
 * @author Jim
 * 
 */
public class BoardSquare extends Rectangle {
	/** square knows its own row and column. */
	private int row;
	private int column;
	
	/**
	 * Initialize of board square.
	 * @param row is number of row.
	 * @param col is number of column.
	 * @param size is size of square.
	 */
	public BoardSquare(int row, int col, int size){
		super(size, size);
        this.row = row;
        this.column = col;
	}
	
	/**
	 * Get the row of square.
	 * @return row of square.
	 */
	public int getRow() {
		return this.row;
	}
	
	/**
	 * Get the column of square.
	 * @return column of square.
	 */
	public int getColumn() {
		return this.column;
	}
	
}
