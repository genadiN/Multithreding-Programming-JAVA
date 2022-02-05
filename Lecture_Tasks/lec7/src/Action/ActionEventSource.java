package Action;

import java.awt.event.ActionEvent;

public class ActionEventSource { // event source
    private ActionListener ie;
    //ActionListener may be also public available!

    private boolean onAction;
    public  ActionEventSource (ActionListener event){
        //save the event object for later use.
        ie = event;
        //nothing to report yet
        onAction = false;
    }

    public void addActionListener(ActionListener al){
        ie = al;
    }

    public void doWork(){
        //check the predicate which is set elsewhere.
        if(onAction){
            //signal the even by invoking the interface's method.
            //Create MyArg object and pass it to the event handler
            //the event is fired!
            if(ie != null) {}// event is handles!!!
                //ie.actionPerformed(new ActionEvent(new MyArg()));
        }
    }
}
