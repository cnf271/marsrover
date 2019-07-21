package com.marsrover.model;

/**
 * @author Naween Fonseka
 *
 */
public class Grid {

	private Integer xCordinate;
	private Integer yCordinate;

	public Grid(Integer xCordinate, Integer yCordinate) {
		super();
		this.xCordinate = xCordinate;
		this.yCordinate = yCordinate;
	}

	public Grid createGrid(String command) {
		Grid grid = null;
		if (command != null && !command.isEmpty()) {
			String[] gridArea = command.split(" ");
			grid = new Grid(Integer.parseInt(gridArea[0]), Integer.parseInt(gridArea[1]));
		}
		return grid;
	}

	// Check if rover move is within the grid coordinates
	public Boolean checkMoveValidity(Integer xCordinate, Integer yCordinate) {
		return this.xCordinate >= xCordinate && this.yCordinate >= yCordinate;
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

}
