package com.example.otopark
import android.app.ProgressDialog
import android.support.design.widget.CoordinatorLayout
import android.support.v7.app.AppCompatActivity
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.TextView

open class BaseActivity: AppCompatActivity(){

    private lateinit var mTextViewScreenTitle: TextView
    private lateinit var mImageButtonBack: ImageButton

    /*private lateinit var mProgressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mProgressDialog = ProgressDialog(this)
        mProgressDialog.setCancelable(false)
        mProgressDialog.setMessage("Yükleniyor")
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER)

        mProgressDialog.isIndeterminate = true
    }
    Açıklama: ProgressDialog ekleyemedim..
*/
    override fun setContentView(layoutResID: Int) {
        var coordinatorLayout: CoordinatorLayout = layoutInflater.inflate(R.layout.activity_base, null) as CoordinatorLayout
        var activityContainer: FrameLayout = coordinatorLayout.findViewById(R.id.layout_container)
        mTextViewScreenTitle = coordinatorLayout.findViewById(R.id.text_screen_title) as TextView
        mImageButtonBack = coordinatorLayout.findViewById(R.id.image_back_button)

        layoutInflater.inflate(layoutResID, activityContainer, true)

        super.setContentView(coordinatorLayout)
    }

    fun setScreenTitle(title: String) {
        mTextViewScreenTitle.text = title;
    }

    fun getBackButton(): ImageButton {
        return mImageButtonBack;
    }




}
