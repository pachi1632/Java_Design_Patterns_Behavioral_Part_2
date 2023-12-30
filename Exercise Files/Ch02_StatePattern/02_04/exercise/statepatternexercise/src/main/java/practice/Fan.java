package exercise.statepatternexercise.src.main.java.practice;
public class Fan {

  private State state = new LowState();

  public void setState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public void turnUp() {
    this.state.turnUp(this);
  }

  public void turnDown() {
    this.state.turnDown(this);
  }

}
