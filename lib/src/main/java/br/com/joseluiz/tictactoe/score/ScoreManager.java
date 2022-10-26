package br.com.joseluiz.tictactoe.score;

import br.com.joseluiz.tictactoe.core.Player;

public interface ScoreManager {
	
	public Integer getScore(Player player);
	
	public void saveScore(Player player);
	
	

}
