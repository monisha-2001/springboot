package Programming;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class FP05PrintCourses {
    public static void main(String[] args) {
        List<String> courses=List.of("Spring","Spring Boot","API","Microservices");

        ListAllCourses(courses);
    }

    static void ListAllCourses(List<String> courses) {
        courses.stream()
                .filter(course->course.contains("Spring"))
                .forEach(System.out::println);
    }

}
