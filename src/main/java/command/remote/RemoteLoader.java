package command.remote;

public class RemoteLoader {

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

        // set commands in invoker (remote)
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, garageDoorUpCommand, garageDoorDownCommand);
        remote.setCommand(3, stereoOnWithCdCommand, stereoOffCommand);
        remote.setCommand(4, kitchenCeilingFanMediumCommand, kitchenCeilingFanOffCommand);
        remote.setCommand(5, kitchenCeilingFanHighCommand, kitchenCeilingFanOffCommand);

        // print remote
        System.out.println(remote);

        // press buttons on remote (invoker runs execute() )
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        System.out.println(remote);
        remote.undoButtonWasPushed();

        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        System.out.println(remote);
        remote.undoButtonWasPushed();

        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        System.out.println(remote);
        remote.undoButtonWasPushed();

        remote.onButtonWasPushed(3);
        remote.offButtonWasPushed(3);
        System.out.println(remote);
        remote.undoButtonWasPushed();

        System.out.println("=============================");

        remote.onButtonWasPushed(4);
        remote.offButtonWasPushed(4);
        System.out.println(remote);
        remote.undoButtonWasPushed();

        remote.onButtonWasPushed(5);
        System.out.println(remote);
        remote.undoButtonWasPushed();
    }
}
