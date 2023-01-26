package command.logo.commands;

import java.util.Scanner;

@FunctionalInterface
public interface CommandFactory {
	Command createCommand(Scanner scanner);
}