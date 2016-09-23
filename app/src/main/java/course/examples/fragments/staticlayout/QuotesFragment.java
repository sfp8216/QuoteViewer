package course.examples.fragments.staticlayout;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

//Several Activity and Fragment lifecycle methods are instrumented to emit LogCat output
//so you can follow the class' lifecycle
public class QuotesFragment extends Fragment {

	private TextView quoteView = null;
	private ImageView pictureView = null;
	private int currIdx = -1;
	private int quoteArrayLen;
	private int imageArrayLen;
	private int pictureResource;

	private static final String TAG = "QuotesFragment";

	public int getShownIndex() {
		return currIdx;
	}

	// Show the Quote string at position newIndex
	public void showQuoteAtIndex(int newIndex) {
		if (newIndex < 0 || newIndex >= quoteArrayLen)
			return;
		currIdx = newIndex;
		quoteView.setText(QuoteViewerActivity.quoteArray[currIdx]);
		pictureView.setImageResource(QuoteViewerActivity.picturesArray.getResourceId(currIdx,-1));
			Log.i(TAG," is in the array");
	}

	@Override
	public void onAttach(Activity activity) {
		Log.i(TAG, getClass().getSimpleName() + "-----------------------:entered onAttach()");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, getClass().getSimpleName() + "------------------------:entered onCreate()");
		super.onCreate(savedInstanceState);
	}

	// Called to create the content view for this Fragment
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// Inflate the layout defined in quote_fragment.xml
		// The last parameter is false because the returned view does not need to be attached to the container ViewGroup
		return inflater.inflate(R.layout.quote_fragment, container, false);
	}

	// Set up some information about the mQuoteView TextView
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		quoteView = (TextView) getActivity().findViewById(R.id.quoteView);
		pictureView = (ImageView) getActivity().findViewById(R.id.imageView);
		quoteArrayLen = QuoteViewerActivity.quoteArray.length;
		imageArrayLen = quoteArrayLen;
	}

	@Override
	public void onStart() {
		Log.i(TAG, getClass().getSimpleName() + "-------------------------:entered onStart()");
		super.onStart();
	}

	@Override
	public void onResume() {
		Log.i(TAG, getClass().getSimpleName() + "-------------------------:entered onResume()");
		super.onResume();
	}

	@Override
	public void onPause() {
		Log.i(TAG, getClass().getSimpleName() + "--------------------------:entered onPause()");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.i(TAG, getClass().getSimpleName() + "-----------------------:entered onStop()");
		super.onStop();
	}

	@Override
	public void onDetach() {
		Log.i(TAG, getClass().getSimpleName() + "-----------------------:entered onDetach()");
		super.onDetach();
	}

	@Override
	public void onDestroy() {
		Log.i(TAG, getClass().getSimpleName() + "-----------------------:entered onDestroy()");
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		Log.i(TAG, getClass().getSimpleName() + "-----------------------:entered onDestroyView()");
		super.onDestroyView();
	}

}
