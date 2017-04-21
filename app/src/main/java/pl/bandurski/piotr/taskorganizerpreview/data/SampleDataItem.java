package pl.bandurski.piotr.taskorganizerpreview.data;

import java.util.Random;

/**
 * Created by piotr on 21/04/2017.
 */

public class SampleDataItem {
    private String sampleLabel = "Label";

    public SampleDataItem() {
        sampleLabel += new Random().nextInt(16);
    }

    public String getSampleLabel() {
        return sampleLabel;
    }
}
