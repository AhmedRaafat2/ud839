
package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId ;
    private  int audio_Resource;

    public Word(String defaultTranslation, String miwokTranslation, int audio_resource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        audio_Resource = audio_resource;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audio_resource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        audio_Resource = audio_resource;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudio_Resource() { return audio_Resource; }
}