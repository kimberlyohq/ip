package duke.task;

import duke.Priority;

/**
 * Represents a TodoTask.
 */
public class TodoTask extends Task {
    /**
     * Constructs a new instance of a TodoTask.
     * @param description Description of task
     */
    public TodoTask(String description) {
        super(description);
    }

    /**
     * Constructs a new instance of a TodoTask.
     * @param description Description of task
     */
    public TodoTask(String description, Priority priority) {
        super(description, priority);
    }

    @Override
    public String toString() {
        return "[T][" + getStatusIcon() + "] " + description;
    }
}
