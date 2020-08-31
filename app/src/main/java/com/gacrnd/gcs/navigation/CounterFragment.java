package com.gacrnd.gcs.navigation;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gacrnd.gcs.navigation.databinding.CounterFragmentBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class CounterFragment extends Fragment {

    private MyViewModel mViewModel;
    private CounterFragmentBinding binding;

    public CounterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(getActivity()).get(MyViewModel.class);
        binding = DataBindingUtil.inflate(inflater,R.layout.counter_fragment, container,false);
        binding.setViewmodel(mViewModel);
        binding.setLifecycleOwner(getActivity());
        return binding.getRoot();
    }

}
