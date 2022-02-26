package co.com.prueba.metrocuadrado.prueba.controller;

import co.com.prueba.metrocuadrado.prueba.dto.StudentDto;
import co.com.prueba.metrocuadrado.prueba.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PruebaController {
    @Autowired
    private StudentService service;
    @GetMapping
    public ResponseEntity<?> getStudents(){
        return new ResponseEntity<>(service.getStudent(), HttpStatus.OK)  ;
    }
    @PostMapping
    public ResponseEntity<?> setStudents(@RequestBody StudentDto dto){
        service.setStudent(dto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<?> updateStudents(@RequestParam String id,@RequestParam String name){
        service.updateStudent(id,name);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<?> deleteStudents(@RequestParam String id){
        service.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
