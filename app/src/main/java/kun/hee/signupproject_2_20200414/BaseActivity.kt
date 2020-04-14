package kun.hee.signupproject_2_20200414

import androidx.appcompat.app.AppCompatActivity

// 프로젝트에서 모든 액티비티가 공통적으로 사용하는
// 변수 or 함수들을 모아두는 클래스
// 이 화면은 Class로 만들었지, Activity로 만든것이 아니다!!!!!!!!!!!!!!



//어떤 Activity가 되건, AppCompatActivity를 보는 구조다.
//따라서, BaseActivity를 만들어서 AppCompatActivity를 상속해서 중간자역할~?
// 앞에 abstract ==> 뒤에 :AppCompatActivity (상속받는거 같아)
abstract class BaseActivity :AppCompatActivity() {
    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()
//     abstract 실제 활용이아니라서 뒤에 {}를 생략한다.

}


