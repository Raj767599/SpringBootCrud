package com.xadmin.SpringBootCrud.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;


public class SelectedDate {
    @Column(name = "Date")
    public String Date;

}
