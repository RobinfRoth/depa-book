package command.remote;

public class RemoteLoaderLambda {

    public static void main(String[] args) {

        // invoker
        RemoteControlFunctionalWithoutUndo remote = new RemoteControlFunctionalWithoutUndo();

        // Receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo livingRoomStereo = new Stereo("Living Room");


        // set commands in invoker (remote)
        remote.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
        remote.setCommand(1, () -> kitchenLight.on(), () -> kitchenLight.off());
        remote.setCommand(2, () -> garageDoor.up(), () -> garageDoor.down());
        remote.setCommand(3,
                () -> {
                    livingRoomStereo.on();
                    livingRoomStereo.setCd("Wish You Were Here");
                    livingRoomStereo.setVolume(42);
                },
                () -> livingRoomStereo.off());

        // print remote
        System.out.println(remote);

        // press buttons on remote (invoker runs execute() )
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        remote.onButtonWasPushed(3);
        remote.offButtonWasPushed(3);
    }
}
