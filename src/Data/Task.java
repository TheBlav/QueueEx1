package Data;

import Interfaces.Priority;

import java.util.Objects;

public class Task implements Comparable<Task>{
    String name, description;
    Priority priority;

    public Task(String name, String description, Priority priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) && Objects.equals(description, task.description) && priority == task.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, priority);
    }

    @Override
    public String toString() {
        return name + " : " + description + "; Priority: " + priority + "\n";
    }

    @Override
    public int compareTo(Task o) {
        return this.priority.compareTo(o.priority);
    }
}
