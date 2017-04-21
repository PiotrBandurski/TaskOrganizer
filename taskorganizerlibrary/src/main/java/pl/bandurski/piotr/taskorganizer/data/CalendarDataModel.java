package pl.bandurski.piotr.taskorganizer.data;

import android.support.v4.util.LongSparseArray;

/**
 * Created by piotr on 21/04/2017.
 */

public class CalendarDataModel {

    private LongSparseArray<PullingRecyclerViewAdapter> mData = new LongSparseArray<>();

    public LongSparseArray getData() {
        return mData;
    }

    public void setData(LongSparseArray data) {
        this.mData = data;
    }

    public void append(long daysBetweenEpoch, PullingRecyclerViewAdapter pullingRecyclerViewAdapter){
        mData.append(daysBetweenEpoch, pullingRecyclerViewAdapter);
    }

    public void remove(long daysBetweenEpoch){
        mData.remove(daysBetweenEpoch);
    }

    public int getItemCount(){
        return mData.size();
    }

}
