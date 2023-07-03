package stringExamples.excelReader;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReaderDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("resources/TestExcel.xlsx");
        XSSFWorkbook wk=new XSSFWorkbook(fis);
        XSSFSheet sheet=wk.getSheet("Sheet1");

        FileOutputStream fos=new FileOutputStream("resources/TestExcelWrite.xlsx");
        XSSFWorkbook wkout=new XSSFWorkbook();
        XSSFSheet sheetOut=wkout.createSheet("Result");

        for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                if (sheet.getRow(i).getCell(j).getCellType().equals(CellType.STRING)) {
                    System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + "\t");
                    sheetOut.createRow(i).createCell(j).setCellValue(sheet.getRow(i).getCell(j).getStringCellValue());
                } else if (sheet.getRow(i).getCell(j).getCellType().equals(CellType.NUMERIC)) {
                    System.out.print(sheet.getRow(i).getCell(j).getNumericCellValue() + "\t");
                    sheetOut.createRow(i).createCell(j).setCellValue(sheet.getRow(i).getCell(j).getNumericCellValue());
                } else if (sheet.getRow(i).getCell(j).getCellType().equals(CellType.BOOLEAN)) {
                    System.out.print(sheet.getRow(i).getCell(j).getBooleanCellValue() + "\t");
                    sheetOut.createRow(i).createCell(j).setCellValue(sheet.getRow(i).getCell(j).getBooleanCellValue());

                }

            }
            System.out.println();
            //To Get all the Rows and Columns from the table
//        for(int i=0;i<sheet.getPhysicalNumberOfRows();i++){
//            for(int j=0;j<sheet.getRow(i).getPhysicalNumberOfCells();j++){
//                System.out.print(sheet.getRow(i).getCell(j)+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("Get the No of Rows"+ sheet.getPhysicalNumberOfRows());
//        System.out.println("Get the No of Rows by index"+ sheet.getLastRowNum());
//        XSSFRow row=wk.getSheet("Sheet1").getRow(1);
//        System.out.println(row.getLastCellNum());
//        System.out.println(row.getPhysicalNumberOfCells());


        }
        wkout.write(fos);
        fos.close();

    }
}
