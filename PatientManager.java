import java.util.ArrayList;

public class PatientManager {
    public ArrayList<Patient> patientList;

    public PatientManager() {
        patientList = new ArrayList<Patient>();
    }

    public int addPatient(Patient patient) {
        patientList.add(patient);
        return patientList.indexOf(patient);
    }

    public Patient removePatient(int spot) {
        Patient patient = patientList.get(spot);
        patientList.remove(spot);
        return patient;
    }

    public void caffeineAbsorption() {
        for(int i = 0; i < patientList.size(); i++) {
            Patient patient = patientList.get(i);
            patient.caffeine = patient.caffeine - 160;
            if(patient.caffeine <= 0) {
                removePatient(i);
                i--;
            }
        }
    }

    @Override
    public String toString() {
        String toPrint = "";
        if(patientList.size() == 0) {
            toPrint = "Empty";
        }
        else {
            for(int i = 0; i < patientList.size(); i++) {
                Patient patient = patientList.get(i);
                toPrint += patient.id + " " + patient.caffeine + "\n";
            }
        }
        return toPrint;
    }
}
