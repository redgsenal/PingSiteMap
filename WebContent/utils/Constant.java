package utils;

import game.exceptions.InvalidBoardXCoordinate;
import game.exceptions.InvalidBoardYCoordinate;
import game.exceptions.PositionOccupiedException;

import java.util.ArrayList;
import java.util.Arrays;

import pieces.Position;
import pieces.TilePiece;
import pieces.TilePieceSet;

public final class Constant {
	
	
	// rank values
	public static final int FLAG_VALUE = 0x001;
	public static final int FIVE_STAR_GENERAL_VALUE = 0x00F;
	public static final int FOUR_STAR_GENERAL_VALUE = 0x00E;
	public static final int LIEUTENANT_GENERAL_VALUE = 0x00D;
	public static final int MAJOR_GENERAL_VALUE = 0x00C;
	public static final int BRIGADIER_GENERAL_VALUE = 0x00B;
	public static final int COLONEL_VALUE = 0x00A;
	public static final int LIEUTENANT_COLONEL_VALUE = 0x009;
	public static final int MAJOR_VALUE = 0x008;
	public static final int CAPTAIN_VALUE = 0x007;
	public static final int FIRST_LIEUTENANT_VALUE = 0x006;
	public static final int SECOND_LIEUTENANT_VALUE = 0x005;
	public static final int SERGENT_VALUE = 0x004;
	public static final int PRIVATE_VALUE = 0x003;
	public static final int SPY_VALUE = 0x002;
	
