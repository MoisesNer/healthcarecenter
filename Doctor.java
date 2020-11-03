import java.util.ArrayList;

public class Doctor {
	private int doctorId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String specialty;
	ArrayList<Appointment> apointments = new ArrayList<Appointment>();
	
	public Doctor(int doctorId, String firstName, String lastName, String phoneNumber, String email, String specialty) {
		setDoctorId(doctorId);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setSpecialty(specialty);
	}
	
	/**
	 * 
	 * @return doctorId
	 */
	public int getDoctorId() {
		if(doctorId > 1000 && doctorId < 100000) {
			return this.doctorId;
		} else {
			return 1001;
		}
	}
	/**
	 * 
	 * @return firstName
	 */
	public String getFirstName() {
		
		if(firstName.isEmpty() || firstName.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return this.firstName;
		}
	}
	/**
	 * 
	 * @return lastName
	 */
	public String getLastName() {
		
		if(lastName.isEmpty() || lastName.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return this.lastName;
		}
	}
	/**
	 * 
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		
		if(phoneNumber.isEmpty() || phoneNumber.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return this.phoneNumber;
		}
	}
	/**
	 * 
	 * @return email
	 */
	public String getEmail() {
		
		if(email.isEmpty() || email.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return this.email;
		}
	}
	/**
	 * 
	 * @return specialty
	 */
	public String getSpecialty() {
		
		if(specialty.isEmpty() || specialty.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return this.specialty;
		}
	}
	/**
	 * 
	 * @return apointments
	 */
	public ArrayList<Appointment> getAppointment() {
		return apointments;
	}
	
	/**
	 * random doctorId
	 */
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
				//(int)(Math.floor((Math.random() * 90001) + 1000)); //??
		
	}
	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	/**
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		
	}
	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
		
	}
	/**
	 * 
	 * @param specialty
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
		
	}
	/**
	 * 
	 * @param apointments
	 */
	public void setAppointment(ArrayList<Appointment> apointments) {
		this.apointments = apointments;
		
	}
	@Override
	public String toString() {
		return "Doctor Id : " + doctorId + 
				"\nFirst Name" + firstName + 
				"\nLast Name : " + lastName + 
				"\nPhone Number : " + phoneNumber +
				"\nEmail : " + email;
	}
	
	
}