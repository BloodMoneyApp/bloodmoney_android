package org.woehlke.bloodmoney;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BloodPressureMeasurementDao {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<BloodPressureMeasurement> ITEMS = new ArrayList<BloodPressureMeasurement>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<Long, BloodPressureMeasurement> ITEM_MAP = new HashMap<Long, BloodPressureMeasurement>();


    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(BloodPressureMeasurement item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }

    private static BloodPressureMeasurement createDummyItem(int position) {
        return  BloodPressureMeasurement.getInstance(position);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
}
