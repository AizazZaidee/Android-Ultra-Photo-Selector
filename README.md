Android-Ultra-Photo-Selector
=============================
Select images from Android devices made easy :-) In preview you can also Zoom images. You can select images from different albums
on your mobil phone. Selection image result is also preserved. See **AndroidManifest.xml** for more details. 

    Intent intent = new Intent(context, activity);
		intent.putExtra(PhotoSelectorActivity.KEY_MAX, maxImage);
		intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
		context.startActivityForResult(intent, requestCode);


> - **Select Images from Album** 


![Select Images](https://github.com/AizazAZ/Android-Ultra-Photo-Selector/blob/master/media/image1.png)

> - **Browsing all device folders that has images** 


![Browse Albums](https://github.com/AizazAZ/Android-Ultra-Photo-Selector/blob/master/media/image2.png)

> - **Preview selected images, Zoom also supported**


![Preview selected Images](https://github.com/AizazAZ/Android-Ultra-Photo-Selector/blob/master/media/image3.png)



