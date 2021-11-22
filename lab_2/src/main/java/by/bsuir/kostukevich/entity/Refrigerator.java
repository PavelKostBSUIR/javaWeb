package by.bsuir.kostukevich.entity;

import by.bsuir.kostukevich.entity.criteria.SearchCriteria;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Refrigerator extends Appliance {
    public Refrigerator() {

    }

    public Refrigerator(int price, int height, int power_consumption, int weight, int width, int freezer_capacity, int overall_capacity) {
        super(price);
        properties.put(SearchCriteria.Refrigerator.HEIGHT.toString(), height);
        properties.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(), power_consumption);
        properties.put(SearchCriteria.Refrigerator.WEIGHT.toString(), weight);
        properties.put(SearchCriteria.Refrigerator.WIDTH.toString(), width);
        properties.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(), freezer_capacity);
        properties.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(), overall_capacity);
    }
}
