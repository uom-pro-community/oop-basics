import java.util.ArrayList;
import java.util.List;

interface WeatherObserver {
    void update(int temperature);
}

class PhoneDisplay implements WeatherObserver {
    @Override
    public void update(int temperature) {
        System.out.println("Phone display: " + temperature + " degrees.");
    }
}

class WeatherStation {
    private final List<WeatherObserver> observers = new ArrayList<>();
    private int temperature;

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }
}

public class ObserverExample {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.addObserver(new PhoneDisplay());
        station.setTemperature(28);
    }
}
