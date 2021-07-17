package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int l = 0; l < board.getRows(); l++) {
			for(int c = 0; c < board.getColumns(); c++) {
				mat[l][c] = (ChessPiece) board.piece(l, c);
			}
		}
		
		return mat;
	}
	
	private void pleaceNewPiece(char column, int row, ChessPiece piece) {
		board.pleacePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() { // posicionar peças
		pleaceNewPiece('b', 6, new Rook(board, Color.WHITE));
		pleaceNewPiece('e', 8, new King(board, Color.BLACK));
		pleaceNewPiece('e', 1, new King(board, Color.WHITE));
	}
}	
