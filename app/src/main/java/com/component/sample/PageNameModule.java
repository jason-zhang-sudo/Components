package com.component.sample;

import android.content.Context;
import android.os.Bundle;

import com.component.activity.BaseCWAbsModule;
import com.component.activity.CWModuleContext;

public class PageNameModule extends BaseCWAbsModule {

    private Context context;

    @Override
    public boolean init(CWModuleContext cwModuleContext, Bundle extend) {
        context = cwModuleContext.getContext();

        return false;
    }

    @Override
    public void onSaveInstance(Bundle outState) {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onOrientationChanges(boolean isLandscape) {

    }

    @Override
    public void onDestory() {

    }
}