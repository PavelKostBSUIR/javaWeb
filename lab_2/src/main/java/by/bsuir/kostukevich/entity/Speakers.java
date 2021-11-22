package by.bsuir.kostukevich.entity;

import by.bsuir.kostukevich.entity.criteria.SearchCriteria;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Speakers extends Appliance {
    public Speakers() {

    }

    public Speakers(int price, int number_of_speakers, int cord_length, String frequency_range, int power_consumption) {
        super(price);
        properties.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), number_of_speakers);
        properties.put(SearchCriteria.Speakers.CORD_LENGTH.toString(), cord_length);
        properties.put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(), frequency_range);
        properties.put(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), power_consumption);
    }
}
