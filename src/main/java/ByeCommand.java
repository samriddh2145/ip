public class ByeCommand implements Command {

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        // Print the exit message directly
        ui.showByeMessage();
    }

    @Override
    public boolean isExit() {
        return true; // Indicates that the program should terminate
    }
}
