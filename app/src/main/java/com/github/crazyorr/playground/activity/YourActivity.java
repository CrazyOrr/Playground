package com.github.crazyorr.playground.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.github.crazyorr.playground.R;
import com.github.crazyorr.playground.databinding.ActivityYourBinding;
import com.github.crazyorr.playground.fragment.YourFragment;
import com.github.crazyorr.playground.model.User;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasDispatchingSupportFragmentInjector;

public class YourActivity extends AppCompatActivity implements HasDispatchingSupportFragmentInjector {

    private static final String TAG = YourActivity.class.getSimpleName();

    @Inject
    User user;

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.activity_your);
//        TextView tv = (TextView) findViewById(R.id.tv);
//        tv.setText(user.toString());

        final ActivityYourBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_your);
        binding.setUser(user);
        binding.btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, user.toString());
                Toast.makeText(v.getContext(), user.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new YourFragment(), "YourFragment")
                .commit();
    }

    @Override
    public DispatchingAndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }
}
