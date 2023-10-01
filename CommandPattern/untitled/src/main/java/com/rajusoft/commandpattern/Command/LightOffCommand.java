package com.rajusoft.commandpattern.Command;
import com.rajusoft.commandpattern.Receiver.Light;

// Concrete Command for turning off the light
public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
