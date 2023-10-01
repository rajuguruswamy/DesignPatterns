package com.rajusoft.commandpattern;

import com.rajusoft.commandpattern.Command.FanStartCommand;
import com.rajusoft.commandpattern.Command.FanStopCommand;
import com.rajusoft.commandpattern.Invoker.RemoteControl;
import com.rajusoft.commandpattern.Receiver.Fan;
import com.rajusoft.commandpattern.Receiver.Light;
import com.rajusoft.commandpattern.Command.LightOffCommand;
import com.rajusoft.commandpattern.Command.LightOnCommand;

public class Solution {
    public static void  main(String[] args){
        Light LivingRoomlight = new Light();
        Fan  ceilingFan  = new Fan();

        LightOnCommand lightOnCommand  = new LightOnCommand(LivingRoomlight);
        LightOffCommand lightOffCommand = new LightOffCommand(LivingRoomlight);
        FanStartCommand fanStartCommand = new FanStartCommand(ceilingFan);
        FanStopCommand fanStopCommand =new FanStopCommand(ceilingFan);

        // Create invoker object
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.AddCommand(lightOnCommand);
        remoteControl.AddCommand(lightOffCommand);
        remoteControl.AddCommand(fanStartCommand);
        remoteControl.AddCommand(fanStopCommand);


        //Press the Light buttons
        remoteControl.pressButton(0);
        remoteControl.pressButton(1);



        //Press the Fan buttons
        remoteControl.pressButton(2);
        remoteControl.pressButton(3);


    }
}
