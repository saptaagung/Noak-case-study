import java.util.ArrayList;

class Doctor {
    private int averageConsultationTime;

    public Doctor(int averageConsultationTime) {
        this.averageConsultationTime = averageConsultationTime;
    }

    public int getAverageConsultationTime() {
        return averageConsultationTime;
    }
}

public class PatientWaitingTimeCalculator {

    public static int calculateWaitingTime(ArrayList<Doctor> doctors, int patientPosition) {
        int totalWaitingTime = 0;
        for (Doctor doctor : doctors) {
            totalWaitingTime += doctor.getAverageConsultationTime() * (patientPosition + 1);
        }
        return totalWaitingTime;
    }    

    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor(3));
        doctors.add(new Doctor(4));
        int patientPosition = 10;
        int waitingTime = calculateWaitingTime(doctors, patientPosition);
        System.out.println("The estimated waiting time is " + waitingTime);
    }
}
