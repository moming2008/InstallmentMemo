package ink.moming.installmentmemo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ink.moming.installmentmemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MonthlyBillFragment extends Fragment {


    public MonthlyBillFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_monthly_bill, container, false);
    }

}