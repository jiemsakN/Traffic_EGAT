package appewtc.masterung.traffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by masterUNG on 8/25/15 AD.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private int[] iconInts;
    private String[] titleStrings;

    public MyAdapter(Context objContext, int[] iconInts, String[] titleStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    }

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.traffic_listview, viewGroup, false);

        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvIcon);
        iconImageView.setImageResource(iconInts[i]);

        //Show Title
        TextView titleTextView = (TextView) objView1.findViewById(R.id.txtTitle);
        titleTextView.setText(titleStrings[i]);

        return objView1;

    } // getView

}   // Main Class
