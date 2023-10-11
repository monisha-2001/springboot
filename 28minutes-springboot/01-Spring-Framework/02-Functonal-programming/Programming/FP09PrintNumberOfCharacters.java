package Programming;

import java.util.List;

public class FP09PrintNumberOfCharacters {
    public static void main(String[] args) {
        List<String> courses=List.of("Spring","Spring Boot","API","Microservices");

        ListAllCourses(courses);
    }

    private static void ListAllCourses(List<String> courses) {
        courses.stream()
                .map(course->course+" "+course.length())
                .forEach(System.out::println);
    }

}
