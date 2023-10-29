abstract class Medication {
    String name;
    String purpose;

    abstract String administer();
}

class Tablet extends Medication {
    Tablet(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }

    String administer() {
        return "Take " + name + " tablet for " + purpose + " as directed.";
    }
}

class Capsule extends Medication {
    Capsule(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }

    String administer() {
        return "Swallow the " + name + " capsule for " + purpose + " according to instructions.";
    }
}

class Syrup extends Medication {
    Syrup(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }

    String administer() {
        return "Shake the " + name + " syrup and take it as prescribed for " + purpose + ".";
    }
}

class MedicationFactory {
    static Medication createMedication(String medicationType, String name, String purpose) {
        if ("tablet".equals(medicationType)) {
            return new Tablet(name, purpose);
        } else if ("capsule".equals(medicationType)) {
            return new Capsule(name, purpose);
        } else if ("syrup".equals(medicationType)) {
            return new Syrup(name, purpose);
        } else {
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MedicationFactory factory = new MedicationFactory();

        Medication medication1 = factory.createMedication("tablet", "Aspirin", "pain relief");
        System.out.println(medication1.administer());

        Medication medication2 = factory.createMedication("syrup", "CoughAway", "cough suppression");
        System.out.println(medication2.administer());
    }
}
