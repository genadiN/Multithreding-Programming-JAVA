package Action;

public class ActionEvent {
    //this is a class that defines the event arguments
    //takes arguments as you like
    private MyArg arg; // some arguments

    public ActionEvent(MyArg arg){
        setMyArg(arg);
    }

    public MyArg getMyArg(){
        return arg; // return a copy of this.arg
    }
    private void setMyArg(MyArg arg) {
        //validate and set arg;
        this.arg = arg;
    }
}
