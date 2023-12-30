package exercise.statepatternexercise.src.main.java.practice;

public class MediumState implements State{
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new HighState());
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new LowState());
    }
}
