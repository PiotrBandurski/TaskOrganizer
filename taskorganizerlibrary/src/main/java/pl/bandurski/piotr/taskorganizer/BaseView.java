package pl.bandurski.piotr.taskorganizer;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by piotr on 30.08.2016.
 */
abstract class BaseView extends LinearLayout {

    protected AttributeSet mAttributeSet;

    public BaseView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mAttributeSet = attrs;
        attachView(getLayoutResource());
    }

    public BaseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mAttributeSet = attrs;
        attachView(getLayoutResource());
    }

    protected void attachView(int resId) {
        ViewGroup mContent = new RelativeLayout(getContext(), mAttributeSet);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(resId, mContent);
        addView(mContent);
        bindViews();
    }

    abstract protected void bindViews();

    abstract @LayoutRes int getLayoutResource();

    @Override
    public boolean onTouchEvent(final MotionEvent event) {
        return super.onTouchEvent(event);
    }

}
