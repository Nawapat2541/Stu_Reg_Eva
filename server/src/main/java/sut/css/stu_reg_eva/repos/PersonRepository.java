package sut.css.stu_reg_eva.repos;

import sut.css.stu_reg_eva.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String> {

}
