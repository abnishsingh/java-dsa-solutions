package com.coding;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

public class getURLResponse{  
public static void main(String[] args) throws SQLException, ClassNotFoundException 
{
	
    HttpURLConnection connection = null;
    try {
        URL u = new URL("http://vpna-int-rep001.ad-dev.issgovernance.com/repository/CURRENT/ICS/rpms/iss-inentivebenchmarking-0.0.4-12.3.noarch.rpm");
        connection = (HttpURLConnection) u.openConnection();
        connection.setRequestMethod("HEAD");
        int code = connection.getResponseCode();
        System.out.println("" + code);
        // You can determine on HTTP return code received. 200 is success.
    } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } finally {
        if (connection != null) {
            connection.disconnect();
        }
    }
}  
}  
