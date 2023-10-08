package com.rajusoft.commandpattern.Invoker;

import com.rajusoft.commandpattern.Command.Command;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class RemoteControl {

    private List<Command> commands;

    public RemoteControl(){
        commands = new ArrayList<>();
    }

    public void  AddCommand(Command command){
        commands.add(command);
    }

    public void pressButton(int index){
        if(index >=0 && index < commands.size()){
                commands.get(index).execute();
        }else{
            System.out.println("Invalid command index");
        }
    }
}
