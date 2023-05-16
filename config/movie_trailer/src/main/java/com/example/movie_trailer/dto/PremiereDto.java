package com.example.movie_trailer.dto;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Pattern;
import java.util.Date;

public class PremiereDto implements Validator {

    private String id;
    @Pattern(regexp = "^(CI-)\\d{4}$")
    private String exportCode;
    private String name;
    private Date date;
    private int ticket;

    public PremiereDto() {
    }

    public PremiereDto(String id, String exportCode, String name, Date date, int ticket) {
        this.id = id;
        this.exportCode = exportCode;
        this.name = name;
        this.date = date;
        this.ticket = ticket;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExportCode() {
        return exportCode;
    }

    public void setExportCode(String exportCode) {
        this.exportCode = exportCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
