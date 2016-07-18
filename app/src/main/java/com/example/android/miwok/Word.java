package com.example.android.miwok;

/**
 * Created by himadri on 17/7/16.
 */
public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId = 0;

    public Word(String defaultTranslation, String miwoktranslation, int audioResourceId ) {
        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwoktranslation;

        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwoktranslation, int imageResourceId, int audioResourceId ) {
        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwoktranslation;

        mImageResourceId = imageResourceId;

        mAudioResourceId = audioResourceId;
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

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
