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
    }
    private fun updateName(view: View){
        val nameEditText = findViewById<EditText>(R.id.name_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val licenseEditText = findViewById<EditText>(R.id.license_edit)

        val submitBtn = findViewById<Button>(R.id.submit_button1)
        val deleteBtn = findViewById<Button>(R.id.delete_button1)
        val emtyBtn1 = findViewById<Button>(R.id.emtyone_button)

        nameEditText.visibility = View.GONE
        brandEditText.visibility = View.GONE
        licenseEditText.visibility = View.GONE
        emtyBtn1.text = nameEditText.text

        submitBtn.visibility = View.GONE
        deleteBtn.visibility = View.GONE
    }

    private fun addName(view: View){
        val nameEditText = findViewById<EditText>(R.id.name_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val licenseEditText = findViewById<EditText>(R.id.license_edit)

        val submitBtn = findViewById<Button>(R.id.submit_button1)
        val deleteBtn = findViewById<Button>(R.id.delete_button1)
        val emtyBtn1 = findViewById<Button>(R.id.emtyone_button)

        nameEditText.visibility = View.VISIBLE
        brandEditText.visibility = View.VISIBLE
        licenseEditText.visibility = View.VISIBLE
        emtyBtn1.text = nameEditText.text

        submitBtn.visibility = View.VISIBLE
        deleteBtn.visibility = View.VISIBLE




    }
}
