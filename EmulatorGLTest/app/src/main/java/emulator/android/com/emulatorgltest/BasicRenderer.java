package emulator.android.com.emulatorgltest;

import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by mserrano on 11/03/15.
 */
public class BasicRenderer implements GLSurfaceView.Renderer {

  @Override public void onSurfaceCreated(GL10 gl, EGLConfig config) {
    Log.i("BasicRenderer", "onSurfaceCreated");
  }

  @Override public void onSurfaceChanged(GL10 gl, int width, int height) {
    Log.i("BasicRenderer", "onSurfaceChanged");
  }

  @Override public void onDrawFrame(GL10 gl) {
  }


}
