/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.beans;

/**
 *
 * @author john
 */
public class Persons {
    private Persons() {
        
    }
    
    public static Person JOHN() {
        Person john = new Person();
        john.setFirstName("John");
        john.setLastName("McDonnell");
        john.setNickName("The Mouth");
        john.setImageUrl("https://scontent-ams3-1.xx.fbcdn.net/hphotos-xfa1/t31.0-8/11109026_10206735679331774_6444700383016010026_o.jpg");
        return john;
    }
    
    public static Person MARK() {
        Person mark = new Person();
        mark.setFirstName("Mark");
        mark.setLastName("Conlon");
        mark.setNickName("D'Marcus");
        mark.setImageUrl("https://scontent-ams3-1.xx.fbcdn.net/hphotos-frc3/v/t1.0-9/942728_10201237772293642_489246806_n.jpg?oh=f8dc3e1145ec080e0adb6da8c161e9a3&oe=56115234");
        return mark;
    }
    
    public static Person TOMMY() {
        Person tommy = new Person();
        tommy.setFirstName("Tommy");
        tommy.setLastName("O'Hora");
        tommy.setNickName("Tommy Hornchurch");
        tommy.setImageUrl("https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xpf1/v/t1.0-1/c53.53.662.662/534502_10152191287070114_322322669_n.jpg?oh=4cf1cc102d4964fda8254d9d897734a5&oe=561EC8D3&__gda__=1444398748_ca5bd2f33f8f75e1d09d70b594a280cf");
        return tommy;
    }
}
