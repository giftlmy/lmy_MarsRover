package com.twschool.practice;

import org.junit.Test;

import java.util.Collections;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_return_x0_y1_N_given_x0_y0_N_and_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);

        //when
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        marsRover.execute(Collections.singletonList("M"));

        //then
        assertThat(marsRoverPosition.getCoordinate().getX(), is(0));
        assertThat(marsRoverPosition.getCoordinate().getY(), is(1));
        assertThat(marsRoverPosition.getDirection(), is(Direction.N));
    }
   @Test
    public void should_return_x0_y0_W_given_x0_y0_N_and_L() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);

        //when
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(coordinate, Direction.N);
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        marsRover.execute(Collections.singletonList("L"));
        //then
        assertThat(marsRoverPosition.getCoordinate().getX(), is(0));
        assertThat(marsRoverPosition.getCoordinate().getY(), is(0));
        assertThat(marsRoverPosition.getDirection(), is(Direction.W));
    }

    /* @Test
    public void should_return_x0_y0_E_given_x0_y0_N_and_R() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "N";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("R"));

        //then
        assertThat(marsRover.getCoordinate().getX(), is(0));
        assertThat(marsRover.getCoordinate().getY(), is(0));
        assertThat(marsRover.getDirection(), is("E"));
    }
    @Test
    public void should_return_x0_y_1_S_given_x0_y0_S_and_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "S";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("M"));

        //then
        assertThat(marsRover.getCoordinate().getX(), is(0));
        assertThat(marsRover.getCoordinate().getY(), is(-1));
        assertThat(marsRover.getDirection(), is("S"));
    }
    @Test
    public void should_return_x0_y0_E_given_x0_y0_S_and_L() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "S";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("L"));

        //then
        assertThat(marsRover.getCoordinate().getX(), is(0));
        assertThat(marsRover.getCoordinate().getY(), is(0));
        assertThat(marsRover.getDirection(), is("E"));
    }
    @Test
    public void should_return_x0_y0_W_given_x0_y0_S_and_R() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "S";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("R"));

        //then
        assertThat(marsRover.getCoordinate().getX(), is(0));
        assertThat(marsRover.getCoordinate().getY(), is(0));
        assertThat(marsRover.getDirection(), is("W"));
    }
    @Test
    public void should_return_x1_y0_E_given_x0_y0_E_and_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "E";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("M"));

        //then
        assertThat(marsRover.getCoordinate().getX(), is(1));
        assertThat(marsRover.getCoordinate().getY(), is(0));
        assertThat(marsRover.getDirection(), is("E"));
    }
    @Test
    public void should_return_x0_y0_N_given_x0_y0_E_and_L() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "E";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("L"));

        //then
        assertThat(marsRover.getCoordinate().getX(), is(0));
        assertThat(marsRover.getCoordinate().getY(), is(0));
        assertThat(marsRover.getDirection(), is("N"));
    }
    @Test
    public void should_return_x0_y0_S_given_x0_y0_E_and_R() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "E";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("R"));

        //then
        assertThat(marsRover.getCoordinate().getX(), is(0));
        assertThat(marsRover.getCoordinate().getY(), is(0));
        assertThat(marsRover.getDirection(), is("S"));
    }
    @Test
    public void should_return_x_1_y0_W_given_x0_y0_W_and_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "W";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("M"));

        //then
        assertThat(marsRover.getCoordinate().getX(), is(-1));
        assertThat(marsRover.getCoordinate().getY(), is(0));
        assertThat(marsRover.getDirection(), is("W"));
    }
    @Test
    public void should_return_x0_y0_S_given_x0_y0_W_and_L() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "W";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("L"));

        //then
        assertThat(marsRover.getCoordinate().getX(), is(0));
        assertThat(marsRover.getCoordinate().getY(), is(0));
        assertThat(marsRover.getDirection(), is("S"));
    }
    @Test
    public void should_return_x0_y0_N_given_x0_y0_W_and_R() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "W";

        //when
        MarsRover marsRover = new MarsRover(coordinate, direction);
        marsRover.execute(Collections.singletonList("R"));

        //then
        assertThat(marsRover.getCoordinate().getX(), is(0));
        assertThat(marsRover.getCoordinate().getY(), is(0));
        assertThat(marsRover.getDirection(), is("N"));
    }

    @Test
    public void enum_should_return_x0_y0_N_given_x0_y0_W_and_R() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        Direction direction = Direction.W;

        //when
        MarsRoverEumn marsRover = new MarsRoverEumn(coordinate, direction);


        //then
        assertThat(marsRover.getCoordinate().getX(), is(0));
        assertThat(marsRover.getCoordinate().getY(), is(0));
        assertThat(marsRover.getDirection(), is("N"));
    }
*/


}
