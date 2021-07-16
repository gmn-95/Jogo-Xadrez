package application;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {
		
		for(int l = 0; l < pieces.length; l++) {
			System.out.print((8 - l) + "  ");
			for(int c = 0; c < pieces.length; c++) {
				printPiece(pieces[l][c]);
			}
			System.out.println();
		}
		System.out.println("\n   a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}
		else {
			System.out.println(piece);
		}
		System.out.print(" ");
	}
}
