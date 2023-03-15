package com.gyojincompany.test;

import com.gyojincompany.dto.TestDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value = "/test")
    public String test(Model model) {
        model.addAttribute("name","HelloWorld!!!");
        TestDto testDto = new TestDto();
        testDto.testone();
       return "test";
    }

}
