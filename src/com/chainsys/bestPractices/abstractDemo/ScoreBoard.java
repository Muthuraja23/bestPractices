package com.chainsys.bestPractices.abstractDemo;

public class ScoreBoard 
{
	public int TargetScore=264;
	private ScoreBoard() {
		System.out.println("object created for scoreboard");
	}
	// create object() is a factory method
	public static ScoreBoard createobject() {
		return new ScoreBoard();
	}
}
