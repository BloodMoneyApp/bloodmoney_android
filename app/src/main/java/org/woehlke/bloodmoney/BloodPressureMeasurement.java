package org.woehlke.bloodmoney;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class BloodPressureMeasurement implements Serializable {

    private Long id;
    private LocalDateTime dateTime;
    private LocalDate date;
    private LocalTime time;
    private Integer systolicTopNumber;
    private Integer diastolicBottomNumber;
    private Integer pulse;
    private String situation;

    public String details(){
        StringBuffer b = new StringBuffer();
        b.append(date.toString());
        b.append(systolicTopNumber);
        b.append(diastolicBottomNumber);
        b.append(pulse);
        return b.toString();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static BloodPressureMeasurement getInstance(long id){
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        BloodPressureMeasurement o = new BloodPressureMeasurement();
        o.setId(id);
        o.setDate(today);
        o.setTime(now);
        o.setSystolicTopNumber(120);
        o.setDiastolicBottomNumber(80);
        o.setPulse(68);
        o.setSituation("New Measurement");
        return o;
    }
}
