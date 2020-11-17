package Lecture_10_Design_Paterns.ExProblem_2.Command;
import Lecture_10_Design_Paterns.ExProblem_2.Builder.MapBuilder;
import Lecture_10_Design_Paterns.ExProblem_2.Builder.MyMapBuilder;
import Lecture_10_Design_Paterns.ExProblem_2.Stone.ThrowFast;
import Lecture_10_Design_Paterns.ExProblem_2.Stone.ThrowSlow;
import java.util.Map;
public class CommandInterpreter implements CommandListener {


    private Map<String, Command> commands;


    public CommandInterpreter() {
        MapBuilder<String, Command> builder = new MyMapBuilder<>();
        this.commands = builder
                .entry("W", new MoveUp())
                .entry("S", new MoveDown())
                .entry("A", new MoveLeft())
                .entry("D", new MoveRight())
                .entry("AS", new MoveLeftDown())
                .entry("FS", new Fire(new ThrowFast()))
                .entry("F", new Fire(new ThrowSlow()))
                .build();
    }


    @Override
    public void handleCommand(String type) {
        Command command = commands.get(type.toUpperCase());
        if (command == null) {
            throw  new IllegalArgumentException("Invalid command type");
        }
        command.execute();
    }


}
