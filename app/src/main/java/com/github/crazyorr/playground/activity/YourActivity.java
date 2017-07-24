package com.github.crazyorr.playground.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.github.crazyorr.playground.R;
import com.github.crazyorr.playground.databinding.ActivityYourBinding;
import com.github.crazyorr.playground.fragment.YourFragment;
import com.github.crazyorr.playground.model.User;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class YourActivity extends BaseActivity {

    private static final String TAG = YourActivity.class.getSimpleName();

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        final ActivityYourBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_your);
        binding.setUser(user);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new YourFragment(), "YourFragment")
                .commit();
    }
}
