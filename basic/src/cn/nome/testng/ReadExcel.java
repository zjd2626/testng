package cn.nome.testng;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadExcel {
    public static void main(String[] args) throws Exception {
        InputStream file = new FileInputStream("D:/我的文档/桌面/test.xls");
        Workbook excel = Workbook.getWorkbook(file);
        Sheet sheet = excel.getSheet(0);
        Cell cell = null;
        List<String[]> rows = new ArrayList<String[]>();
        for (int i = 1; i < sheet.getRows(); i++) {
            String[] cols = new String[sheet.getColumns()];

            for (int j = 0; j < sheet.getColumns(); j++) {
                cell = sheet.getCell(j, i);
                cols[j] = cell.getContents();
            }
            rows.add(cols);
        }
        file.close();

        for (String[] x : rows) {
            for (String y : x)
                System.out.print(y + "\t");
            System.out.println();
        }
        Object[][] data = new Object[rows.size()][];
        for (int i = 0; i < rows.size(); i++) {
            data[i] = rows.get(i);
        }
    }
}

