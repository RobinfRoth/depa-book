package command.remote;

public class RemoteLoaderMacro {

    public static void main(String[] args) {

        // invoker
        RemoteControl remote = new RemoteControl();

        // Receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo livingRoomStereo = new Stereo("Living Room");
        CeilingFan kitchenCeilingFan = new CeilingFan("Kitchen");

        // Commands
        LightOnCommand livingRoomLightOn   = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(livingRoomStereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(livingRoomStereo);

        CeilingFanHighCommand kitchenCeilingFanHighCommand = new CeilingFanHighCommand(kitchenCeilingFan);
        CeilingFanMediumCommand kitchenCeilingFanMediumCommand = new CeilingFanMediumCommand(kitchenCeilingFan);
        CeilingFanOffCommand kitchenCeilingFanOffCommand = new CeilingFanOffCommand(kitchenCeilingFan);

        // bundle commands in an array
        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, garageDoorDownCommand, stereoOnWithCdCommand,
                                kitchenCeilingFanHighCommand};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff, garageDoorUpCommand, stereoOffCommand,
                                kitchenCeilingFanOffCommand};

        // create macro commands
        Command partyOnMacro  = new MacroCommand(partyOn);
        Command partyOffMacro = new MacroCommand(partyOff);

        // set commands in invoker (remote)
        remote.setCommand(0, partyOnMacro, partyOffMacro);

        // press buttons
        System.out.println(remote);
        System.out.println("--- Makro Einschalten ---");
        remote.onButtonWasPushed(0);
        System.out.println("--- Makro Ausschalten ---");
        remote.offButtonWasPushed(0);
        System.out.println("--- Makro Ausschalten [Undo] ---");
        remote.undoButtonWasPushed();
    }
}
