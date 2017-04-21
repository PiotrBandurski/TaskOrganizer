package pl.bandurski.piotr.taskorganizerpreview.adapter;

import android.view.ViewGroup;

import java.util.List;

import pl.bandurski.piotr.taskorganizer.data.PullingRecyclerViewAdapter;
import pl.bandurski.piotr.taskorganizer.data.PullingViewHolder;
import pl.bandurski.piotr.taskorganizerpreview.data.SampleDataItem;

/**
 * Created by piotr on 21/04/2017.
 */

public class MyPullingRecyclerViewAdapter extends PullingRecyclerViewAdapter {

    List<SampleDataItem> sampleDataItems;

    public MyPullingRecyclerViewAdapter(List<SampleDataItem> sampleDataItems) {
        this.sampleDataItems = sampleDataItems;
    }

    @Override
    public PullingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(PullingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
