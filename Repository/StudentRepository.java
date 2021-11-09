package com.company.Repository;

import Model.Student;
import Repository.InMemoryRepository;
import com.company.Model.Student;

public class StudentRepository extends InMemoryRepository<Student> {

    public StudentRepository(){
        super();
    }

    @Override
    public Student update(Student obj) {
        Student studentToUpdate = this.repoList.stream()
                .filter(student -> student.getStudentId() == obj.getStudentId())
                .findFirst()
                .orElseThrow();

        studentToUpdate.setFirstName(obj.getFirstName());
        studentToUpdate.setLastName(obj.getLastName());
        return studentToUpdate;
    }
}