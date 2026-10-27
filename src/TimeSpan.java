public class TimeSpan {
//- Variables used
    private long begin; // Current time in nano seconds
    private long end; // Current time in nano seconds
    private long differenceNano; // 
    private String beginMessage;
    private String endMessage;
    private boolean finished = false;

//- Constructor with no message
    public TimeSpan(){
        begin = System.nanoTime();
    }
//- Constructor with messages
    public TimeSpan(String message){
        begin = System.nanoTime();
        beginMessage = message;
    }
//- Process is stopped w/ no message
    public void stop(){
        end = System.nanoTime();
        differenceNano = end - begin;
        finished = true;
    }
//- Process is stopped w/ message
    public void stop(String message){
        end = System.nanoTime();
        endMessage = message;
        differenceNano = end - begin;
        finished = true;
    }
//- Get the status of the process
    public boolean isFinished(){
        return finished;
    }
//- Get the start message
    public String getStartMessage(){
        return beginMessage;
    }
//- Get the end message
    public String getEndMessage(){
        return endMessage;
    }
//- Get the difference
//- If the process is not finsihed then a detailed message will appaear
    public long getDifference(){
        if(!finished){
            throw new IllegalStateException("The timer has not been stopped yet.");
        }
        return differenceNano;        
    }
}
