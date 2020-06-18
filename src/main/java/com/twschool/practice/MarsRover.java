package com.twschool.practice;

import java.util.List;

public class MarsRover {
    private  Coordinate coordinate;
    private  String direction;

    public MarsRover(Coordinate coordinate, String direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }
    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getDirection() {
        return direction;
    }

    public void execute(List<String> commands) {
        if("N".equals(direction)){
            commands.forEach(command -> {
                if (command.equals("M")) {
                    coordinate.increaseCoordinateY();
                }else if (command.equals("L")){
                    this.direction = "W";
                }else if (command.equals("R")){
                    this.direction = "E";
                }
            });

        }else if("S".equals(direction)){
            commands.forEach(command -> {
                if (command.equals("M")) {
                    coordinate.reducCoordinateY();
                }else if (command.equals("L")){
                    this.direction = "E";
                }else if (command.equals("R")){
                    this.direction = "W";
                }
            });

        }else if("E".equals(direction)){
            commands.forEach(command -> {
                if (command.equals("M")) {
                    coordinate.increaseCoordinateX();
                }else if (command.equals("L")){
                    this.direction = "N";
                }else if (command.equals("R")){
                    this.direction = "S";
                }
            });

        }else if("W".equals(direction)){
            commands.forEach(command -> {
                if (command.equals("M")) {
                    coordinate.reduceCoordinateX();
                }else if (command.equals("L")){
                    this.direction = "S";
                }else if (command.equals("R")){
                    this.direction = "N";
                }
            });

        }


    }
}
