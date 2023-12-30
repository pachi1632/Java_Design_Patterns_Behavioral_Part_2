package practice;

public class HighState implements State{
    @Override
    public void turnUp(Fan fan) {
        System.out.println("Already on High State");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is set to Medium State");
    }
}
