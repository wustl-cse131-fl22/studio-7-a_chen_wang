package studio7;

public class HockeyPlayer {

	public String name, hand, shoot;
	public int goal, assist, points, games, jersey;
	
	public HockeyPlayer(String name, String hand, String shoot, int jersey) {
		this.name = name;
		this.hand = hand;
		this.shoot = shoot;
		this.jersey = jersey;
	}

	public String getName() {
		return name;
	}
	
	public String getHand() {
		return hand;
	}
	
	public String getShoot() {
		return shoot;
	}
	
	public int getGoal() {
		return goal;
	}
	
	public int getAssist() {
		return assist;
	}
	
	public int getPoints() {
		return points;
	}
	
	public int getGames() {
		return games;
	}
	
	public int getJersey() {
		return jersey;
	}
	
	public void addGoal(int a) {
		goal+=a;
	}
	
	public void addAssist(int a) {
		assist+=a;
	}
	
	public void calcPoints() {
		points = goal + assist;
	}
	
	public void played() {
		games++;
	}
	
	public void game(HockeyPlayer h, int goal, int assist) {
		h.addGoal(goal);
		h.addAssist(assist);
		h.calcPoints();
		h.played();
	}
	
	public String toString() {
		return ("Name: " + name + "\n" + 
				"Hand: " + hand + "\n" + 
				"Shoot: " + shoot + "\n" +
				"Jersey #: " + jersey + "\n" +
				"Points: " + points + "\n");
	}
	
}