	// rank order
	public static final ArrayList<Integer> FLAG_LESSER_RANKS = new ArrayList<Integer>();
	public static final ArrayList<Integer> FIVE_STAR_GENERAL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			FOUR_STAR_GENERAL_VALUE, 
			LIEUTENANT_GENERAL_VALUE, 
			MAJOR_GENERAL_VALUE, 
			BRIGADIER_GENERAL_VALUE, 
			COLONEL_VALUE, 
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> FOUR_STAR_GENERAL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			LIEUTENANT_GENERAL_VALUE, 
			MAJOR_GENERAL_VALUE, 
			BRIGADIER_GENERAL_VALUE, 
			COLONEL_VALUE, 
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> LIEUTENANT_GENERAL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			MAJOR_GENERAL_VALUE, 
			BRIGADIER_GENERAL_VALUE, 
			COLONEL_VALUE, 
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> MAJOR_GENERAL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			BRIGADIER_GENERAL_VALUE, 
			COLONEL_VALUE, 
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> BRIGADIER_GENERAL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			COLONEL_VALUE, 
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> COLONEL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> LIEUTENANT_COLONEL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> MAJOR_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> CAPTAIN_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> FIRST_LIEUTENANT_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> SECOND_LIEUTENANT_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> SERGENT_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> PRIVATE_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			SPY_VALUE));
	public static final ArrayList<Integer> SPY_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			FIVE_STAR_GENERAL_VALUE, 
			FOUR_STAR_GENERAL_VALUE, 
			LIEUTENANT_GENERAL_VALUE, 
			MAJOR_GENERAL_VALUE, 
			BRIGADIER_GENERAL_VALUE, 
			COLONEL_VALUE, 
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE));
	
	public static TilePiece FLAG = new TilePiece("Flag", FLAG_VALUE, FLAG_LESSER_RANKS);
	public static TilePiece FIVE_STAR_GENERAL = new TilePiece("5 Star General", FIVE_STAR_GENERAL_VALUE, FIVE_STAR_GENERAL_LESSER_RANKS);
	public static TilePiece FOUR_STAR_GENERAL = new TilePiece("4 Star General", FOUR_STAR_GENERAL_VALUE, FOUR_STAR_GENERAL_LESSER_RANKS);
	public static TilePiece LIEUTENANT_GENERAL = new TilePiece("Lieutenant General", LIEUTENANT_GENERAL_VALUE, LIEUTENANT_GENERAL_LESSER_RANKS);
	public static TilePiece MAJOR_GENERAL = new TilePiece("Major General", MAJOR_GENERAL_VALUE, MAJOR_GENERAL_LESSER_RANKS);
	public static TilePiece BRIGADIER_GENERAL = new TilePiece("Brigadier General", BRIGADIER_GENERAL_VALUE, BRIGADIER_GENERAL_LESSER_RANKS);
	public static TilePiece COLONEL = new TilePiece("Colonel", COLONEL_VALUE, COLONEL_LESSER_RANKS);
	public static TilePiece LIEUTENANT_COLONEL = new TilePiece("Lieutenant Colonel", LIEUTENANT_COLONEL_VALUE, LIEUTENANT_COLONEL_LESSER_RANKS);
	public static TilePiece MAJOR = new TilePiece("Major", MAJOR_VALUE, MAJOR_LESSER_RANKS);
	public static TilePiece CAPTAIN = new TilePiece("Captain", CAPTAIN_VALUE, CAPTAIN_LESSER_RANKS);
	public static TilePiece FIRST_LIEUTENANT = new TilePiece("First Lieutenant", FIRST_LIEUTENANT_VALUE, FIRST_LIEUTENANT_LESSER_RANKS);
	public static TilePiece SECOND_LIEUTENANT = new TilePiece("Second Lieutenant", SECOND_LIEUTENANT_VALUE, SECOND_LIEUTENANT_LESSER_RANKS);
	public static TilePiece SERGENT = new TilePiece("Sergent", SERGENT_VALUE, SERGENT_LESSER_RANKS);
	public static TilePiece PRIVATE = new TilePiece("Private", PRIVATE_VALUE, PRIVATE_LESSER_RANKS);
	public static TilePiece SPY = new TilePiece("Spy", SPY_VALUE, SPY_LESSER_RANKS);
	
	public static TilePieceSet FLAG_SET = new TilePieceSet(FLAG, 1);
	public static TilePieceSet FIVE_STAR_GENERAL_SET = new TilePieceSet(FIVE_STAR_GENERAL, 1);
	public static TilePieceSet FOUR_STAR_GENERAL_SET = new TilePieceSet(FOUR_STAR_GENERAL, 1);
	public static TilePieceSet LIEUTENANT_GENERAL_SET = new TilePieceSet(LIEUTENANT_GENERAL, 1);
	public static TilePieceSet MAJOR_GENERAL_SET = new TilePieceSet(MAJOR_GENERAL, 1);
	public static TilePieceSet BRIGADIER_GENERAL_SET = new TilePieceSet(BRIGADIER_GENERAL, 1);
	public static TilePieceSet COLONEL_SET = new TilePieceSet(COLONEL, 1);
	public static TilePieceSet LIEUTENANT_COLONEL_SET = new TilePieceSet(LIEUTENANT_COLONEL, 1);
	public static TilePieceSet MAJOR_SET = new TilePieceSet(MAJOR, 1);
	public static TilePieceSet CAPTAIN_SET = new TilePieceSet(CAPTAIN, 1);
	public static TilePieceSet FIRST_LIEUTENANT_SET = new TilePieceSet(FIRST_LIEUTENANT, 1);
	public static TilePieceSet SECOND_LIEUTENANT_SET = new TilePieceSet(SECOND_LIEUTENANT, 1);
	public static TilePieceSet SERGENT_SET = new TilePieceSet(SERGENT, 1);
	public static TilePieceSet PRIVATE_SET = new TilePieceSet(PRIVATE, 6);
	public static TilePieceSet SPY_SET = new TilePieceSet(SPY, 2);
	
	public static ArrayList<TilePieceSet> TILE_PIECES = new ArrayList<TilePieceSet>(Arrays.asList(
			FLAG_SET,
			FIVE_STAR_GENERAL_SET,
			FOUR_STAR_GENERAL_SET,
			LIEUTENANT_GENERAL_SET,
			MAJOR_GENERAL_SET,
			BRIGADIER_GENERAL_SET,
			COLONEL_SET,
			LIEUTENANT_COLONEL_SET,
			MAJOR_SET,
			CAPTAIN_SET,
			FIRST_LIEUTENANT_SET,
			SECOND_LIEUTENANT_SET,
			SERGENT_SET,
			PRIVATE_SET,
			SPY_SET
		)
	);
	
	public static ArrayList<TilePiece> initializePieces(){
		ArrayList<TilePiece> tps = new ArrayList<>();
		for(TilePieceSet setPieces : Constant.TILE_PIECES){
			tps.addAll(setPieces.getTilePieces());
		}
		return tps;
	}
	
	//board
	public static final int MAX_BOARD_X = 9;
	public static final int MAX_BOARD_Y = 8;
	public static final int SQUARE_BOARD = MAX_BOARD_X * MAX_BOARD_Y;
	
	public static ArrayList<Position> initializePositions(){
		ArrayList<Position> ps = new ArrayList<>();
		for (int x = 0; x < MAX_BOARD_X; x++){
			for(int y = 0; y < MAX_BOARD_Y; y++){
				try {
					ps.add(new Position(x, y));
				} catch (InvalidBoardXCoordinate e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidBoardYCoordinate e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (PositionOccupiedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return ps;		
	}

}
