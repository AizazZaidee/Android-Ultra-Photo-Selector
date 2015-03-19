Android Ultra Photo Selector [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Android--Ultra--Photo--Selector-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1527)
=============================
Select images from Android devices made easy :-) In preview you can also Zoom images. You can select images from different albums. I am using UIL, so you can configure image caching your own way, if you want to change.
on your mobil phone. Selection image result is also preserved. See **AndroidManifest.xml** for more details. 

		Intent intent = new Intent(context, activity);
		intent.putExtra(PhotoSelectorActivity.KEY_MAX, maxImage);
		intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
		context.startActivityForResult(intent, requestCode);
		
		@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode != RESULT_OK)
			return;
		if (requestCode == SELECT_IMAGE_CODE) {// selected image
			if (data != null && data.getExtras() != null) {
				@SuppressWarnings("unchecked")
				List<PhotoModel> photos = (List<PhotoModel>) data.getExtras().getSerializable("photos");
				if (photos == null || photos.isEmpty()) {
					UIHelper.ToastMessage(this, R.string.no_photo_selected);
				} else {
					Intent intent = new Intent(this, YourOwnLogic.class);
					Bundle b = new Bundle();
					b.putSerializable("album_pojo", albumPojo);
					b.putSerializable("photos", (Serializable) photos);
					intent.putExtras(b);
					startActivity(intent);
					finish();
				}
			}
		}



> - **Select Images from Album** 


![Select Images](https://github.com/AizazAZ/Android-Ultra-Photo-Selector/blob/master/media/image1.png)

> - **Browsing all device folders that have images** 


![Browse Albums](https://github.com/AizazAZ/Android-Ultra-Photo-Selector/blob/master/media/image2.png)

> - **Preview & zoom selected images**


![Preview selected Images](https://github.com/AizazAZ/Android-Ultra-Photo-Selector/blob/master/media/image3.png)



