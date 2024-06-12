package com.example.first.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.first.Model.Student;

@Service
public class Studentservice {

    public List<Student> uploadFile(MultipartFile file) throws IOException {
        try (InputStream is = file.getInputStream()) {
            return ExcelUtils.parseExcelFile(is, file.getOriginalFilename());
        }
    }
}

