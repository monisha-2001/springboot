package Programming;

import java.util.List;



public class FP06PrintNames {
    public static void main(String[] args) {
        List<String> courses=List.of("Spring","Spring Boot","API","Microservices");


        ListAllCourses(courses);
    }

    private static void ListAllCourses(List<String> courses) {
        courses.stream()
                .filter(course->course.length()>=4).forEach(System.out::println);

    }
}
