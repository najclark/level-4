import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> docs = new ArrayList<Doctor>();
	ArrayList<Patient> pats = new ArrayList<Patient>();
	
	public void addDoctor(Doctor doc) {
		docs.add(doc);
	}
	public ArrayList<Doctor> getDoctors(){
		return docs;
	}
	public void addPatient(Patient patient) {
		pats.add(patient);
	}
	public ArrayList<Patient> getPatients() {
		return pats;
	}

}
