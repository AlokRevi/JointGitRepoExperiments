package io.pragra.heightapp.service;

import org.springframework.stereotype.Service;

@Service
public class HeightService {
    public String formatHeightMessage(int height) {
        return "This is the height: " + height + " cm";
    }
}
