package com.mcculloch.homerewards;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.view.Window;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.Plus;

/**
 * Created by wooan_000 on 7/25/2015.
 */
public class BaseActivity extends AppCompatActivity {

//    public static final int RC_SIGN_IN = 0;
    public boolean mIntentInProgress;
//    public GoogleApiClient mGoogleApiClient;

//    public void initGooglePlus() {
//        mGoogleApiClient = new GoogleApiClient.Builder(this)
//                .addConnectionCallbacks(this)
//                .addOnConnectionFailedListener(this)
//                .addApi(Plus.API)
////                .addScope(new Scope(Scopes.PROFILE))
//                .addScope(Plus.SCOPE_PLUS_LOGIN)
////                .addScope(Plus.SCOPE_PLUS_PROFILE)
//                .build();
//    }

    public void initAdMob() {
//        AdView mAdView = (AdView) findViewById(R.id.adView);
//
//        if (BuildConfig.FLAVOR == Constants.exFlavor) {
//            mAdView.setVisibility(View.GONE);
//            return;
//        }
//        AdRequest adRequest = new AdRequest.Builder()
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
////                .addTestDevice(getResources().getText(R.string.deviceIdMike).toString())
//                .build();
////        mAdView.setAdListener(new ToastAdListener(this));
//        mAdView.loadAd(adRequest);
    }

    public void initGoogleAnalytics(String path) {
        Tracker t = ((MyApplication) getApplication()).getTracker(
                MyApplication.TrackerName.APP_TRACKER);
        t.setScreenName(path);
        t.send(new HitBuilders.AppViewBuilder().build());
    }


//    Transform trans = new Transform() {
//        boolean isOval = false;
//        int cornerRadius = 100;
//
//        @Override
//        public Bitmap transform(Bitmap bitmap) {
//            Bitmap scaled = Bitmap.createScaledBitmap(bitmap, cornerRadius, cornerRadius, false);
//            Bitmap transformed = RoundedDrawable.fromBitmap(scaled).setScaleType(ImageView.ScaleType.CENTER_CROP).setCornerRadius(cornerRadius).setOval(isOval).toBitmap();
//            if (!bitmap.equals(scaled)) bitmap.recycle();
//            if (!scaled.equals(transformed)) bitmap.recycle();
//
//            return transformed;
//        }
//
//        @Override
//        public String key() {
//            return "rounded_radius_" + cornerRadius + "_oval_" + isOval;
//        }
//    };

//    public void clearApp() {
//        MySharedPrefs.clearAllPrefs();
////        SearchRecentSuggestions suggestions = new SearchRecentSuggestions(this,
////                MySuggestionProvider.AUTHORITY, MySuggestionProvider.MODE);
////        suggestions.clearHistory();
//
//
//
//        if (mGoogleApiClient.isConnected()) {
//            //SignOut
//            Plus.AccountApi.clearDefaultAccount(mGoogleApiClient);
//            //Revoke
////            Plus.AccountApi.revokeAccessAndDisconnect(mGoogleApiClient);
//            mGoogleApiClient.disconnect();
//        }
//    }

    public void setupTransistion() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
            //set the transition
            Transition ts = new android.transition.ChangeBounds();
//            Transition ts = new RevealTransition();
            //RevealTransition

//            ts.setStartDelay(100);
            //set the duration
            ts.setDuration(1000);
            getWindow().setSharedElementEnterTransition(ts);
            getWindow().setSharedElementExitTransition(ts);
            getWindow().setSharedElementsUseOverlay(false);
//            getWindow().setAllowEnterTransitionOverlap(false); --meh
//            getWindow().setAllowReturnTransitionOverlap(false); --meh
            getWindow().setEnterTransition(ts);
            //set an exit transition so it is activated when the current activity exits
            getWindow().setExitTransition(ts);
        }
    }

}
