package localhost.mmm4m5m.mishmashmush

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.TypedValue
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //supportActionBar?.hide()
        val color = TypedValue()
        getTheme().resolveAttribute (R.attr.colorPrimaryVariant, color, true);
        supportActionBar?.setBackgroundDrawable(ColorDrawable(color.data))

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_adb_24);
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) { finish(); return true }
        return super.onOptionsItemSelected(item)
    }
}