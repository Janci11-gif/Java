class Course {
    String title;
    int duration;
    String instructor;
    
    Course(String title, int duration, String instructor) {
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }
    
    void getCourseInfo() {
        System.out.println(title + " by " + instructor + " (" + duration + " hours)");
    }
}

class LiveCourse extends Course {
    String scheduleTime;
    
    LiveCourse(String title, int duration, String instructor, String scheduleTime) {
        super(title, duration, instructor);
        this.scheduleTime = scheduleTime;
    }
    
    void getCourseInfo() {
        super.getCourseInfo();
        System.out.println("Live at: " + scheduleTime);
    }
}

class RecordedCourse extends Course {
    int videoCount;
    
    RecordedCourse(String title, int duration, String instructor, int videoCount) {
        super(title, duration, instructor);
        this.videoCount = videoCount;
    }
    
    void getCourseInfo() {
        super.getCourseInfo();
        System.out.println("Includes " + videoCount + " videos");
    }
}

public class CoursePortal {
    public static void main(String[] args) {
        Course live = new LiveCourse("Java Basics", 40, "Dr. Smith", "Mon 6 PM");
        Course recorded = new RecordedCourse("Python Data", 30, "Ms. Jones", 25);
        
        live.getCourseInfo();
        recorded.getCourseInfo();
    }
}
