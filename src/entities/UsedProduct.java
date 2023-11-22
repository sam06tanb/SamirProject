package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product {

    private LocalDate Date;

    public UsedProduct(String name, Double price, LocalDate date) {
        super(name, price);
        this.Date = date;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }


    @Override
    public String priceTag() {
        return getName()
                + "(used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + Date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
    }
}
