package exercise.statepatternexercise.src.main.java.practice;

public class LowState implements State{

    @Override
    public void turnUp(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is set to Medium State");
    }

    @Override
    public void turnDown(Fan fan) {
        System.out.println("Already on Low State");
    }
}
