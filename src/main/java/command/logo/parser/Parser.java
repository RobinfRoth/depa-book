package command.logo.parser;

import java.util.Scanner;

import command.logo.commands.Command;

public class Parser {
	private CommandRegistry registry;

	public Parser(CommandRegistry registry) {
		this.registry = registry;
	}

	public Command parse(Scanner scanner) {
		return registry.getCommand(scanner);
	}
}