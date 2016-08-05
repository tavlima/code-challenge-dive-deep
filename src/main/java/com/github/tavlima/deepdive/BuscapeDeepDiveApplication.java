package com.github.tavlima.deepdive;

import com.github.tavlima.deepdive.command.NavigationCommand;
import com.github.tavlima.deepdive.domain.CommandCode;
import com.github.tavlima.deepdive.domain.Submarine;
import com.github.tavlima.deepdive.output.StateDumper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

@SpringBootApplication
public class BuscapeDeepDiveApplication implements CommandLineRunner {

	@Autowired
	private Set<NavigationCommand> commands;

	@Autowired
	private Submarine submarine;

	@Autowired
	private StateDumper stateDumper;

	@Override
	public void run(String... args) throws Exception {
		String inputCommands = args[0];

		Arrays.stream(inputCommands.split(""))
				// CommandCode for each char
				.map(CommandCode::getCommand)
				// Remove unknown codes
				.filter(c -> c != null)
				// Get navigation commands for each CommandCode
				.map(this::getNavigationCommandsForCode)
				// Concat streams
				.flatMap(Function.identity())
				// Process navigation commands
				.forEach(nc -> nc.execute(this.submarine));

		stateDumper.dump(submarine);
	}

	private Stream<NavigationCommand> getNavigationCommandsForCode(CommandCode commandCode) {
		return this.commands.stream().filter(nc -> nc.handles(commandCode));
	}

	public static void main(String[] args) {
		SpringApplication.run(BuscapeDeepDiveApplication.class, args);
	}

}
