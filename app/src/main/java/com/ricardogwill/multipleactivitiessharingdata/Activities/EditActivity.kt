package com.ricardogwill.multipleactivitiessharingdata.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ricardogwill.multipleactivitiessharingdata.R
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        eReturnB.setOnClickListener {

            val name = eNameET.text.toString()
            val age = eAgeET.text.toString()
            val city = eCityET.text.toString()
            val state = eStateET.text.toString()

            val intent = Intent(this@EditActivity, SetProfileActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("age", age)
            intent.putExtra("city", city)
            intent.putExtra("state", state)
            startActivity(intent)

        }

    }


}
