package FlightControl;
import flightControl.domain.Flight;
import flightControl.domain.Airplane;
import java.util.Scanner;
import flightControl.logic.FlightControl;
import flightControl.ui.TextUI;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl flightControl = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        TextUI textUI = new TextUI(flightControl,scanner);
        
        textUI.start();
    }
}
