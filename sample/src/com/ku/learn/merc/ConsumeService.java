/*package com.ku.learn.merc;





import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

 

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;

import org.apache.commons.httpclient.HttpClient;

import org.apache.commons.httpclient.HttpException;

import org.apache.commons.httpclient.HttpStatus;

import org.apache.commons.httpclient.methods.GetMethod;

import org.apache.commons.httpclient.params.HttpMethodParams;

 

 
@ManagedBean
@RequestScoped
public class ConsumeService {

     

      private  String url="http://172.24.5.9:8080/springrest/services/employee/1.json";

 

      *//**

      * @param args

      *//*


public void doService(){           

            HttpClient client = new HttpClient();

 

          // Create a method instance.

          GetMethod method = new GetMethod(url);

         

          // Provide custom retry handler is necessary

          method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler(3, false));

 

          try {

            // Execute the method.

            int statusCode = client.executeMethod(method);

           

            System.out.println(statusCode);

 

            if (statusCode != HttpStatus.SC_OK) {

              System.err.println("Method failed: " + method.getStatusLine());

            }

 

            // Read the response body.

            byte[] responseBody = method.getResponseBody();

 

            // Deal with the response.

            // Use caution: ensure correct character encoding and is not binary data

            System.out.println(new String(responseBody));

 

          } catch (HttpException e) {

            System.err.println("Fatal protocol violation: " + e.getMessage());

            e.printStackTrace();

          } catch (IOException e) {

            System.err.println("Fatal transport error: " + e.getMessage());

            e.printStackTrace();

          } finally {

            // Release the connection.

            method.releaseConnection();

          }

 

      }

 

}*/