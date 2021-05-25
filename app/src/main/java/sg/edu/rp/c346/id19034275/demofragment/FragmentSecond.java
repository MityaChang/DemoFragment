package sg.edu.rp.c346.id19034275.demofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link FragmentSecond#newInstance} factory method to
// * create an instance of this fragment.
// */
public class FragmentSecond extends Fragment {

    Button btnAddText;
    TextView tvFrag2;

    // TODO: Rename and change types of parameter


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);
        tvFrag2 = view.findViewById(R.id.tvFrag2);
        btnAddText = view.findViewById(R.id.btnAddTextFrag2);

        btnAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = tvFrag2.getText().toString() + "\n" + "new data";
                tvFrag2.setText(data);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}