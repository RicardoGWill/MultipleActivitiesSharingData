package com.ricardogwill.multipleactivitiessharingdata.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ricardogwill.multipleactivitiessharingdata.R
import kotlinx.android.synthetic.main.activity_set_profile.*

class SetProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_profile)

        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        val city = intent.getStringExtra("city")
        val state = intent.getStringExtra("state")

        asNameTV.setText(name)
        asAgeTV.setText(age)
        asCityTV.setText(city)
        asStateTV.setText(state)

        editB.setOnClickListener{
            val intent = Intent(this@SetProfileActivity,
                EditActivity::class.java)
            startActivity(intent)
        }

        returnB.setOnClickListener{

            val intent = Intent(this@SetProfileActivity,
                MainActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("age",age)
            intent.putExtra("city",city)
            intent.putExtra("state",state)
            intent.putExtra("changed","changed")
            startActivity(intent)
        }

    }
}
