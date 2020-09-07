package duke.task;

import duke.Priority;

/**
 * Represents a Task
 */
public class Task {

    /** Description of task. */
    protected String description;
    /** Status of task. */
    protected boolean isDone;
    /** Priority of Task */
    protected Priority priority;

    /**
     * Constructs a new instance of a Task with attributes defined in parameters.
     * @param description Description of task.
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
        this.priority = null;
    }

    /**
     * Constructs a new instance of a Task with attributes defined in parameters.
     * @param description Description of task.
     * @param priority Priority of task.
     */
    public Task(String description, Priority priority) {
        this.description = description;
        this.isDone = false;
        this.priority = priority;
    }

    public boolean getIsDone() {
        return this.isDone;
    }

    public String getDescription() {
        return this.description;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public void addPriority(Priority priority) {
        this.priority = priority;
    }

    public void updatePriority(Priority priority) {
        this.priority = priority;
    }

    /**
     * Retrieves the status icon of task.
     * @return A string value of status icon.
     */
    public String getStatusIcon() {
        return (isDone ? "✓" : "✘");
    }

    /**
     * Marks the task as completed.
     */
    public void markAsDone() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + description;
    }

}
