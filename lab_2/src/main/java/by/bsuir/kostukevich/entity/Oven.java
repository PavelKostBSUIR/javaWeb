package by.bsuir.kostukevich.entity;

import by.bsuir.kostukevich.entity.criteria.SearchCriteria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
public class Oven extends Appliance {
    public Oven() {
    }

    public Oven(int price, int capacity, int depth, int height, int power_consumption, int weight, int width) {
        super(price);
        properties.put(SearchCriteria.Oven.CAPACITY.toString(), capacity);
        properties.put(SearchCriteria.Oven.DEPTH.toString(), depth);
        properties.put(SearchCriteria.Oven.HEIGHT.toString(), height);
        properties.put(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), power_consumption);
        properties.put(SearchCriteria.Oven.WEIGHT.toString(), weight);
        properties.put(SearchCriteria.Oven.WIDTH.toString(), width);
    }
}