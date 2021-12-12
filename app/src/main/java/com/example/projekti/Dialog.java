package com.example.projekti;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

/**
 * @author aleksialanko
 */

public class Dialog extends AppCompatDialogFragment {
    private EditText editPituus;
    private EditText editPaino;
    private EditText editIka;
    private EditText editNimi;
    private DialogListener listener;

    @Override
    public android.app.Dialog onCreateDialog( Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dialog, null);

        builder.setView(view)
                .setTitle("Täytä tiedot")
                .setNegativeButton("peru", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String pituus = editPituus.getText().toString();
                        String paino = editPaino.getText().toString();
                        String ika = editIka.getText().toString();
                        String nimi = editNimi.getText().toString();
                        listener.getInfo(pituus, paino, ika, nimi);
                    }
                });

        editPituus = view.findViewById(R.id.editPituus);
        editPaino = view.findViewById(R.id.editPaino);
        editIka = view.findViewById(R.id.editIka);
        editNimi = view.findViewById(R.id.editNimi);
        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (DialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "must implement DialogListener");
        }
    }

    public interface DialogListener{
        void getInfo(String pituus, String paino, String ika, String nimi);
    }
}
