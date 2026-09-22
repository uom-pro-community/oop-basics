class User {
    private final String name;
    private final String email;
    private final String phone;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

    public static class Builder {
        private final String name;
        private String email;
        private String phone;

        public Builder(String name) {
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

public class BuilderExample {
    public static void main(String[] args) {
        User user = new User.Builder("Haritha")
                .email("haritha@example.com")
                .phone("555-0100")
                .build();

        user.showDetails();
    }
}
