package _06_overloading;

import java.awt.Color;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		LeagueOptionPane p = new LeagueOptionPane();
		p.showMessageDialog("The League is the Best");
		p.showMessageDialog("The League Is The Best", "Message");
		p.showMessageDialog("the league is the best", "message", "leagueDark.png");
		p.showMessageDialog("THE LEAGUE IS THE BEST", "MESSAGE", "leagueDark.png",Color.BLUE);

		
	}
}
