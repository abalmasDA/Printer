public class PrinterGreenColor extends Printer {
    private final String ANSI_GREEN = "\u001B[32m";

    @Override
    public void print(String value) {
        System.out.println(ANSI_GREEN + value + ANSI_RESET);
    }
}
