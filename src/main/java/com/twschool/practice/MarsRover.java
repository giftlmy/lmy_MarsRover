package com.twschool.practice;

import java.util.List;

public class MarsRover {
    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }

    public void execute(List<String> commands) {
        commands.forEach(command -> {
            if ("M".equals(command)) {
                move();
            } else if ("L".equals(command)) {
                turnLeft();
            } else if ("R".equals(command)) {
//                turnRight();
            }
        });

    }

    private void turnLeft() {
        marsRoverPosition.setDirection( marsRoverPosition.getDirection() .leftDirection());
    }

    private void move() {
        switch ( marsRoverPosition.getDirection()) {
            case N:
                marsRoverPosition.getCoordinate().increaseCoordinateY();
                break;
            case E:
                marsRoverPosition.getCoordinate().increaseCoordinateX();
                break;
            case S:
                marsRoverPosition.getCoordinate().reducCoordinateY();
                break;
            case W:
                marsRoverPosition.getCoordinate().reduceCoordinateX();
        }
    }


}
