import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class City {

  private String trafficUpdate = "";
  private PropertyChangeSupport support = new PropertyChangeSupport(this);

  public void postTrafficUpdate(String trafficUpdate) {
    support.firePropertyChange("trafficUpdate", this.trafficUpdate, trafficUpdate);
    this.trafficUpdate = trafficUpdate;
  }

  public void addPropertyChangeListener(PropertyChangeListener listener) {
    support.addPropertyChangeListener(listener);
  }

}
