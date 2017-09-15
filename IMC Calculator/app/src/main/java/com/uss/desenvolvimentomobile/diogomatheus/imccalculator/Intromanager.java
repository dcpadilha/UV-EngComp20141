package com.uss.desenvolvimentomobile.diogomatheus.imccalculator;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by diogo on 04/09/2017.
 */

public class Intromanager {

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    Context context;

    public Intromanager(Context context)
    {
        this.context=context;
        pref=context.getSharedPreferences("first", 0);
        editor = pref.edit();
    }

    public void setFirst(Boolean isFirst)
    {
        editor.putBoolean("check", isFirst);
        editor.commit();
    }

    public boolean Check()
    {
        return pref.getBoolean("check", true);
    }

}
