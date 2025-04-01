/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.designpattern.cor;

/**
 *
 * @author macbook
 */
public class CORDemo {
    public static void main(String[] args) {
        Handler logging = new LoggingHandler();
        Handler auth = new AuthHandler();
        Handler controller = new Controller();
        
        logging.setNext(auth);
        auth.setNext(controller);
        
        Request request = new Request("http://localhost:3000/api");
        //request.addHeader("Authorization", "Bearer TOken");
        
        logging.handle(request);
    }
}
