import java.util.*;

public class Laptop {
    private String model;
    private int ram;
    private int hddMemory;
    private String os;
    private String color;

    /**
     *
     * model-Модель ноутбука.
     * ram-Объем оперативной памяти в ГБ.
     * hddMemory-Объем жесткого диска в ГБ.
     * os-Операционная система.
     * color-Цвет ноутбука.
     */

    public Laptop(String model, int ram, int hddMemory, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.hddMemory = hddMemory;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getHddMemory() {
        return hddMemory;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", ram=" + ram +
                ", hddMemory=" + hddMemory +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}