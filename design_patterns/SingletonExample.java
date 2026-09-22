class AppConfiguration {
    private static AppConfiguration instance;

    private AppConfiguration() {
    }

    public static AppConfiguration getInstance() {
        if (instance == null) {
            instance = new AppConfiguration();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Using the shared application configuration.");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        AppConfiguration first = AppConfiguration.getInstance();
        AppConfiguration second = AppConfiguration.getInstance();

        first.showMessage();
        System.out.println("Same instance: " + (first == second));
    }
}
