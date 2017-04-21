package pl.bandurski.piotr.taskorganizer.data;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.bandurski.piotr.taskorganizer.R;

/**
 * Created by piotr on 21/04/2017.
 */

public class DayRecyclerViewAdapter extends RecyclerView.Adapter<DayRecyclerViewAdapter.DayViewHolder> {

    CalendarDataModel mCalendarDataModel;
    Context mContext;

    public DayRecyclerViewAdapter(CalendarDataModel mCalendarDataModel, Context mContext) {
        this.mCalendarDataModel = mCalendarDataModel;
        this.mContext = mContext;
    }

    @Override
    public DayViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.day_item_layout, parent, false);
        return new DayViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DayViewHolder holder, int position) {
        holder.mTasksRecyclerView.setAdapter();
    }

    @Override
    public int getItemCount() {
        return mCalendarDataModel.getItemCount();
    }

    class DayViewHolder extends RecyclerView.ViewHolder{
        private RecyclerView mTasksRecyclerView;

        public DayViewHolder(View itemView) {
            super(itemView);
            setupRecyclerView(itemView);
        }

        private void setupRecyclerView(View itemView){
            mTasksRecyclerView = (RecyclerView) itemView.findViewById(R.id.day_recyclerView);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
            mTasksRecyclerView.setLayoutManager(linearLayoutManager);
        }

    }
}
