package com.hazam.romaski;

import com.hazam.handy.HandyApplication;
import com.hazam.handy.fs.ImageCache;
import com.hazam.widget.WebcamImageFilter;

public class RomaSkiApplication extends HandyApplication {
	public static final String TAG = "RomaSki";

	@Override
	public void onCreate() {
		super.onCreate();
		ImageCache cache = new ImageCache(getApplicationContext(), TAG);
		WebcamImageFilter filter = new WebcamImageFilter(getApplicationContext());
		cache.setOnSaveFilter(filter);
		cache.setOnLoadFilter(filter);
		registerAppService(HandyApplication.IMAGE_CACHE_APPSERVICE, cache);
	}
}
