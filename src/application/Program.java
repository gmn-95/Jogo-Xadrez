package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessExcepition;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		
		while(true) {
			try {
				UI.clearScreen();
				UI.printMatch(chessMatch);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.ReadChessPosition(sc);
				
				boolean[][] possibleMoves = chessMatch.PossibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition targate = UI.ReadChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, targate);
			}
			catch (ChessExcepition e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		
		
	}

}
