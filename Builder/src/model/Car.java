package model;

public class Car {

    private final String manufacturer;
    private final String model;
    private final int year;
    private final String country;
    private final double capacity;
    private final String color;
    private final String gearType;

    public Car(final Builder builder) {
        this.manufacturer = builder.manufacturer;
        this.model = builder.model;
        this.year = builder.year;
        this.country = builder.country;
        this.capacity = builder.capacity;
        this.color = builder.color;
        this.gearType = builder.gearType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getColor() {
        return color;
    }

    public String getGearType() {
        return gearType;
    }

    public static class Builder {

        private String manufacturer;
        private String model;
        private int year;
        private String country;
        private double capacity;
        private String color;
        private String gearType;

        public Builder manufacturer(final String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder model(final String model) {
            this.model = model;
            return this;
        }

        public Builder year(final int year) {
            this.year = year;
            return this;
        }

        public Builder country(final String country) {
            this.country = country;
            return this;
        }

        public Builder capacity(final double capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder color(final String color) {
            this.color = color;
            return this;
        }

        public Builder gearType(final String gearType) {
            this.gearType = gearType;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "model.Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", capacity=" + capacity +
                ", color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                '}';
    }
}
