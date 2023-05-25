public class PrinterBlueColor extends Printer {
    private final String ANSI_BLUE = "\u001B[34m";

    @Override
    public void print(String value) {
        System.out.println(ANSI_BLUE + value + ANSI_RESET);
    }


}
