package com.Mp7PiratesoftheCodeBean.dutch_man;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DutchMan {

     String chest="u find the coins";

    @GetMapping("/DutchMan")
    String getcheast(){
        return chest;
    }
}
