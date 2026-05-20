public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        UserValidator validator = new UserValidator();
        validator.addRule(form -> form.email().contains("@"));
        validator.addRule(form -> form.password().length() >= 8);
        validator.addRule(form -> form.age() >= 18);

        UserForm form = new UserForm(
                "anna@example.com",
                "bezpieczne123",
                20
        );
        System.out.println("Valid: " + validator.isValid(form));

        System.out.println("Zadanie 2:");
        ServiceOrder order = new ServiceOrder("Firma Alfa", 10, 120.0);
        PriceCalculator calculator = new PriceCalculator();

        PriceStrategy standard = o -> o.hours() * o.hourRate();
        PriceStrategy discount = o -> o.hours() * o.hourRate() * 0.90;
        PriceStrategy weekend = o -> o.hours() * o.hourRate() * 1.25;

        System.out.println(calculator.calculate(order, standard));
        System.out.println(calculator.calculate(order, discount));
        System.out.println(calculator.calculate(order, weekend));

        System.out.println("Zadanie 3:");
        Order order1 = new Order("ORD-100", "Anna Kowalska");
        order1.addItem(
                new Order.OrderItem(
                        "Klawiatura",
                        249.99,
                        1
                )
        );
        order1.addItem(
                new Order.OrderItem(
                        "Mysz",
                        99.99,
                        2
                )
        );
        OrderSummary summary = new OrderSummary(
                order1.getOrderNumber(),
                order1.getCustomerName(),
                order1.total()
        );
        System.out.println(summary);

        System.out.println("Zadanie 4:");
        LibraryAccount account = new LibraryAccount(
                "Jan Nowak",
                3,
                5
        );
        LibraryAccount.FineCalculator calculator1 = account.new FineCalculator();
        double fine = calculator1.calculate();
        MessagePrinter printer = message -> System.out.println(
                "[BIBLIOTEKA]" + message
        );
        printer.print(
                "Czytelnik: "
                        + account.getReaderName()
                        + ",opłata: "
                        + fine
                        + "zł"
        );
    }
}