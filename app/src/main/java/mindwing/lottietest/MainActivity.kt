package mindwing.lottietest

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    internal var names = arrayOf("9squares-AlBoardman.json",
//            "v006_imagedetail_created.json", "v006_imagedetail_pressed.json", "v006_imagedetail_hold.json",
            "A.json", "Alarm.json", "Apostrophe.json", "B.json", "BlinkingCursor.json",
            "C.json", "CheckSwitch.json", "Colon.json", "Comma.json", "D.json",
            "E.json", "EllipseTrimPath.json", "EmptyState.json", "F.json",
            "G.json", "H.json", "HamburgerArrow.json", "Hosts.json", "I.json",
            "J.json", "K.json", "L.json", "LightBulb.json", "LogoSmall.json",
            "LoopPlayOnce.json", "LottieLogo1.json", "LottieLogo2.json",
            "M.json", "MotionCorpse-Jrcanest.json", "N.json", "O.json",
            "P.json", "PinJump.json", "Q.json", "R.json", "S.json",
            "SplitDimensions.json", "T.json", "TwitterHeart.json", "U.json",
            "V.json", "W.json", "Walkthrough.json", "X.json", "Y.json", "Z.json")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        lt_lottie.setAnimation(names[0])
        Snackbar.make(lt_lottie, names[0], Snackbar.LENGTH_LONG).show()

        var count: Int = 0
        lt_fab.setOnClickListener { view ->
            count++
            count %= names.size
            lt_lottie.setAnimation(names[count])

            Snackbar.make(view, names[count], Snackbar.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> {
                Toast.makeText(this, "Airbnb 의 Lottie 를 테스트해보기 위한 앱입니다.", Toast.LENGTH_SHORT).show()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
