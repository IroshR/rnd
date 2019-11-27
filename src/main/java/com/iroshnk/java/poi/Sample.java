package com.iroshnk.java.poi;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.bson.Document;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class Sample {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        //final String SAMPLE_XLSX_FILE_PATH = "D:\\Learning\\java_8\\example\\src\\main\\java\\com\\iroshnk\\java\\poi\\sample-xlsx-file.xlsx";
        final String SAMPLE_XLSX_FILE_PATH = "D:\\Learning\\GIT_HUB\\rnd\\src\\main\\java\\com\\iroshnk\\java\\poi\\product.xlsx";

        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));

        Sheet sheet = workbook.getSheetAt(0);

        DataFormatter dataFormatter = new DataFormatter();

        Iterator<Row> rowIterator = sheet.rowIterator();

        rowIterator.next(); //to ignore 1st row

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();

            Document document = new Document();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String cellKey = cell.getSheet().getRow(0).getCell(cell.getColumnIndex()).getRichStringCellValue().toString();

                String cellValue = dataFormatter.formatCellValue(cell);
                document.append(cellKey, cellValue);

                //System.out.print(cellValue + "\t");
                //System.out.print("-------"+ss+"-------"+ CellReference.convertNumToColString(cell.getColumnIndex()) + "\t");

            }
            document.append("sss",12);
            //System.out.println(document.toString());
            System.out.println(document.getString("vatExempted"));
            //System.out.println(document.getBoolean("vatExempted"));

            //System.out.println(document.getInteger("sss"));
        }


        workbook.close();
    }
}
