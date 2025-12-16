public class Student {
    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    public Student(String name, String id, String major){
        this.name=name;
        this.id=id;
        this.major=major;
        this.gpa=0.0;
        this.credits=0;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major=major;
    }
    public double getGpa(){
        return gpa;
    }
    public void updateGpa(double NEWgpa){
        if (NEWgpa >= 0.0 && NEWgpa <= 4.0) {
            this.gpa = NEWgpa;
        }
    }
    public int getCredits(){
        return credits;
    }
    public void addCredits(int c){
        if(c>0){
            this.credits+=c;
        }
    }
    public boolean isHonors(){
        return gpa>=3.5;
    }

    @Override
    public String toString(){
        return "Student{name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", credits=" + credits +
                '}';
    }
}
