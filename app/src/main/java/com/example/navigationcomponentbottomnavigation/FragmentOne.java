package com.example.navigationcomponentbottomnavigation;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {

    private View rootView;
    private Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_one, container, false);
        toolbar = rootView.findViewById(R.id.toolbar);

        NavController navController = Navigation.findNavController(getActivity(),
                R.id.fragmentContainerView);
        AppBarConfiguration appBarConfiguration =
                ToolbarManager.getInstance().setTopLevelDestinationsBottomNavigation();
        ToolbarManager.getInstance().setupToolbar(getActivity(), navController,
                appBarConfiguration, toolbar, false);

        return rootView;
    }
}