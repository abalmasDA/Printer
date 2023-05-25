public class Printer {

    protected final String ANSI_RESET = "\u001B[0m";

    public void print(String value) {
        System.out.println(value);
    }


}
