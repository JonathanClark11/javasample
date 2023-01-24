
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sudoku.SudokuPuzzle;

public class SudokuPuzzleTest {

	private SudokuPuzzle puzzle;
	
	@Before
	public void setUp() {
		/*
		 * Here is the puzzle
		 * 0 0 8 3 4 2 9 0 0
		 * 0 0 9 0 0 0 7 0 0
		 * 4 0 0 0 0 0 0 0 3
		 * 0 0 6 4 7 3 2 0 0
		 * 0 3 0 0 0 0 0 1 0
		 * 0 0 2 8 5 1 6 0 0
		 * 7 0 0 0 0 0 0 0 8
		 * 0 0 4 0 0 0 1 0 0
		 * 0 0 3 6 9 7 5 0 0 
		 */
		String [][] board = new String [][] {
				{"0","0","8","3","4","2","9","0","0"},
				{"0","0","9","0","0","0","7","0","0"},
				{"4","0","0","0","0","0","0","0","3"},
				{"0","0","6","4","7","3","2","0","0"},
				{"0","3","0","0","0","0","0","1","0"},
				{"0","0","2","8","5","1","6","0","0"},
				{"7","0","0","0","0","0","0","0","8"},
				{"0","0","4","0","0","0","1","0","0"},
				{"0","0","3","6","9","7","5","0","0"}
		};
		puzzle = new SudokuPuzzle(9,9,3,3,new String [] {"1","2","3","4","5","6","7","8","9"});
		puzzle.board = board;
