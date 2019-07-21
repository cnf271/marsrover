package com.marsrover.model;

/**
 * @author Naween Fonseka
 *
 */
public class MarsRover {

	private Integer xCordinate;
	private Integer yCordinate;
	private String currentDirection;

	private static final String NORTH = "N";
	private static final String EAST = "E";
	private static final String WEST = "W";
	private static final String SOUTH = "S";

	private Grid grid;

	public MarsRover() {
		super();
	}

	public MarsRover(Grid grid, Integer xCordinate, Integer yCordinate, String currentDirection) {
		super();
		this.grid = grid;
		this.xCordinate = xCordinate;
		this.yCordinate = yCordinate;
		this.currentDirection = currentDirection;
	}

	// Move rover with given command input
	public void moveRover(String command) {
		if (command != null && !command.isEmpty()) {
			command.chars().mapToObj(i -> (char) i).forEach(digit -> {
				if (digit.equals('L')) {
					turnLeft();
				} else if (digit.equals('R')) {
					turnRight();
				} else if (digit.equals('M')) {
					move();
				} else {
					throw new IllegalArgumentException("Invalid Command !");
				}
			});
		}
	}

	private void turnLeft() {
		switch (this.getCurrentDirection()) {
		case "N":
			this.setCurrentDirection(WEST);
			break;
		case "E":
			this.setCurrentDirection(NORTH);
			break;
		case "W":
			this.setCurrentDirection(SOUTH);
			break;
		case "S":
			this.setCurrentDirection(EAST);
			break;
		}
	}

	private void turnRight() {
		switch (this.getCurrentDirection()) {
		case "N":
			this.setCurrentDirection(EAST);
			break;
		case "E":
			this.setCurrentDirection(SOUTH);
			break;
		case "W":
			this.setCurrentDirection(NORTH);
			break;
		case "S":
			this.setCurrentDirection(WEST);
			break;
		}
	}

	// Move Rover from the given coordinates
	private void move() {
		if (grid.checkMoveValidity(this.getxCordinate(), this.getyCordinate())) {
			switch (this.getCurrentDirection()) {
			case "N":
				this.setyCordinate(this.getyCordinate() + 1);
				break;
			case "E":
				this.setxCordinate(this.getxCordinate() + 1);
				break;
			case "W":
				this.setxCordinate(this.getxCordinate() - 1);
				break;
			case "S":
				this.setyCordinate(this.getyCordinate() - 1);
				break;
			default:
				throw new IllegalArgumentException("Invalid Move !");
			}
		}
	}

	public void showCurrentPosition() {
		System.out.println(this.getxCordinate() + " " + this.getyCordinate() + " " + this.getCurrentDirection());
	}

	public Integer getxCordinate() {
		return xCordinate;
	}

	public void setxCordinate(Integer xCordinate) {
		this.xCordinate = xCordinate;
	}

	public Integer getyCordinate() {
		return yCordinate;
	}

	public void setyCordinate(Integer yCordinate) {
		this.yCordinate = yCordinate;
	}

	public String getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(String currentDirection) {
		this.currentDirection = currentDirection;
	}
}
