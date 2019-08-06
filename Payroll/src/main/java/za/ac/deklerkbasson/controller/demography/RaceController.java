package za.ac.deklerkbasson.controller.demography;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.deklerkbasson.domain.demography.Race;
import za.ac.deklerkbasson.factory.demography.RaceFactory;
import za.ac.deklerkbasson.service.demography.Impl.RaceServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/payroll/race")
public class RaceController {

    @Autowired
    @Qualifier("ServiceImpl")
    private RaceServiceImpl service;

    @GetMapping("/create/{raceName}")
    public @ResponseBody
    Race create(@PathVariable String raceName){
        Race course = RaceFactory.buildRace(raceName);
        return service.create(course);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Race> getAll(){
        return service.getAll();
    }
}

