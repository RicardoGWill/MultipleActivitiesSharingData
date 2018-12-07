package com.ricardogwill.multipleactivitiessharingdata.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ricardogwill.multipleactivitiessharingdata.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changed = intent.getStringExtra("changed")



        if (changed == "changed") {
            val name = intent.getStringExtra("name")
            val age = intent.getStringExtra("age")
            val city = intent.getStringExtra("city")
            val state = intent.getStringExtra("state")

            nameTV.setText(name)
            ageTV.setText(age)
            cityTV.setText(city)
            stateTV.setText(state)
        } else {
            nameTV.setText("(Not Set)")
            ageTV.setText("(Not Set)")
            cityTV.setText("(Not Set)")
            stateTV.setText("(Not Set)")
        }

        signInB.setOnClickListener{
            if (usernameET.text.toString() == "Rick" && pinET.text.toString() == "1234") {
                val intent = Intent(this@MainActivity,
                    SetProfileActivity::class.java)
                intent.putExtra("name",nameTV.text.toString())
                intent.putExtra("age",ageTV.text.toString())
                intent.putExtra("city",cityTV.text.toString())
                intent.putExtra("state",stateTV.text.toString())
                startActivity(intent)
            } else if (usernameET.text.toString() != "Rick" && pinET.text.toString() == "1234") {
                Toast.makeText(this@MainActivity, "Please enter the correct Username.", Toast.LENGTH_SHORT).show()
            } else if (usernameET.text.toString() == "Rick" && pinET.text.toString() != "1234") {
                Toast.makeText(this@MainActivity, "Please enter the correct PIN.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "Please enter the correct Username and PIN.", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
