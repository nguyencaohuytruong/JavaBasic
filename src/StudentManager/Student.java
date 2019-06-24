package StudentManager;

public class Student{
    private String code;
    private String name;
    private int day;
    private int month;
    private int year;
    private String classRoom;
    private String department;

    public Student() {
    }

    public Student(String code, String name, int day, int month, int year, String classRoom, String department) {
        this.code = code;
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this. classRoom = classRoom;
        this.department = department;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setCode(String newCode){
        this.code = newCode;
    }

    public void setDay(int newDay){
        this.day = newDay;
    }

    public void setMonth(int newMonth){
        this.month = newMonth;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }

    public void setClassRoom(String newClassRoom){
        this.classRoom = newClassRoom;
    }

    public void setDepartment(String newDepartment){
        this.department= newDepartment;
    }

    public String getName(){
        return this.name;
    }

    public String getCode(){
        return this.code;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public String getClassRoom(){
        return this.classRoom;
    }

    public String getDepartment(){
        return this.department;
    }


}
