package br.com.joseluiz.tictactoe.core;

public class InvalidMoveException extends Exception{
	private static final long serialVersionUID = 1L;

	public InvalidMoveException(String msg) {
		super(msg);
		
	}


}
