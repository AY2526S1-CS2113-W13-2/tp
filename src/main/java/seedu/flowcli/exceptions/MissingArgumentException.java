package seedu.flowcli.exceptions;

import seedu.flowcli.ui.ColorScheme;

//@@author zeeeing
public class MissingArgumentException extends FlowCLIException {
    private static final String DEFAULT_MESSAGE = ColorScheme.error("Hmm, looks like you forgot something! ") +
            "Missing argument for the command.";

    public MissingArgumentException() {
        this(DEFAULT_MESSAGE);
    }

    public MissingArgumentException(String message) {
        super(ColorScheme.error("Hmm, looks like you forgot something! ") + message);
    }
}
