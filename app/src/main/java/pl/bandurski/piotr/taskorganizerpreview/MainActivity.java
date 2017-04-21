package pl.bandurski.piotr.taskorganizerpreview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pl.bandurski.piotr.taskorganizer.TaskOrganizerView;
import pl.bandurski.piotr.taskorganizerpreview.data.SampleDataProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupTaskOrganizer();
    }

    private void setupTaskOrganizer(){
        TaskOrganizerView taskOrganizerView = (TaskOrganizerView) findViewById(R.id.task_organizer_view);
        taskOrganizerView.setCallendarData(SampleDataProvider.getSampleCalendarDataModel());
    }
}
