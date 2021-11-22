package by.bsuir.kostukevich.main;

import by.bsuir.kostukevich.entity.Appliance;

import java.util.List;
import java.util.Map;

public class PrintApplianceInfo {

    public static void print(List<? extends Appliance> appliances) {
        for (int i = 0; i < appliances.size(); i++) {
            print(appliances.get(i));
        }
    }

    public static void print(Appliance appliance) {
        Map<String, Object> properties = appliance.getProperties();
        System.out.println(appliance.getClass().getSimpleName() + ":");
        for (Map.Entry<String, Object> next : properties.entrySet()) {
            System.out.println(next.getKey() + " -> " + next.getValue());
        }
        System.out.println();
    }
}
