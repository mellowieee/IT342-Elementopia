package edu.cit.elementopia.Service;

import edu.cit.elementopia.Entity.StudentEntity;
import edu.cit.elementopia.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<StudentEntity> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
