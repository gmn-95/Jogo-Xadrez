package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{ // rei

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		char cod = '\u2654';
		String rei = String.valueOf(cod);
		return rei;
	}
}
