package br.com.joseluiz.tictactoe.core;

import br.com.joseluiz.tictactoe.Constants;
import br.com.joseluiz.tictactoe.ui.UI;

public class Game {
	
	Board board =  new Board();
	Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		UI.printGameTitle();
		UI.readInput("Nome do Jogador: ");
	}

}
