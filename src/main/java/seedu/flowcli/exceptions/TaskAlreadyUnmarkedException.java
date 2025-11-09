package seedu.flowcli.exceptions;

public class TaskAlreadyUnmarkedException extends FlowCLIException {
    public TaskAlreadyUnmarkedException() {
        super("Task is already unmarked");
    }
}

