package com.gacrnd.gcs.navigation;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class HomeFragment extends Fragment {

    private Button btn;
    private EditText et;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = getView();
        if (view == null) {
            return;
        }
        btn = view.findViewById(R.id.button);
        et = view.findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = et.getText().toString();
                if (!TextUtils.isEmpty(s)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("name", s);
                    NavController controller = Navigation.findNavController(view);
                    controller.navigate(R.id.action_homeFragment_to_detailedFragment, bundle);
                }
            }
        });
    }
}
