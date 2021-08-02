package com.ControledeAcesso.Controle.de.acesso.Service;

import com.ControledeAcesso.Controle.de.acesso.Model.Calendar;
import com.ControledeAcesso.Controle.de.acesso.Repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarService {

    CalendarRepository calendarRepository;

    @Autowired
    public CalendarService(CalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    public Calendar saveCalendar(Calendar calendar) {
        return calendarRepository.save(calendar);
    }

    public List<Calendar> findAll() {
        return calendarRepository.findAll();
    }

    public Optional<Calendar> getById(Long idCalendar) {
        return calendarRepository.findById(idCalendar);
    }

    public Calendar updateCalendar(Calendar calendar){
        return calendarRepository.save(calendar);
    }

    public void deleteCalendarById(Long idCalendar) {
        calendarRepository.deleteById(idCalendar);
    }
}