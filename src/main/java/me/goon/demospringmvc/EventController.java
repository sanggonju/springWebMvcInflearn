package me.goon.demospringmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

    private EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    //    @RequestMapping(value="/events", method = RequestMethod.GET)
    @GetMapping(value="/events") //요즘은 이렇게 쓴다. spring 4.3 부터 사용 가능해짐.
    public String events(Model model){
        model.addAttribute("events", eventService.getEvents());
        return "events/list"; //기본적인 뷰 resources / templates에서 찾게됨.
    }
}
