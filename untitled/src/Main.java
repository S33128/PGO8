public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        UserValidator validator = new UserValidator();
        validator.addRule(form -> form.email().contains("@"));
        validator.addRule(form -> form.password().length() >= 8 );
        validator.addRule(form -> form.age() >= 18);

        UserForm form = new UserForm(
                "anna@example.com",
                "bezpieczne123",
                20
        );
        System.out.println("Valid: " + validator.isValid(form));

        System.out.println("Zadanie 2:");
    }
}