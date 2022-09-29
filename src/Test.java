public class Test {

    private int id;
    private String title;
    private Subject subject;
    private Student student;

    public Test(int id, String title, int roll, String studName, int subId, String subName) {
        this.id = id;
        this.title = title;
        subject = new Subject(subId, subName);
        student = new Student(roll, studName);
    }

    public void display() {
        System.out.println("id = " + id + " title = " + title);
        System.out.println("subId = " + subject.getSubId() + " sub Name = " + subject.getSubName());
        System.out.println("stud Roll = " + student.getRoll() + " stud Name = " + student.getName());
        System.out.println("-------------------------------------------------------");
    }

    private class Student {
        private int roll;
        private String name;

        public Student(int roll, String name) {
            this.roll = roll;
            this.name = name;
        }

        public int getRoll() {
            return roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    private class Subject {
        private int subId;
        private String subName;

        public Subject(int subId, String subName) {
            this.subId = subId;
            this.subName = subName;
        }

        public int getSubId() {
            return subId;
        }

        public void setSubId(int subId) {
            this.subId = subId;
        }

        public String getSubName() {
            return subName;
        }

        public void setSubName(String subName) {
            this.subName = subName;
        }
    }
}

