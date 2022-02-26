package co.com.prueba.metrocuadrado.prueba.service;

import co.com.prueba.metrocuadrado.prueba.dto.StudentDto;
import co.com.prueba.metrocuadrado.prueba.entity.Students;
import co.com.prueba.metrocuadrado.prueba.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentsServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Students> getStudent() {
        return (List<Students>) studentRepository.findAll();
    }

    @Override
    public void setStudent(StudentDto student) {
        Students students = new Students();
        students.setName(student.getName());
        students.setIdentificationCard(student.getIdentificationCard());
    }

    @Override
    public void updateStudent(String id, String name) {
        Optional<Students> students = studentRepository.findById(id);
        Students students1 = students.get();
        students1.setName(name);
        studentRepository.save(students1);
    }

    @Override
    public void deleteStudent(String id) {
        Optional<Students> students = studentRepository.findById(id);
        Students students1 = students.get();
        studentRepository.delete(students1);

    }
}
