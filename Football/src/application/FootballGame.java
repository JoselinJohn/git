package application;

import pojo.Player;

public class FootballGame {

	public static void main(String[] args) {
		Player goalKeeper = new Player();
		Player striker = new Player(55,"OMKAR GAD", 23, 7, "argetina");
		System.out.println("striker : " + striker.getName() + striker.getTeam() + striker.getJersieno() + striker.getShoeNo() + striker.getWeight());
		goalKeeper.setName("dattu");
		System.out.println("goalKeeper :" + goalKeeper.getName());

	}

}
