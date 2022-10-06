package InOut;

import Interfaces.Printer;
import Interfaces.Priority;

import java.util.Scanner;

public class Inout implements Printer {
    Scanner scanner = new Scanner(System.in);

    public void startInfo(){
        print("Please choose one of possible actions: \n" +
                "To add new task: choose 1 or type in add. \n" +
                "To get first task with highest available priority: choose 2 or type load. \n" +
                "To close this app: choose 3 or type exit");
        printL("I choose: ");
    }

        public String getString (){
        return scanner.nextLine();
        }

        public Priority getPriority(){
        return Priority.valueOf(scanner.nextLine().toUpperCase());
        }
}
