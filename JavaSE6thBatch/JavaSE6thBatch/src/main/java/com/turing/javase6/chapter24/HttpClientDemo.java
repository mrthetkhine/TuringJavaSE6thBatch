/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter24;

import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class HttpClientDemo {
    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request;
            request = HttpRequest.newBuilder(
                    new URI("https://jsonplaceholder.typicode.com/todos/1")
            ).build();
            
            HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());
            
            System.out.println("ResponseCode "+response.statusCode());
            HttpHeaders headers = response.headers();
            Map<String,List<String>> map = headers.map();
            
            for(String key: map.keySet())
            {
                System.out.println("Header "+key + " "+ map.get(key));
            }
            InputStream in= response.body();
            int data ;
            while( (data=in.read())!=-1)
            {
                System.out.print((char)data);   
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
