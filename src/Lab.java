public class Lab {
    private String labId;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;

    public Lab(String labId, LabStatus status, Employee labAttendant) {
        this.labId = labId;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;
    }

    public Lab() {
        // Default constructor
        this.labId = "";
        this.computers =null;
        this.status = null;
        this.labAttendant = null;
    }

    public String getLabId() {
        return labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public LabStatus getStatus() {
        return status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }
    public class lab {

        public void setLabAttendantDetails(String name, String position) {
            if (labAttendant == null) {
                labAttendant = new Employee();
            } else {
                labAttendant.setName(name);
            }
        }

        public String getLabAttendantName() {
            if (labAttendant != null) {
                return labAttendant.getName();
            } else {
                return "No Lab Attendant assigned.";
            }
        }

        public String getLabAttendantPosition() {
            if (labAttendant != null) {
            } else {
                return "No Lab Attendant assigned.";
            }
            return null;
        }
    }

    public void addComputer(Computer computer) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == null) {
                computers[i] = computer;
                break;
            }
        }
    }

    public void removeComputer(Computer computer) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == computer) {
                computers[i] = null;
                break;
            }

        }

        }
    }
