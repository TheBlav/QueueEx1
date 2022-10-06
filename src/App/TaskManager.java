package App;

import Data.Task;
import InOut.Inout;
import Interfaces.Printer;
import Interfaces.Priority;

import java.util.PriorityQueue;
import java.util.Queue;

public class TaskManager implements Printer {
    Inout io = new Inout();
    Queue<Task> tasks = new PriorityQueue<>();

    public void TaskManager(){

       Task task = new Task("Update Jira", "Please fill all blank days in callendar", Priority.valueOf("High".toUpperCase()));
        print(task);
        print(Priority.values());
        String choice = "none";
        while (!choice.equals("exit")) {
            io.startInfo();
            choice = io.getString().toLowerCase();
            chosenOperations(choice);
        }
    }

    private void chosenOperations(String choice) {
        if (choice.length()==1){
            int chosenNumber = Integer.parseInt(choice);
            numericalOptions(chosenNumber);
        }
        else {
                switch (choice) {
                    case "add":
                        addNewTask();
                        break;
                    case "load":
                        print(tasks);
                        pullNextTask();
                        break;
                    case "exit":
                        break;
                }


        }
    }

    private void pullNextTask() {
        print("Pulling first task with highest available priority: ");
        print(tasks.peek());
        tasks.poll();
        print("Tasks list after load:" + tasks);
    }

    private void addNewTask() {
        printL("Please provide task name: ");
        String name = io.getString();
        printL("Please set task description: ");
        String description = io.getString();
        printL("Please set priority (Low/Moderate/High");
        Priority priority = io.getPriority();

        tasks.add(new Task(name,description,priority));
        print("\n");

    }

    private void numericalOptions(int chosenNumber) {
    }
}
