package com.appsbyolympia.olympiabardis.todolist.Adapter;

import android.view.View;

/**
 * Created by olympiabardis on 11/15/17.
 */

public interface ItemClickListener {
    void onClick (View view, int position, boolean isLongClick);
}
