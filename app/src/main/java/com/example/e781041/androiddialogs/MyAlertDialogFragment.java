package com.example.e781041.androiddialogs;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

/**
 * Created by e781041 on 10/10/15.
 */
public class MyAlertDialogFragment extends DialogFragment {

    public MyAlertDialogFragment(){

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        Dialog dialog = builder.setTitle("New Title")
                .setMessage("Hello there")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //((FragmentAlertDialog)getActivity()).doNegativeClick();
                Toast.makeText(getActivity(),"negative",Toast.LENGTH_LONG).show();
            }
        }).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       //((FragmentAlertDialog) getActivity()).doPositiveClick();
                        Toast.makeText(getActivity(),"Positive",Toast.LENGTH_LONG).show();
                    }
                }).create();
        return dialog;
    }

}
