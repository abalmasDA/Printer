public class Main {

    public static void main(String[] args) {

        Printer print1Up = new PrinterGreenColor(); //upCast
        Printer print2Up = new PrinterRedColor(); //upCast
        Printer print3Up = new PrinterBlueColor(); //upCast

        print1Up.print("I print a green text");
        print2Up.print("I print a red text");
        print3Up.print("I print a blue text");

        PrinterGreenColor print1Down = (PrinterGreenColor) print1Up; //DownCast
        PrinterRedColor print2Down = (PrinterRedColor) print2Up; //DownCast
        PrinterBlueColor print3Down = (PrinterBlueColor) print3Up; //DownCast

        print1Down.print("I print a green text");
        print2Down.print("I print a red text");
        print3Down.print("I print a blue text");


    }


}
