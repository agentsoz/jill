package cqengine;
import com.googlecode.cqengine.attribute.Attribute;
import com.googlecode.cqengine.attribute.SimpleAttribute;

public class Resident {

    public String name;
    public int age;
    public String gender;
    public String maritalStatus;

    public Resident(int carId, String name, String gender, String maritalStatus) {
        this.age = carId;
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return name +"','" + age + "," + gender + "," + maritalStatus;
    }

    // -------------------------- Attributes --------------------------
    public static final Attribute<Resident, Integer> AGE = new SimpleAttribute<Resident, Integer>("age") {
        public Integer getValue(Resident r) { return r.age; }
    };

    public static final Attribute<Resident, String> NAME = new SimpleAttribute<Resident, String>("name") {
        public String getValue(Resident r) { return r.name; }
    };

    public static final Attribute<Resident, String> GENDER = new SimpleAttribute<Resident, String>("gender") {
        public String getValue(Resident r) { return r.gender; }
    };

    public static final Attribute<Resident, String> MARITAL_STATUS = new SimpleAttribute<Resident, String>("marital_status") {
        public String getValue(Resident r) { return r.maritalStatus; }
    };
}
