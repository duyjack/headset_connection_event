package flutter.moum.headset_connection_event;

import android.media.AudioManager;

public interface HeadsetEventListener {
    void onHeadsetConnect();

    void onHeadsetDisconnect();

    void onNextButtonPress();

    void onPrevButtonPress();

    boolean getConnectedHeadset(AudioManager audioManager);
}
