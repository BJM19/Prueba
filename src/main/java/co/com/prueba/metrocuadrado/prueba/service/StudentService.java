package co.com.prueba.metrocuadrado.prueba.service;

import co.com.prueba.metrocuadrado.prueba.dto.StudentDto;
import co.com.prueba.metrocuadrado.prueba.entity.Students;

import java.util.List;

public interface StudentService {
    public List<Students> getStudent();
    public void setStudent(StudentDto student);
    public void updateStudent(String id, String name);
    public void deleteStudent(String id);
}
