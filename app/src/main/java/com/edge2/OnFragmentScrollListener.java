package com.edge2;

public interface OnFragmentScrollListener {
    void onListScrolled(int dy, int toolbarDy);

    int getBottomNavTop();

    int getBottomNavBottom();
}