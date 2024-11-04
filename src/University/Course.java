package University;

public class Course {
    String name;
    String instructor;
    int numberOfStudents;


    public Course(String name, String instructor, int numberOfStudents) {
        this.name = name;
        this.instructor = instructor;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course name:'" + name + '\'' +
                        ", Instructor:'" + instructor + '\'' +
                        ", Students:" + numberOfStudents ;
    }
}
