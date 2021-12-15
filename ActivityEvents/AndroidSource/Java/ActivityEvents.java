package ${YYAndroidPackageName};

//Game Maker Studio 2 Packages
import ${YYAndroidPackageName}.R;
import com.yoyogames.runner.RunnerJNILib;
import ${YYAndroidPackageName}.RunnerActivity;

//Some Android Packages
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Dialog;
import android.view.MotionEvent;

//Starts Here
public class ActivityEvents implements IExtensionBase {

    /** Called when the activity restarted */

    public void onRestart() {
        int dsMapIndex = RunnerJNILib.jCreateDsMap(null, null, null);
        RunnerJNILib.DsMapAddString(dsMapIndex, "activity", "onRestart");
        RunnerJNILib.CreateAsynEventWithDSMap(dsMapIndex, 70);
    }

    /** Called when the activity is about to become visible. */

    public void onStart() {

        int dsMapIndex = RunnerJNILib.jCreateDsMap(null, null, null);
        RunnerJNILib.DsMapAddString(dsMapIndex, "activity", "onStart");
        RunnerJNILib.CreateAsynEventWithDSMap(dsMapIndex, 70);
    }

    /** Called when the activity has become visible. */

    public void onResume() {

        int dsMapIndex = RunnerJNILib.jCreateDsMap(null, null, null);
        RunnerJNILib.DsMapAddString(dsMapIndex, "activity", "onResume");
        RunnerJNILib.CreateAsynEventWithDSMap(dsMapIndex, 70);
    }

    /** Called when another activity is taking focus. */

    public void onPause() {
        int dsMapIndex = RunnerJNILib.jCreateDsMap(null, null, null);
        RunnerJNILib.DsMapAddString(dsMapIndex, "activity", "onPause");
        RunnerJNILib.CreateAsynEventWithDSMap(dsMapIndex, 70);
    }

    /** Called when the activity is no longer visible. */

    public void onStop() {
        int dsMapIndex = RunnerJNILib.jCreateDsMap(null, null, null);
        RunnerJNILib.DsMapAddString(dsMapIndex, "activity", "onStop");
        RunnerJNILib.CreateAsynEventWithDSMap(dsMapIndex, 70);
    }

    /** Called just before the activity is destroyed. */

    public void onDestroy() {
       // useless to create ds map, because it will never reach the social event!
    }

    public void onConfigurationChanged(Configuration newConfig) {
    }

    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
    }

    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        return false;
    }

    public void onWindowFocusChanged(boolean hasFocus) {
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return false;
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return false;
    }

    public Dialog onCreateDialog(int id) {
        return null;
    }

    public boolean onTouchEvent(final MotionEvent event) {
        return false;
    }

    public boolean onGenericMotionEvent(MotionEvent event) {
        return false;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return false;
    }

    public boolean performClick() {
        return false;
    }

    public void onNewIntent(android.content.Intent newIntent) {
        
    }


}
