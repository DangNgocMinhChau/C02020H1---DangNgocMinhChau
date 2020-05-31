package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConverterController {


    @RequestMapping(value = "/conventer", method = RequestMethod.POST)
    @GetMapping("converter")
    @PostMapping("converter")
    public String Converter(@RequestParam String USD ,
                            @RequestParam String VND,
                            Model model){

        double a = Double.parseDouble(USD);
        double b = Double.parseDouble(VND);

        double c = a * b;
        model.addAttribute("total",c);

        return "result";
    }



}
