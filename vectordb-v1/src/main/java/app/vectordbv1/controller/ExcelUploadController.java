package app.vectordbv1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.vectordbv1.service.ExcelUploadService;

@RestController
public class ExcelUploadController {

	private final ExcelUploadService excelUploadService;

    @Autowired
    public ExcelUploadController(ExcelUploadService excelUploadService) {
        this.excelUploadService = excelUploadService;
    }

    @PostMapping("/upload")
    public String uploadExcelFile(@RequestParam("file") String filePath) {
        excelUploadService.processExcelFile(filePath);
        return "Excel file uploaded successfully!";
    }
}
