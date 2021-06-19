package ch06.examples.v1;

public class RemoteLoader {

    public static void main(String[] args) {

        Stereo stereo = new Stereo("Living Room");
        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);

    }

}
