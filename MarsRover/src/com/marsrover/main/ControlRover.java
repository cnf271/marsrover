package com.marsrover.main;

import java.util.Scanner;

import com.marsrover.model.Grid;
import com.marsrover.model.MarsRover;

/**
 * @author Naween Fonseka
 *
 */
public class ControlRover {

	public static void main(String[] args) {
		System.out.println("Enter coordinates starting with Grid coordinates : ");
		Scanner sc = new Scanner(System.in);
		String gridCoordinates = sc.nextLine();
		String[] gridCoordinatesArr = gridCoordinates.split(" ");
		Grid grid = new Grid(Integer.valueOf(gridCoordinatesArr[0]), Integer.valueOf(gridCoordinatesArr[1]));

		// Rover 1
		String rover1Coordinates = sc.nextLine();
		String[] rover1CoordinatesArr = rover1Coordinates.split(" ");
		MarsRover rover1 = new MarsRover(grid, Integer.valueOf(rover1CoordinatesArr[0]),
				Integer.valueOf(rover1CoordinatesArr[1]), rover1CoordinatesArr[2]);

		rover1.moveRover(sc.nextLine());

		// Rover 2
		String rover2Coordinates = sc.nextLine();
		String[] rover2CoordinatesArr = rover2Coordinates.split(" ");
		MarsRover rover2 = new MarsRover(grid, Integer.valueOf(rover2CoordinatesArr[0]),
				Integer.valueOf(rover2CoordinatesArr[1]), rover2CoordinatesArr[2]);
		rover2.moveRover(sc.nextLine());
		sc.close();

		System.out.println("Rover1 and Rover2 Final coordinates : ");
		rover1.showCurrentPosition();
		rover2.showCurrentPosition();
	}

}
