public class PatientTester {
    public static void main(String[] args) {
        PatientManager manager = new PatientManager();
        System.out.println(manager);

        for(int i = 1; i < 5; i++) {
            Patient patient = new Patient(i, 200 * i);
            manager.addPatient(patient);
        }
        System.out.println(manager);

        manager.caffeineAbsorption();
        manager.caffeineAbsorption();
        System.out.println(manager);

        double highestCaffeine = manager.patientList.get(0).caffeine;
        Patient patientToRemove = manager.patientList.get(0);
        for(int i = 0; i < manager.patientList.size(); i++) {
            Patient patient = manager.patientList.get(i);
            if(patient.caffeine > highestCaffeine) {
                patientToRemove = patient;
            }
        }
        manager.removePatient(manager.patientList.indexOf(patientToRemove));
        System.out.println(manager);
    }
}
