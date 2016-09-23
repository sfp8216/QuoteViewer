package course.examples.fragments.staticlayout;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import course.examples.fragments.staticlayout.TitlesFragment.ListSelectionListener;

//Several Activity lifecycle methods are instrumented to emit LogCat output
//so you can follow this class' lifecycle
public class QuoteViewerActivity extends Activity implements
		ListSelectionListener {

	public static String[] titleArray;
	public static String[] quoteArray;
	public static TypedArray picturesArray;
	private QuotesFragment detailsFragment;

	private static final String TAG = "QuoteViewerActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Get the string arrays with the titles and qutoes
		titleArray = getResources().getStringArray(R.array.Titles);
		quoteArray = getResources().getStringArray(R.array.Quotes);
		picturesArray = getResources().obtainTypedArray(R.array.Pictures);
		setContentView(R.layout.main);

		// Get a reference to the QuotesFragment
		detailsFragment = (QuotesFragment) getFragmentManager()
				.findFragmentById(R.id.details);
	}

	// Called when the user selects an item in the TitlesFragment
	@Override
	public void onListSelection(int index) {
		if (detailsFragment.getShownIndex() != index) {

			// Tell the QuoteFragment to show the quote string at position index
			detailsFragment.showQuoteAtIndex(index);
		}
	}

	@Override
	protected void onDestroy() {
		Log.i(TAG, getClass().getSimpleName() + "------------------:entered onDestroy()");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i(TAG, getClass().getSimpleName() + "-------------------:entered onPause()");
		super.onPause();
	}

	@Override
	protected void onRestart() {
		Log.i(TAG, getClass().getSimpleName() + "-------------------:entered onRestart()");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.i(TAG, getClass().getSimpleName() + "-------------------:entered onResume()");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.i(TAG, getClass().getSimpleName() + "-------------------:entered onStart()");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i(TAG, getClass().getSimpleName() + "-------------------:entered onStop()");
		super.onStop();
	}

}
