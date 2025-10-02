package org.firstinspires.ftc.teamcode.xcentrics.command;

@SuppressWarnings("PMD.AbstractClassWithoutAbstractMethod")
public abstract class CommandBase {
    //ID of command, used to tell if it is already running
    private int ID = 0;
    //used to know if it needs an id assinged
    boolean hasID = false;
    public void setID(int ID){
        this.ID = ID;
        hasID = true;
    }
    public int getID(){
        return ID;
    }
    public boolean isHasID(){
       return hasID;
    }


}
