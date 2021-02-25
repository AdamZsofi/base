package hu.bme.mit.train.tachometer;

import com.google.common.collect.Table;
import com.google.common.collect.TreeBasedTable;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;

public class Tachometer {
    private Long i = 0L;
    private final Table<Long, Integer, Integer> logTable
            = TreeBasedTable.create();

    void add(Integer joystickPosition, Integer referenceSpeed) {
        LocalTime currentTime = LocalTime.now();
        logTable.put(i, 0, currentTime.toSecondOfDay());
        logTable.put(i, 1, joystickPosition);
        logTable.put(i, 2, referenceSpeed);
        i++;
    }

    Boolean isEmpty() {
        if(i > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
