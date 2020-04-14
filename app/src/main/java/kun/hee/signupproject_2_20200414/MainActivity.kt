package kun.hee.signupproject_2_20200414

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


// 상속을 BaseActivity()로 받자. Alt+Enter하고 1번째,-> TODO 지우장
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }


}
