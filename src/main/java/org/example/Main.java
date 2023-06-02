package org.example;

// Client code
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();

        // Assign commands to the remote control buttons
        Command turnOnCommand = new TurnOnLightCommand(light);
        Command turnOffCommand = new TurnOffLightCommand(light);

        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton(); // Turns on the light

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton(); // Turns off the light
    }
}
