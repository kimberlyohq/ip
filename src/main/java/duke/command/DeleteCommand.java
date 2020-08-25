package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.exception.DukeException;
import duke.task.Task;

/**
 * Deletes a task from Tasklist.
 */
public class DeleteCommand extends Command {

    int index;

    /**
     * Message to be printed when DeleteCommand is executed successfully.
     */
    public static final String MESSAGE_SUCCESS = "Noted. I've removed this task:\n%s";

    /**
     * Constructs a new instance of a DeleteCommand.
     * @param index Index of task to be deleted.
     */
    public DeleteCommand(int index) {
        this.index = index;
    }

    /**
     * Executes the delete command.
     * @param taskList TaskList associated with command.
     * @param ui Ui associated with command.
     * @param storage Storage associated with command.
     * @throws DukeException If there is error during execution of command.
     */
    public void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        Task deletedTask = taskList.get(index -1 );
        taskList.deleteTask(index);
        storage.writeToFile(taskList);
        ui.printReply(String.format(MESSAGE_SUCCESS, deletedTask ));
    }

    /**
     * Indicates whether Duke chatbot is still running.
     * @return false.
     */
    public boolean isExit() {
        return false;
    }
}
