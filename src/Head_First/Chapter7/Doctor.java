package Head_First.Chapter7;

public class Doctor {
    boolean worksAtHospital;

    void treatPatient() {
	// Perform a checkup
    }
}

class FamilyDoctor extends Doctor {
    boolean makesHouseCalls;

    void giveAdvice() {
//	Give homespun advice
    }

    void treatPatient() {
	// TODO Auto-generated method stub
	super.treatPatient();
    }
}

class Surgeon extends Doctor {

    void makeIncision() {

    }

    void treatPatient() {
	// TODO Auto-generated method stub
	super.treatPatient();
    }
}