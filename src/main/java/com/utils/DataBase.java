package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class DataBase {
	public static Logger log;
	
	private static String username="pawan";
	private static String password="1t)BjGC%qJE$pV~wOPsy";
	
	
	public static void Extract_Multi_Data_From_Table (String SQLQueries) throws Exception	{
			log= LogManager.getLogger(DataBase.class);	 
			 try {
				 System.out.println("Executed Query:  "+SQLQueries);
	            Connection connection = DriverManager.getConnection(com.Base.Config_file.stagedbUrl,username, password);
	            Statement statement = connection.createStatement();
	            ResultSet resultSet = statement.executeQuery(SQLQueries);
	            
	            List<String[]> dataList = new ArrayList<>();
	            ResultSetMetaData metaData = resultSet.getMetaData();
	               int columnCount = metaData.getColumnCount();
	               for (int i = 1; i <= columnCount; i++) 
	               {
	            	  
	                   System.out.print("    "+metaData.getColumnName(i));
		               log.info("   "+metaData.getColumnName(i) );

	               }
	              
	            while (resultSet.next()) {
	                String[] row = new String[resultSet.getMetaData().getColumnCount()];
	                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
	                    row[i - 1] = resultSet.getString(i);
	                }
	                dataList.add(row);
	            }
	            for (String[] row : dataList) {
	                for ( String value : row) {
	                    System.out.print(value + "\t\t");
	                   log.info(value + "\t\t");
	                }
	                       
	                System.out.println();
	               log.info(dataList); 
	            }
	            resultSet.close();
	            statement.close();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
			 
			
	}

    public static void Extract_Single_Data_From_Table(String SQLQuery) 
    {
        Logger log = LogManager.getLogger(DataBase.class);
        //String SQLQuery="Select * from mobycy.kyc_document where documentFront='6672503'";
        try (
        	 Connection connection = DriverManager.getConnection(com.Base.Config_file.stagedbUrl, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQLQuery)) {

            List<String[]> dataList = new ArrayList<>();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.print("    " + metaData.getColumnName(i));
            }
            System.out.println(); // Add a new line after printing column names

            while (resultSet.next()) {
                String[] row = new String[resultSet.getMetaData().getColumnCount()];
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    row[i - 1] = resultSet.getString(i);
                }
                dataList.add(row);
            }

            for (String[] row : dataList) {
                for (String value : row) {
                    System.out.print(value + "\t\t");
                    log.info(value + "\t\t");
                }
                System.out.println();
                log.info(dataList);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
