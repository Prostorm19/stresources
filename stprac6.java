/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumgcd;

/**
 *
 * @author catch
 */
import java.io.File; 
import java.io.IOException; 
import jxl.Cell; 
import jxl.CellType; 
import jxl.Sheet; 
import jxl.Workbook; 
import jxl.read.biff.BiffException; 

public class stprac6
{
    private String inputFile; 
    public void setInputFile(String inputFile) {this.inputFile = inputFile;} 
    public void read() throws IOException 
    { 
        File inputWorkbook = new File(inputFile); 
        Workbook w; 
        boolean flag=false; 
        int count=0; 
    try 
    { 
        w = Workbook.getWorkbook(inputWorkbook); 
        // Get the first sheet
        Sheet sheet = w.getSheet(0); 
        // Loop over first 10 column and lines
        for (int j = 0; j < sheet.getRows(); j++) 
        { 
            for (int i = 0; i < sheet.getColumns()-1; i++) 
            { 
                Cell cell = sheet.getCell(i, j); 
                if (cell.getType() == CellType.NUMBER) 
                { 
                    if(Integer.parseInt(cell.getContents())>=60)
                    { 
                        flag = true; 
                        if(flag == true)
                        { 
                            count++; 
                            flag=false; 
                        }        
                    break; 
                    } 
                } 
            } 
        } 
        System.out.println("Total number of students who scored more than 60 in one or more subjects: " +count); 
    } 
    catch (BiffException e) {e.printStackTrace();} 
    } 
    public static void main(String[] args) throws IOException 
    { 
    stprac6 test = new stprac6(); 
    test.setInputFile("C:\\Pratham\\books\\sem 5\\ST\\Student.xls"); 
    test.read(); 
    } 
}
