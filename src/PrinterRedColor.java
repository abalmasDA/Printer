public class PrinterRedColor extends Printer {

    private final String ANSI_RED = "\u001B[31m";

    @Override
    public void print(String value) {
        System.out.println(ANSI_RED + value + ANSI_RESET);
    }
}
