package seedu.flowcli.ui;

/**
 * Defines semantic colors for the CLI application.
 * Maps UI elements to specific colors for consistent theming.
 * Change color definitions here to update the entire application's color scheme.
 */
public final class ColorScheme {
    
    // ANSI color codes
    private static final String RESET = "\u001B[0m";
    private static final String DIM = "\u001B[2m";
    
    // Base colors
    private static final String BRIGHT_CYAN = "\u001B[96m";
    private static final String BRIGHT_GREEN = "\u001B[92m";
    private static final String BRIGHT_RED = "\u001B[91m";
    private static final String BRIGHT_YELLOW = "\u001B[93m";
    private static final String BRIGHT_BLUE = "\u001B[94m";
    private static final String BRIGHT_MAGENTA = "\u001B[95m";
    private static final String MAGENTA = "\u001B[35m";
    
    // Semantic color assignments
    private static final String PROJECT_COLOR = BRIGHT_CYAN;
    private static final String TASK_COLOR = BRIGHT_CYAN;
    private static final String COMMAND_COLOR = BRIGHT_CYAN;
    private static final String PARAMETER_COLOR = BRIGHT_YELLOW;
    private static final String FLAG_COLOR = BRIGHT_BLUE;
    private static final String INDEX_COLOR = DIM + BRIGHT_CYAN + RESET;
    private static final String SEPARATOR_COLOR = DIM + MAGENTA + RESET;
    private static final String ERROR_COLOR = BRIGHT_RED;
    private static final String SUCCESS_COLOR = BRIGHT_GREEN;
    private static final String WARNING_COLOR = BRIGHT_YELLOW;
    private static final String INFO_COLOR = BRIGHT_BLUE;
    private static final String PERSONALITY_COLOR = BRIGHT_MAGENTA;
    
    private static boolean colorsEnabled = true;
    
    /**
     * Private constructor to prevent instantiation.
     */
    private ColorScheme() {
        throw new AssertionError("ColorScheme is a utility class and should not be instantiated");
    }
    
    /**
     * Enables or disables colors globally (useful for testing).
     * 
     * @param enabled Whether colors should be enabled
     */
    public static void setColorsEnabled(boolean enabled) {
        colorsEnabled = enabled;
    }
    
    /**
     * Applies color to text.
     * 
     * @param text The text to colorize
     * @param color The ANSI color code
     * @return Colorized text
     */
    private static String colorize(String text, String color) {
        if (!colorsEnabled || text == null || text.isEmpty()) {
            return text;
        }
        return color + text + RESET;
    }
    
    // Semantic color methods
    
    /**
     * Colors text as a project name.
     * 
     * @param text The project name
     * @return Colored project name
     */
    public static String project(String text) {
        return colorize(text, PROJECT_COLOR);
    }
    
    /**
     * Colors text as a task description.
     * 
     * @param text The task description
     * @return Colored task description
     */
    public static String task(String text) {
        return colorize(text, TASK_COLOR);
    }
    
    /**
     * Colors text as a command name.
     * 
     * @param text The command name
     * @return Colored command name
     */
    public static String command(String text) {
        return colorize(text, COMMAND_COLOR);
    }
    
    /**
     * Colors text as a parameter (required or optional).
     * 
     * @param text The parameter text
     * @return Colored parameter
     */
    public static String parameter(String text) {
        return colorize(text, PARAMETER_COLOR);
    }
    
    /**
     * Colors text as a flag (e.g., --priority).
     * 
     * @param text The flag text
     * @return Colored flag
     */
    public static String flag(String text) {
        return colorize(text, FLAG_COLOR);
    }
    
    /**
     * Colors text as an index number.
     * 
     * @param text The index text
     * @return Colored index
     */
    public static String index(String text) {
        return colorize(text, INDEX_COLOR);
    }
    
    /**
     * Colors text as a separator line.
     * 
     * @param text The separator text
     * @return Colored separator
     */
    public static String separator(String text) {
        return colorize(text, SEPARATOR_COLOR);
    }
    
    /**
     * Colors text as an error message.
     * 
     * @param text The error text
     * @return Colored error message
     */
    public static String error(String text) {
        return colorize(text, ERROR_COLOR);
    }
    
    /**
     * Colors text as a success message.
     * 
     * @param text The success text
     * @return Colored success message
     */
    public static String success(String text) {
        return colorize(text, SUCCESS_COLOR);
    }
    
    /**
     * Colors text as a warning message.
     * 
     * @param text The warning text
     * @return Colored warning message
     */
    public static String warning(String text) {
        return colorize(text, WARNING_COLOR);
    }
    
    /**
     * Colors text as an informational message.
     * 
     * @param text The info text
     * @return Colored info message
     */
    public static String info(String text) {
        return colorize(text, INFO_COLOR);
    }
    
    /**
     * Colors text with personality/accent styling.
     * 
     * @param text The personality text
     * @return Colored personality text
     */
    public static String personality(String text) {
        return colorize(text, PERSONALITY_COLOR);
    }
    
    /**
     * Dims text for less emphasis.
     * 
     * @param text The text to dim
     * @return Dimmed text
     */
    public static String dim(String text) {
        return colorize(text, DIM);
    }
}
