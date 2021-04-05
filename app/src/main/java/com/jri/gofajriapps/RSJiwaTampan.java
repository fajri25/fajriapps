package com.jri.gofajriapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSJiwaTampan extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listAction = new String[] {"Call Center","SMS Center",
                "Driving Direction","Website","Info Google","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAction));
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
            if (pilihan.equals("Call Center")){
               String nomortel = "tel:0725-5324";
            a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

        } else if (pilihan.equals("SMS Center")){
            String smsText ="Al Fajri/L";
            a = new Intent(Intent.ACTION_VIEW, Uri.parse(smsText));
            a.setData(Uri.parse("sms:082386499669"));
            a.putExtra("smsbody",smsText);

        } else if (pilihan.equals("Driving Direction")) {
                String lokasirs = "google.navigation:q=0.46486142309336953, 101.38228389720986";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));

            } else if (pilihan.equals("Website")) {
                String Website = "http://rsjiwatampan.riau.go.id/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(Website));

            } else if (pilihan.equals("Info Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Rumah Sakit Jiwa Tampan");

            }
        startActivity(a);

    } catch (Exception e)
    {
        e.printStackTrace();
    }
}
}

