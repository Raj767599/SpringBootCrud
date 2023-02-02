package com.xadmin.SpringBootCrud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="wfh")
public class Wfod {



    @Id

    private String employeeID;
    private String getEmployeeName;
    private String slotRecurrence;
    private String shiftTiming;
    private String selectedDate;
    private String cabFacility;
    private String vaccinationStatus;
    private String mealFacility;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getGetEmployeeName() {
        return getEmployeeName;
    }

    public void setGetEmployeeName(String getEmployeeName) {
        this.getEmployeeName = getEmployeeName;
    }

    public String getSlotRecurrence() {
        return slotRecurrence;
    }

    public void setSlotRecurrence(String slotRecurrence) {
        this.slotRecurrence = slotRecurrence;
    }

    public String getShiftTiming() {
        return shiftTiming;
    }

    public void setShiftTiming(String shiftTiming) {
        this.shiftTiming = shiftTiming;
    }

    public String getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(String selectedDate) {
        this.selectedDate = selectedDate;
    }

    public String getCabFacility() {
        return cabFacility;
    }

    public void setCabFacility(String cabFacility) {
        this.cabFacility = cabFacility;
    }

    public String getVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(String vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }

    public String getMealFacility() {
        return mealFacility;
    }

    public void setMealFacility(String mealFacility) {
        this.mealFacility = mealFacility;
    }


}
