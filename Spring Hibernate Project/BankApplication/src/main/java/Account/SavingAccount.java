package Account;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SavingAccount")
public class SavingAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="AccountNo")
    private int accno;

    @Column(name="CustomerName")
    private String custname;

    @ElementCollection
    @CollectionTable(name = "Deposits", joinColumns = @JoinColumn(name = "account_id"))
    @Column(name = "deposit")
    private ArrayList<String> deposits;

    public SavingAccount() {
    }

    public SavingAccount(int accno, String custname, ArrayList<String> deposits) {
        this.accno = accno;
        this.custname = custname;
        this.deposits = deposits;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public ArrayList<String> getDeposits() {
        return deposits;
    }

    public void setDeposits(ArrayList<String> deposits) {
        this.deposits = deposits;
    }
}
