import java.util.List;

public class Bank {

        private String name;
        private List<Account> Accounts;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Account> getAccount() {
            return Accounts;
        }

        public void setAccounts(List<Account> accounts) {
            this.Accounts = accounts;
        }

}
