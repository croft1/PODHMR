package devicroft.podhmr.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by m on 04-Mar-17.
 */

public class PatientExpandListAdapter extends BaseExpandableListAdapter {

    Context context;
    ArrayList patients;

    public PatientExpandListAdapter(Context context, ArrayList patients){
        this.context = context;
        this.patients = patients;
    }

    @Override
    public int getGroupCount() {
        return patients.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return 1;
    }

    @Override
    public Object getGroup(int i) {
        return patients.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return patients.get(i);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
