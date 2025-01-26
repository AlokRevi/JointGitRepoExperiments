package io.pragra.heightapp.service;

import org.springframework.stereotype.Service;

@Service
public class HeightService {
    public String formatHeightMessage(int height) {
        int feet = height/12;
        int inches = height%12;
        return "Your height is : " +  feet + " ft " + inches + " inches"  ;
    }
}
