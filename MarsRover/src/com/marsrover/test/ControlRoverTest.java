/**
 * 
 */
package com.marsrover.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.marsrover.model.Grid;
import com.marsrover.model.MarsRover;

/**
 * @author Naween Fonseka
 *
 */
public class ControlRoverTest {
	private Grid grid;
	private MarsRover rover1;
	private MarsRover rover2;
	
	
	@Before
	public void initialize() {
		System.out.println("------- Running ControlRover Test --------");
		System.out.println("Grid Created - (5,5)");
		System.out.println("Rover1 coordinate - 1, 2, N ");
		System.out.println("Rover2 coordinate - 3, 3, E ");
		grid = new Grid(5, 5);
		rover1 = new MarsRover(grid, 1, 2, "N");
		rover2 = new MarsRover(grid, 3, 3, "E");
	}

	@Test
	public void test() {

		rover1.moveRover("LMLMLMLMM");
		System.out.println("Rover1's final coordinates : ");
		assertEquals(1, rover1.getxCordinate().intValue());
		assertEquals(3, rover1.getyCordinate().intValue());
		assertEquals("N", rover1.getCurrentDirection());
		rover1.showCurrentPosition();
		
		rover2.moveRover("MMRMMRMRRM");
		System.out.println("Rover2's final coordinates : ");
		assertEquals(5, rover2.getxCordinate().intValue());
		assertEquals(1, rover2.getyCordinate().intValue());
		assertEquals("E", rover2.getCurrentDirection());
		rover2.showCurrentPosition();
	}

}
