package demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;
    @Column
    private String name;
    @Column
    private String author;

    public Course() {

    }
}
