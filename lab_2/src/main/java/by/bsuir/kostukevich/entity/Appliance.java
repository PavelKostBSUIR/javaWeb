package by.bsuir.kostukevich.entity;

import by.bsuir.kostukevich.entity.criteria.SearchCriteria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({Laptop.class, Oven.class, Refrigerator.class, Speakers.class, TabletPC.class, VacuumCleaner.class})
public abstract class Appliance {
    protected Map<String, Object> properties = new HashMap<>();

    public Appliance() {
    }


    public Appliance(int price) {
        properties.put(SearchCriteria.Appliance.PRICE.name(), price);
    }

    public Object getProperty(String key) {
        return properties.get(key);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }
}
