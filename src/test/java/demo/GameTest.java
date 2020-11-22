package demo;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;


public class GameTest {
	
	private Game game;
	
	@Before
	public void setup() {
		
		this.game = new Game();
		
	}
	
	@Test
	public void canRollBall() {
		
		game.roll(0);
		
	}
	
	@Test
	public void canScoreGutterGame() {	
		
		game.roll(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		
		assertEquals(game.score(), 0);
	}
	
	@Test
	public void canScoreGameOfOnes() {		
		
		game.roll(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
		
		assertEquals(game.score(), 20);
		
	}
	
	@Test
	public void canScoreSpareFollowedByThree() {
		
		game.roll(5, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertEquals(game.score(), 16);
		
	}
	
	@Test
	public void canScoreStrikeFollowedByThreeThenThree() {
		
		game.roll(10, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertEquals(game.score(), 22);
		
	}
	
	@Test
	public void canScorePerfectGame() {
		
		game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
		assertEquals(game.score(), 300);
		
	}
	

}
