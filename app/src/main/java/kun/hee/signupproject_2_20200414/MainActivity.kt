package kun.hee.signupproject_2_20200414

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


// 상속을 BaseActivity()로 받자. Alt+Enter하고 1번째,-> TODO 지우장
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setupEvents() {
        idEdt.addTextChangedListener(object : TextWatcher{ // alt + enter 해서 3가지 다 넣기
            override fun afterTextChanged(s: Editable?) {
                val inputVal = s.toString()
                if (inputVal.length == 0){
                    idStatusTxt.text = "최소 여섯글자 이상으로 해주세요."
                }
                else if (inputVal.length < 6){
                    idStatusTxt.text = "길이가 너무 짧습니다."
                }
                else {
                    idStatusTxt.text = "사용해도 좋은 아이디 입니다."
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }


        })
    }

    override fun setValues() {
    }


}
