package com.example.first.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.first.Model.Student;

public class ExcelUtils {

    private static final Logger logger = LoggerFactory.getLogger(ExcelUtils.class);

    public static List<Student> parseExcelFile(InputStream inputStream, String fileName) throws IOException {
        List<Student> students = new ArrayList<>();

        try (Workbook workbook = getWorkbook(inputStream, fileName)) {
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            if (rowIterator.hasNext()) {
                rowIterator.next(); // Skip header row
            }

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Student student = new Student();

                student.setId((long) row.getCell(0).getNumericCellValue());
                student.setName(row.getCell(1).getStringCellValue());
                student.setMark(row.getCell(2).getNumericCellValue());

                students.add(student);

                // Log student details for debugging
                logger.debug("Parsed Student: {}, {}, {}", student.getId(), student.getName(), student.getMark());
            }
        } catch (IOException e) {
            logger.error("Error parsing Excel file", e);
            throw e;
        }

        return students;
    }

    private static Workbook getWorkbook(InputStream inputStream, String fileName) throws IOException {
        if (fileName.endsWith(".xls")) {
            return new HSSFWorkbook(inputStream);
        } else if (fileName.endsWith(".xlsx")) {
            return new XSSFWorkbook(inputStream);
        } else {
            throw new IllegalArgumentException("The specified file is not an Excel file");
        }
    }
}

