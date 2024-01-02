package sut.css.stu_reg_eva.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "pid", unique = true, nullable = false)
    private String pid;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

}
