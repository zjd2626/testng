package cn.nome.testng;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Params {
    @DataProvider(name="otherdata")
    public Object[][] getData(){
        Object[][] data = {{"北京","广岛"}, {"亚特兰大", "巴黎"}, {"威尼斯","墨尔本"}};
        return data;
    }

    @DataProvider(name="get_data_from_txt")
    public Object[][] getTxt() throws Exception {
        File file = new File("D:/Workspaces/IdeaProjects/ithm/basic/src/cn/nome/testng/data.txt");
        FileReader bytes = new FileReader(file);
        BufferedReader chars = new BufferedReader(bytes);

        String row = null;
        List<String[]> rows = new ArrayList<String[]>();

        while ((row = chars.readLine()) !=null){
            String[] cols = row.split("\t");
            rows.add(cols);
        }

        Object[][] data = new Object[rows.size()][];

        for (int i = 0; i < rows.size(); i++) {
            data[i]=rows.get(i);
        }
        return data;
    }


    @DataProvider(name = "get_data_from_excel")
    public Object[][] getExcel() throws Exception {
        InputStream file = new FileInputStream("D:/Workspaces/IdeaProjects/ithm/basic/src/cn/nome/testng/test.xls");
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

//        for (String[] x : rows) {
//            for (String y : x)
//                System.out.print(y + "\t");
//            System.out.println();
//        }

        Object[][] data = new Object[rows.size()][];
        for (int i = 0; i < rows.size(); i++) {
            data[i] = rows.get(i);
        }
        return data;
    }
}
