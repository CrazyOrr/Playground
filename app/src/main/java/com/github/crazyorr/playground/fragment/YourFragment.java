package com.github.crazyorr.playground.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.crazyorr.playground.databinding.FragmentYourBinding;
import com.github.crazyorr.playground.model.Location;
import com.github.crazyorr.playground.model.User;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class YourFragment extends Fragment {
    @Inject
    User user;

    @Inject
    Location location;

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_your, container, false);
//        TextView tv = (TextView) view.findViewById(R.id.tv);
//        tv.setText(user + " @ " + location);
//        return view;

        FragmentYourBinding binding = FragmentYourBinding.inflate(inflater, container, false);
        binding.setUser(user);
        return binding.getRoot();
    }
}
