package org.firstinspires.ftc.teamcode.xcentrics.command;

import org.firstinspires.ftc.teamcode.xcentrics.componet.Component;

import java.util.ArrayList;

public final class Kernel {
    //arraylist used to store the components of the robot
    ArrayList<Component> components = new ArrayList<>();
    ArrayList<Command> commands = new ArrayList<>();


    public void registerComponents(Component component){
        components.add(component);
    }
    public void registerCommand(Command command){
        if(command.hasID())
    }

}
