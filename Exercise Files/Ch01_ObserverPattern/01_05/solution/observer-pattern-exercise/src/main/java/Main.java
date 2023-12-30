public class Main {

  public static void main(String[] args) {
    City sunnyville = new City();
    City springfield = new City();
    TrafficUpdates trafficUpdates = new TrafficUpdates();

    sunnyville.addPropertyChangeListener(trafficUpdates);
    springfield.addPropertyChangeListener(trafficUpdates);

    sunnyville.postTrafficUpdate("Congestion in town center");
    springfield.postTrafficUpdate("Accident on the highway");

    trafficUpdates.printUpdates();

  }


}
