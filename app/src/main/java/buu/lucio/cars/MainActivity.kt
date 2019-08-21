package buu.lucio.cars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.emtyone_button).setOnClickListener{
            addName(it)
        }
        findViewById<Button>(R.id.submit_button1).setOnClickListener{
            updateName(it)
        }
        findViewById<Button>(R.id.emtytwo_button).setOnClickListener{
            addName2(it)
        }
        findViewById<Button>(R.id.submit_button2).setOnClickListener{
            updateName2(it)
        }
        findViewById<Button>(R.id.emtythree_button).setOnClickListener{
            addName3(it)
        }
        findViewById<Button>(R.id.submit_button3).setOnClickListener{
            updateName3(it)
        }

    }
    private fun updateName(view: View){
        val nameEditText = findViewById<EditText>(R.id.name_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val licenseEditText = findViewById<EditText>(R.id.license_edit)
        val submitBtn = findViewById<Button>(R.id.submit_button1)
        val deleteBtn = findViewById<Button>(R.id.delete_button1)
        val emtyBtn1 = findViewById<Button>(R.id.emtyone_button)
        val emtyBtn2 = findViewById<Button>(R.id.emtytwo_button)
        val emtyBtn3 = findViewById<Button>(R.id.emtythree_button)

        emtyBtn2.visibility = View.VISIBLE
        emtyBtn3.visibility = View.VISIBLE

        nameEditText.visibility = View.GONE
        brandEditText.visibility = View.GONE
        licenseEditText.visibility = View.GONE
        emtyBtn1.text = nameEditText.text
        submitBtn.visibility = View.GONE
        deleteBtn.visibility = View.GONE


    }
    private fun updateName2(view: View){
        val nameEditText2 = findViewById<EditText>(R.id.name_edit2)
        val brandEditText2 = findViewById<EditText>(R.id.brand_edit2)
        val licenseEditText2 = findViewById<EditText>(R.id.license_edit2)
        val submitBtn2 = findViewById<Button>(R.id.submit_button2)
        val deleteBtn2 = findViewById<Button>(R.id.delete_button2)
        val emtyBtn2 = findViewById<Button>(R.id.emtytwo_button)
        val emtyBtn1 = findViewById<Button>(R.id.emtyone_button)
        val emtyBtn3 = findViewById<Button>(R.id.emtythree_button)

        emtyBtn1.visibility = View.VISIBLE
        emtyBtn3.visibility = View.VISIBLE
        nameEditText2.visibility = View.GONE
        brandEditText2.visibility = View.GONE
        licenseEditText2.visibility = View.GONE
        emtyBtn2.text = nameEditText2.text

        submitBtn2.visibility = View.GONE
        deleteBtn2.visibility = View.GONE
    }
    private fun updateName3(view: View){
        val nameEditText3 = findViewById<EditText>(R.id.name_edit3)
        val brandEditText3 = findViewById<EditText>(R.id.brand_edit3)
        val licenseEditText3 = findViewById<EditText>(R.id.license_edit3)
        val submitBtn3 = findViewById<Button>(R.id.submit_button3)
        val deleteBtn3 = findViewById<Button>(R.id.delete_button3)
        val emtyBtn3 = findViewById<Button>(R.id.emtythree_button)
        val emtyBtn1 = findViewById<Button>(R.id.emtyone_button)
        val emtyBtn2 = findViewById<Button>(R.id.emtytwo_button)

        emtyBtn1.visibility = View.VISIBLE
        emtyBtn2.visibility = View.VISIBLE
        nameEditText3.visibility = View.GONE
        brandEditText3.visibility = View.GONE
        licenseEditText3.visibility = View.GONE
        emtyBtn3.text = nameEditText3.text

        submitBtn3.visibility = View.GONE
        deleteBtn3.visibility = View.GONE
    }


    private fun addName(view: View){
        val nameEditText = findViewById<EditText>(R.id.name_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val licenseEditText = findViewById<EditText>(R.id.license_edit)
        val submitBtn = findViewById<Button>(R.id.submit_button1)
        val deleteBtn = findViewById<Button>(R.id.delete_button1)
        val emtyBtn1 = findViewById<Button>(R.id.emtyone_button)
        val emtyBtn2 = findViewById<Button>(R.id.emtytwo_button)
        val emtyBtn3 = findViewById<Button>(R.id.emtythree_button)

        emtyBtn2.visibility = View.GONE
        emtyBtn3.visibility = View.GONE
        nameEditText.visibility = View.VISIBLE
        brandEditText.visibility = View.VISIBLE
        licenseEditText.visibility = View.VISIBLE
        emtyBtn1.text = nameEditText.text
        submitBtn.visibility = View.VISIBLE
        deleteBtn.visibility = View.VISIBLE

    }
    private fun addName2(view: View){
        val nameEditText2 = findViewById<EditText>(R.id.name_edit2)
        val brandEditText2 = findViewById<EditText>(R.id.brand_edit2)
        val licenseEditText2 = findViewById<EditText>(R.id.license_edit2)
        val submitBtn2 = findViewById<Button>(R.id.submit_button2)
        val deleteBtn2 = findViewById<Button>(R.id.delete_button2)
        val emtyBtn2 = findViewById<Button>(R.id.emtytwo_button)
        val emtyBtn1 = findViewById<Button>(R.id.emtyone_button)
        val emtyBtn3 = findViewById<Button>(R.id.emtythree_button)

        emtyBtn1.visibility = View.GONE
        emtyBtn3.visibility = View.GONE

        nameEditText2.visibility = View.VISIBLE
        brandEditText2.visibility = View.VISIBLE
        licenseEditText2.visibility = View.VISIBLE
        emtyBtn2.text = nameEditText2.text
        submitBtn2.visibility = View.VISIBLE
        deleteBtn2.visibility = View.VISIBLE
    }
    private fun addName3(view: View){
        val nameEditText3 = findViewById<EditText>(R.id.name_edit3)
        val brandEditText3 = findViewById<EditText>(R.id.brand_edit3)
        val licenseEditText3 = findViewById<EditText>(R.id.license_edit3)
        val submitBtn3 = findViewById<Button>(R.id.submit_button3)
        val deleteBtn3 = findViewById<Button>(R.id.delete_button3)
        val emtyBtn3 = findViewById<Button>(R.id.emtythree_button)
        val emtyBtn1 = findViewById<Button>(R.id.emtyone_button)
        val emtyBtn2 = findViewById<Button>(R.id.emtytwo_button)

        emtyBtn1.visibility = View.GONE
        emtyBtn2.visibility = View.GONE

        nameEditText3.visibility = View.VISIBLE
        brandEditText3.visibility = View.VISIBLE
        licenseEditText3.visibility = View.VISIBLE
        emtyBtn3.text = nameEditText3.text
        submitBtn3.visibility = View.VISIBLE
        deleteBtn3.visibility = View.VISIBLE
    }

}
