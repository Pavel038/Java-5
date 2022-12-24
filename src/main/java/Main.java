
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        System.out.println(actual);

        amount = 1000;
        registered = true;
        expected = 30;

        actual = service.calculate(amount, registered);
        System.out.println(actual);

        amount = 1000;
        registered = false;
        expected = 10;

        actual = service.calculate(amount, registered);
        System.out.println(actual);

        amount = 1_000_000;
        registered = false;
        expected = 500;

        actual = service.calculate(amount, registered);
        System.out.println(actual);
    }


}