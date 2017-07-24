package com.github.crazyorr.playground.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.crazyorr.playground.databinding.FragmentYourBinding;
import com.github.crazyorr.playground.model.Location;
import com.github.crazyorr.playground.model.User;

import javax.inject.Inject;

public class YourFragment extends BaseFragment {
    @Inject
    User user;

    @Inject
    Location location;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentYourBinding binding = FragmentYourBinding.inflate(inflater, container, false);
        binding.setUser(user);
        binding.setLocation(location);
        return binding.getRoot();
    }
}
