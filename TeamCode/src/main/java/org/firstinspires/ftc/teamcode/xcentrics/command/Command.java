package org.firstinspires.ftc.teamcode.xcentrics.command;

/**
 * The command interface is made to provide all the functionality of the command
 * @author Alex Stephens - 5143
 */
@SuppressWarnings("PMD.TooManyMethods")
public interface Command {

    /**
     * The init method is run when the command is first called from the kernal class
     */
    public default command(){

    }
    default void init(){
    }

    /**
     * The loop method is run every time the robot loops
     */
    default void loop(){

    }

    /**
     * The end method is called after the {@link #isFinished()}
     */
    default void end(){

    }

    /**
     * The is finished method should return true when the command is finished
     * @return {@link Boolean}
     */
    default boolean isFinished(){
        return true;
    }

}
