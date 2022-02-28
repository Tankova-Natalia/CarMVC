package model;


import jakarta.validation.constraints.PastOrPresent;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Component
public class Car {

    @NotNull(message = "Kind should not be empty")
    @Size(min=3,max=20, message = "Kind should be between 3 to 20 characters")
    private String kind;
    @NotNull(message = "Kind should not be empty")
    @Size(min=2,max=20, message = "Kind should be between 2 to 20 characters")
    private String model;
    @Min(value = 1960, message = "Year of manufacture should be greater then 1960")
    @Max(value = 2021, message = "Year of manufacture should be less then 2021")
    @NotNull(message = "Year of manufacture should not be empty")
    private int yearOfManufacture;
    //private CarColor color;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent(message = "Date of registration should be past or present")
    @NotNull(message = "Date of registration should not be empty")
    private LocalDate dateOfRegistration;
    @Min(value = 0,message = "General mileage should be positive or zero")
    @NotNull(message = "General mileage should not be empty")
    private int generalMileage;

    public Car() {
    }


    public int getGeneralMileage() {
        return generalMileage;
    }

    public void setGeneralMileage(int generalMileage) {
        this.generalMileage = generalMileage;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

   /*public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }*/

     public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }


    @Override
    public String toString() {
        return "Car{" +
                "kind='" + kind + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                //", color=" + color +
                ", dateOfRegistration=" + dateOfRegistration +
                ", generalMileage=" + generalMileage +
                '}';
    }
}
