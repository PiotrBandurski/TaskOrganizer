package pl.bandurski.piotr.taskorganizerpreview.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pl.bandurski.piotr.taskorganizer.data.CalendarDataModel;
import pl.bandurski.piotr.taskorganizerpreview.adapter.MyPullingRecyclerViewAdapter;

/**
 * Created by piotr on 21/04/2017.
 */

public class SampleDataProvider {

    public static CalendarDataModel getSampleCalendarDataModel(){
        CalendarDataModel calendarDataModel = new CalendarDataModel();
        long currentMilli = System.currentTimeMillis();
        long daysBetweenEpoch = currentMilli / 86400000;
        calendarDataModel.append(daysBetweenEpoch,getSamplePullingAdapter());
        calendarDataModel.append(daysBetweenEpoch,getSamplePullingAdapter());
        calendarDataModel.append(daysBetweenEpoch,getSamplePullingAdapter());
        calendarDataModel.append(daysBetweenEpoch,getSamplePullingAdapter());
        calendarDataModel.append(daysBetweenEpoch,getSamplePullingAdapter());
        calendarDataModel.append(daysBetweenEpoch,getSamplePullingAdapter());
        calendarDataModel.append(daysBetweenEpoch,getSamplePullingAdapter());
        return calendarDataModel;
    }

    public static MyPullingRecyclerViewAdapter getSamplePullingAdapter(){
        return new MyPullingRecyclerViewAdapter(getSampleDataItems());
    }

    public static List<SampleDataItem> getSampleDataItems(){
        List<SampleDataItem> listToReturn = new ArrayList<>();
        int count = new Random(3).nextInt()+2;
        for (int i = 0; i < count; i++){
            listToReturn.add(new SampleDataItem());
        }
        return listToReturn;
    }
}
