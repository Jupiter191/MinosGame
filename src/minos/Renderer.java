package minos;

import static java.lang.System.out;
import java.util.Scanner;

final class Renderer{

	private static Renderer instance = new Renderer();	
	
	private Data data = Data.getInstance();
	private Scanner scanner = new Scanner(System.in);
	private boolean continueRunning = true;
	
	static void startGame(){
		instance.init();
	}
	
	private void init(){

		while(continueRunning){
			renderScreen();
		}
		scanner.close();
	}

	private void renderScreen(){

		boolean[][] gameBoard = data.getGameBoard();
		for(int i = 0; i < gameBoard.length; i++){
			for(int j = 0; j < gameBoard[i].length; j++){
				out.print(gameBoard[i][j]);
			}
			out.println();
		}
		out.print("> ");
		awaitInput();
	}

	private void awaitInput(){
		scanner.nextLine();
	}
}
