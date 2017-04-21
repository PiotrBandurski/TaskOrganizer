package pl.bandurski.piotr.taskorganizer;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import pl.bandurski.piotr.taskorganizer.data.CalendarDataModel;
import pl.bandurski.piotr.taskorganizer.data.DayRecyclerViewAdapter;

/**
 * Created by piotr on 21/04/2017.
 */

public class TaskOrganizerView extends BaseView {

    private RecyclerView mCallendarRecyclerView;
    private DayRecyclerViewAdapter adapter;
    private GridLayoutManager manager = new GridLayoutManager(getContext(), 4);

    public TaskOrganizerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TaskOrganizerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setCallendarData(CalendarDataModel callendarData){
        adapter = new DayRecyclerViewAdapter(callendarData, getContext());
        mCallendarRecyclerView.setLayoutManager(manager);
        mCallendarRecyclerView.setAdapter(adapter);
    }

    @Override
    protected void bindViews() {
        mCallendarRecyclerView = (RecyclerView) findViewById(R.id.callendar_RecyclerView);
    }

    @Override
    int getLayoutResource() {
        return R.layout.task_organizer_view_layout;
    }

}
