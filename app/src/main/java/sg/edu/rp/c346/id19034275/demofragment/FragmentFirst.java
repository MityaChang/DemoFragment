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
// * Use the {@link FragmentFirst#newInstance} factory method to
// * create an instance of this fragment.
// */
public class FragmentFirst extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
    Button btnAddText;
    TextView tvFrag1;

    // TODO: Rename and change types of parameter


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        tvFrag1 = view.findViewById(R.id.tvFrag1);
        btnAddText = view.findViewById(R.id.btnAddTextFrag1);

        btnAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = tvFrag1.getText().toString() + "\n" + "new data";
                tvFrag1.setText(data);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}