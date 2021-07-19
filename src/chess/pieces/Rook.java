package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{ // torre

	public Rook(Board board, Color color) {
		super(board, color);

	}
	
	@Override
	public String toString() {
		char cod = '\u2656';
		String rook = String.valueOf(cod);
		return rook;
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
	
}
