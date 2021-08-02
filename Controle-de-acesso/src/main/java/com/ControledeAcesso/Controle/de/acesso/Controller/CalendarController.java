package com.ControledeAcesso.Controle.de.acesso.Controller;

import com.ControledeAcesso.Controle.de.acesso.Model.Calendar;
import com.ControledeAcesso.Controle.de.acesso.Service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Calendar")
public class CalendarController {

    @Autowired
    CalendarService calendarService;

    @PostMapping
    public Calendar createCalendar(@RequestBody Calendar calendar){
        return calendarService.saveCalendar(calendar);
    }

    @GetMapping
    public List<Calendar> getCalendarList(){
        return calendarService.findAll();
    }

    @GetMapping("/{idCalendar}")
    public ResponseEntity<Calendar> getCalendarById(@PathVariable("idCalendar") Long idCalendar) throws Exception{
        return ResponseEntity.ok(calendarService.getById(idCalendar).orElseThrow(() ->
                new NoSuchElementException("Calendar not found")));
    }

    @PutMapping
    public Calendar updateCalendar(@RequestBody Calendar calendar){
        return calendarService.updateCalendar(calendar);
    }

    @DeleteMapping("/{idCalendar}")
    public ResponseEntity<Calendar>deleteCalendarById(@PathVariable("idCalendar") Long idCalendar) throws Exception{
        calendarService.deleteCalendarById(idCalendar);
        return (ResponseEntity<Calendar>) ResponseEntity.ok();
    }
}