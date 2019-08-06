package za.ac.deklerkbasson.controller.demography;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.deklerkbasson.domain.demography.Gender;
import za.ac.deklerkbasson.factory.demography.GenderFactory;
import za.ac.deklerkbasson.service.demography.Impl.GenderServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/payroll/gender")
public class GenderController {

    @Autowired
    @Qualifier("ServiceImpl")
    private GenderServiceImpl service;

    @GetMapping("/create/{genderName}")
    public @ResponseBody
    Gender create(@PathVariable String genderName){
        Gender course = GenderFactory.buildGender(genderName);
        return service.create(course);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Gender> getAll(){
        return service.getAll();
    }
}

