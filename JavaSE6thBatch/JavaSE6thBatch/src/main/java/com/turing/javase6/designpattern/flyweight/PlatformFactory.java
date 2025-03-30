/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turing.javase6.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mr T.Khine
 */
public class PlatformFactory {
    private static Map<String,Platform> cache = new HashMap<>();
    
    public static Platform getInstance(String platformType)
    {
        Platform p = cache.get(platformType);
        if(p == null)
        {
            switch(platformType)
            {
                case ".NET":
                    p = new DotNetPlatform();
                break;
                case "JAVA":
                    p = new JavaPlatform();
                break;
            }
            cache.put(platformType, p);
            
        }
        return p;
    }
}
