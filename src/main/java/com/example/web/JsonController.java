package com.example.web;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@JsonAutoDetect(getterVisibility= JsonAutoDetect.Visibility.NONE)
public class JsonController {

    @GetMapping("/json")
    @ResponseBody
    public String JsonController() {
        return "f";
    }

}