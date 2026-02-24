package com.example.project.ui.overview;

import androidx.fragment.app.Fragment;

import com.example.project.R;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class OverviewFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.overview_fragment, container, false);
    }
}
