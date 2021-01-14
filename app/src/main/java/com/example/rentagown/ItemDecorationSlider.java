package com.example.rentagown;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemDecorationSlider extends RecyclerView.ItemDecoration {

    private final int edgePadding;

    public ItemDecorationSlider(int edgePadding) {
        this.edgePadding = edgePadding;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        int itemCount = state.getItemCount();

        final int itemPosition = parent.getChildAdapterPosition(view);

        // no position, leave it alone
        if (itemPosition == RecyclerView.NO_POSITION) {
            return;
        }

        // first item
        if (itemPosition == 0) {
            outRect.set(edgePadding, view.getPaddingTop(), view.getPaddingStart(), view.getPaddingBottom());
        }
        // last item
        else if (itemCount > 0 && itemPosition == itemCount - 1) {
            outRect.set(view.getPaddingLeft(), view.getPaddingTop(), edgePadding, view.getPaddingBottom());
        }
        // every other item
        else {
            outRect.set(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }
}
