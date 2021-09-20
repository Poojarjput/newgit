package com.htc.clinicmanagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctordetails")
public class Doctor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2384532479284169078L;
	@Id
	@GeneratedValue
	private long doctorId;
	private String doctorName;
	private long appointmentId;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(long doctorId, String doctorName, long appointmentId) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.appointmentId = appointmentId;
		
	}
	
	
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (appointmentId ^ (appointmentId >>> 32));
		result = prime * result + (int) (doctorId ^ (doctorId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (appointmentId != other.appointmentId)
			return false;
		if (doctorId != other.doctorId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Doctor Details are..... [Doctor Id Is.....=" + doctorId + ", Doctor Name Is=" + doctorName + ", Appointment Id Is....=" + appointmentId
				+  "]";
	}
	
	
	
	

}
