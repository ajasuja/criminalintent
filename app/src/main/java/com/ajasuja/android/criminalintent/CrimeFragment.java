package com.ajasuja.android.criminalintent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

/**
 * Created by ajasuja on 8/4/15.
 */
public class CrimeFragment extends Fragment {

    private Crime crime;
    private EditText titleField;
    private Button dateButton;
    private CheckBox solvedCheckBox;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.crime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crime, container, false);
        this.titleField = (EditText) view.findViewById(R.id.crime_title);
        this.titleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence,
                                          int start, int count, int after) {
                //TODO implementation
            }

            @Override
            public void onTextChanged(CharSequence charSequence,
                                      int start, int before, int count) {
                Log.d(getFragmentTag(), "........ onTextChanged() called");
                crime.setCrimeTitle(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //TODO implementation
            }
        });

        this.dateButton = (Button) view.findViewById(R.id.crime_date);
        this.dateButton.setText(this.crime.getDate().toString());
        this.dateButton.setEnabled(false);

        this.solvedCheckBox = (CheckBox) view.findViewById(R.id.crime_solved);
        this.solvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                crime.setIsSolved(true);
            }
        });
        return view;
    }

    private String getFragmentTag() {
        return this.getClass().getSimpleName();
    }
}
