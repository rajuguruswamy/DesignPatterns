package com.rajusoft.commandpattern.Command;

import com.rajusoft.commandpattern.Receiver.Light;

// concrete command for turning on the light
public class LightOnCommand  implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
