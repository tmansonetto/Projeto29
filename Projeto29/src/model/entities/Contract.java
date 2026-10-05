package model.entities;

import java.time.LocalDateTime;

public class Contract {
    public int contractNumber;
    public LocalDateTime contractDate;
    public double totalValue;


    public Contract() {
    }

    public Contract(int contractNumber, LocalDateTime contractDate, double totalValue) {
        this.contractNumber = contractNumber;
        this.contractDate = contractDate;
        this.totalValue = totalValue;
    }

    public int getContractNumber() {
        return contractNumber;
    }
    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }
    public LocalDateTime getContractDate() {
        return contractDate;
    }
    public void setContractDate(LocalDateTime contractDate) {
        this.contractDate = contractDate;
    }
    public double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
