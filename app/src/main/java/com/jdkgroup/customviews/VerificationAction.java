package com.jdkgroup.customviews;

import android.support.annotation.ColorRes;

interface VerificationAction {
    void setFigures(int figures);
    void setVerCodeMargin(int margin);
    void setBottomSelectedColor(@ColorRes int bottomSelectedColor);
    void setBottomNormalColor(@ColorRes int bottomNormalColor);
    void setSelectedBackgroundColor(@ColorRes int selectedBackground);
    void setBottomLineHeight(int bottomLineHeight);
    void setOnVerificationCodeChangedListener(OnVerificationCodeChangedListener listener);
    interface OnVerificationCodeChangedListener {
        void onVerCodeChanged(CharSequence s, int start, int before, int count);
        void onInputCompleted(CharSequence s);
    }
}
