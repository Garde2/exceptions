public class UserData {

        private String uName;
        private String uSurname;
        private String uFatherName;
        private long phoneNumber;

        public UserData(String uName, String uSurname, String uFatherName, long phoneNumber) {

            this.uName = uName;
            this.uSurname = uSurname;
            this.uFatherName = uFatherName;
            this.phoneNumber = phoneNumber;
        }

        public String getuName() {
            return uName;
        }

        public String getuSurname() {
            return uSurname;
        }

        public String getuFatherName() {
            return uFatherName;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

    }