package com.utils;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	private static MissingCellPolicy xRow;
    	
    
    	public static void setExcelFile(String path, String SheetName) throws Exception 
    	{
	  
	  FileInputStream ExcelFile= new FileInputStream("C:\\Pawan Sharma\\AutoProject\\Test Data\\Test_Data.xlsx");
	  
	  try
	  {
	  ExcelWBook = new XSSFWorkbook(ExcelFile);
	  //ExcelWSheet=ExcelWBook.getSheet("Sheet1");
	  ExcelWSheet = ExcelWBook.getSheetAt(0);
	    }
	  catch(Exception e) {
      throw(e);
  
	  }
	  }
  
  //This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Column
  public static String getCellData(int RowNum,int ColNum)throws Exception
  {
  try
  {
	 Cell= ExcelWSheet.getRow(RowNum).getCell(ColNum);
	 //Cell.setCellType(Cell.CELL_TYPE_STRING);
	 Cell.setCellType(Cell.getCellType());
	 String CellData=Cell.getStringCellValue();
	  return CellData;
	  
	  }  catch (Exception e)  {
	  return "";
	  }
    }

  public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

			try{

			Row  = ExcelWSheet.getRow(RowNum);

			//Cell = Row.getCell(ColNum,xRow.RETURN_BLANK_AS_NULL); //,Row.RETURN_BLANK_AS_NULL
			Cell=Row.getCell(ColNum,org.apache.poi.ss.usermodel.Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);//

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

				} else {

					Cell.setCellValue(Result);

				}
			
			}catch(Exception e){

				throw (e);
		}

	}
  public static int getRowCount(int sheetIndex)
  {
  int row = ExcelWBook.getSheetAt(0).getLastRowNum();
  row = row + 1;
    return row;
  }

}
