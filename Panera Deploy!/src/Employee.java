/* This class represents an employee
 * 
 */


public class Employee implements Comparable<Employee>{

    protected String name;
    protected Time startTime;
    protected Time endTime;

    public Employee(String name){
        this(name, 0, 0);
    }

    public Employee(String name, int startTime, int endTime){
        this(name, new Time(startTime), new Time(endTime));
    }

    public Employee(String name, Time startTime, Time endTime){
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setStartTime(Time aTime){
        this.startTime = aTime;
    }

    public void setEndTime(Time aTime){
        this.endTime = aTime;
    }

    public String getName(){
        return this.name;
    }

    public Time getStartTime(){
        return this.startTime;
    }

    public Time getEndTime(){
        return this.endTime;
    }

    public int compareTo(Employee e){
        Time t = new Time(e.getStartTime());
        return startTime.compareTo(t);
    }
}