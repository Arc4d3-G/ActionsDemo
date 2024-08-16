/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actionsdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author brdde
 */
public class CurrentTime {
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
    private final Date date = new Date();
    private final String currentTime = formatter.format(date);
    
    public String get(){
        return this.currentTime;
    }
}
