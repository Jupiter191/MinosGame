package minos;

final class Data{

	private static Data instance;
	
	// TODO abstract this board into it's own class
	private boolean[][] gameBoard = new boolean[][]{
		new boolean[]{false,false,false,false,false,false},
		new boolean[]{false,false,false,true,false,false}	
	};

	static Data getInstance(){

		if(Data.instance == null)
			Data.instance = new Data();
		return Data.instance;	
	}
	
	boolean[][] getGameBoard(){

		return this.gameBoard;
	}

}
