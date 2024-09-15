package ws;

import java.util.Date;

public class Account {
    private int code;
    private double amount;
    private Date creationDate;

    public Account() {
    }

    public Account(int code, double amount, Date creationDate) {
        this.code = code;
        this.amount = amount;
        this.creationDate = creationDate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
