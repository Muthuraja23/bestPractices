package com.chainsys.bestPractices.abstractDemo;

public class TestScoreBoard {

	public static void main(String[] args) {
		//ScoreBoard sb=new ScoreBoard();
				ScoreBoard sb=ScoreBoard.createobject();
				System.out.println(sb.TargetScore);
				sb.TargetScore=219;
				System.out.println(sb.TargetScore);
	}

}