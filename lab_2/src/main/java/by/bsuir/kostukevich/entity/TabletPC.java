package by.bsuir.kostukevich.entity;

import by.bsuir.kostukevich.entity.criteria.SearchCriteria;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TabletPC extends Appliance {
    public TabletPC() {

    }

    public TabletPC(int price, int battery_capacity, int memory_rom, String color, int display_inches, int flash_memory) {
        super(price);
        properties.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString(), battery_capacity);
        properties.put(SearchCriteria.TabletPC.MEMORY_ROM.toString(), memory_rom);
        properties.put(SearchCriteria.TabletPC.COLOR.toString(), color);
        properties.put(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), display_inches);
        properties.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(), flash_memory);
    }
}
