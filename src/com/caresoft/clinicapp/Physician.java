package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!
    
    public Physician(int id) {
    	this.id = id;
    }
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    // TO DO: Setters & Getters
    
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	@Override
	public boolean assignPin(int pin) {
		
		int lengthOfPin = String.valueOf(pin).length();
		// TODO Auto-generated method stub
		if( lengthOfPin < 4 || lengthOfPin > 4) {
			return false;
		}
		else 
		
			return true;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if(this.id == confirmedAuthID ) {
			return true;
		}
		else 
			return false;
	}
	


}
