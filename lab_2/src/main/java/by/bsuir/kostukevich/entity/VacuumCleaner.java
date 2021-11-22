package by.bsuir.kostukevich.entity;

import by.bsuir.kostukevich.entity.criteria.SearchCriteria;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VacuumCleaner extends Appliance {
    public VacuumCleaner() {
    }

    public VacuumCleaner(int price, int cleaning_width, String bag_type, String filter_type, String motor_speed_regulation, int power_consumption, String wand_type) {
        super(price);
        properties.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(), cleaning_width);
        properties.put(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(), bag_type);
        properties.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(), filter_type);
        properties.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), motor_speed_regulation);
        properties.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(), power_consumption);
        properties.put(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(), wand_type);

    }
}
