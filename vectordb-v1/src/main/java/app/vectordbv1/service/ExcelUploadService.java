package app.vectordbv1.service;

import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.File;


import app.vectordbv1.model.DataModel;
import app.vectordbv1.repository.DataModelRepository;

@Service
public class ExcelUploadService {

    @Autowired
    private DataModelRepository databaseRepository;

    public void processExcelFile(String filePath) {
        try (Workbook workbook = WorkbookFactory.create(new File(filePath))) {
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (isValidRow(row)) {
                    DataModel data = getDataFromRow(row);
                    if (data != null) {
                        saveToDatabase(data);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isValidRow(Row row) {
        return row.getRowNum() != 0 && row.getPhysicalNumberOfCells() > 0;
    }

    private DataModel getDataFromRow(Row row) {
        DataModel data = new DataModel();

        data.setFirstName(getStringValue(row.getCell(0)));
        data.setLastName(getStringValue(row.getCell(1)));
        data.setEmailAddress(getStringValue(row.getCell(2)));
        data.setCompanyName(getStringValue(row.getCell(3)));
        data.setCompanyDomain(getStringValue(row.getCell(4)));
        data.setJobTitle(getStringValue(row.getCell(5)));
        data.setJobFunction(getStringValue(row.getCell(6)));
        data.setJobLevel(getStringValue(row.getCell(7)));
        data.setCompanyAddress(getStringValue(row.getCell(8)));
        data.setCity(getStringValue(row.getCell(9)));
        data.setState(getStringValue(row.getCell(10)));
        data.setZipCode(getStringValue(row.getCell(11)));
        data.setCountry(getStringValue(row.getCell(12)));
        data.setTelephoneNumber(getStringValue(row.getCell(13)));
        data.setEmployeeSize(getStringValue(row.getCell(14)));
        data.setIndustry(getStringValue(row.getCell(15)));
        data.setCompanyLink(getStringValue(row.getCell(16)));
        data.setProspectLink(getStringValue(row.getCell(17)));

        return data;
    }

    private String getStringValue(Cell cell) {
        if (cell == null) {
            return null;
        } else {
            switch (cell.getCellType()) {
                case STRING:
                    return cell.getStringCellValue();
                case NUMERIC:
                    return String.valueOf(cell.getNumericCellValue());
                default:
                    return null;
            }
        }
    }

    private void saveToDatabase(DataModel data) {
        if (isValidData(data)) {
            databaseRepository.save(data);
        }
    }

    private boolean isValidData(DataModel data) {
        return data.getFirstName() != null && data.getLastName() != null;
    }
}
