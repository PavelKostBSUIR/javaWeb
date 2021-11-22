package by.bsuir.kostukevich.entity;

import by.bsuir.kostukevich.entity.criteria.SearchCriteria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
public class Laptop extends Appliance {
    public Laptop() {
    }

    public Laptop(int price, int battery_capacity, String cpu, String os, int display_inches, int memory_rom, int system_memory) {
        super(price);
        properties.put(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), battery_capacity);
        properties.put(SearchCriteria.Laptop.CPU.toString(), cpu);
        properties.put(SearchCriteria.Laptop.OS.toString(), os);
        properties.put(SearchCriteria.Laptop.DISPLAY_INCHES.toString(), display_inches);
        properties.put(SearchCriteria.Laptop.MEMORY_ROM.toString(), memory_rom);
        properties.put(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(), system_memory);
    }
}
