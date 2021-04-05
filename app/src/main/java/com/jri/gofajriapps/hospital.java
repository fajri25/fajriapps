package com.jri.gofajriapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hospital extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listhospital = new String[] {"Rumah sakit jiwa Tampan","Rumah sakit Awal Bross",
                "Rumah sakit Eka Hospital","Rumah sakit Syafira"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listhospital));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah sakit jiwa Tampan")){
                a = new Intent(this,RSJiwaTampan.class);
                startActivity(a);

            } else if (pilihan.equals("Rumah sakit Awal Bross")){

            }
            startActivity(a);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
