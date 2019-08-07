package com.example.myapplication


import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.myapplication.entity.ProductEntity
import kotlinx.android.synthetic.main.activity_main_2.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)
        GlobalScope.launch {
            withContext(Dispatchers.Main) {
                delay(5000)
                customVIew.loadEntity(
                    ProductEntity(
                        "Rentabilidade",
                        "100,00% CDI",
                        "100,00% CDI",
                        drawable = ContextCompat.getDrawable(this@MainActivity, R.drawable.ic_launcher_background),
                        detailClickListenter = {
                            Toast.makeText(this@MainActivity, "aloha", Toast.LENGTH_SHORT).show()
                        })
                )
                customVIew.setTextPrincipalColor(Color.RED)
                customVIew.setEnableLineDivider(true)
                customVIew.setTextPrincipalFontFamily(Typeface.create(Typeface.MONOSPACE, Typeface.NORMAL))
                customVIew.setTextPrincipalSize(13f)


                customVIew.setTextValueColor(Color.GREEN)
                customVIew.setTextValueFontFamily(Typeface.create(Typeface.MONOSPACE, Typeface.NORMAL))
                customVIew.setTextValueSize(13f)
            }
        }
//        customVIew2.loadEntity(ProductEntity("Prazo",
//            "360 Dias", "360 Dias", drawable = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background), detailClickListenter = {
//                Toast.makeText(this, "aloha", Toast.LENGTH_SHORT).show()
//            }))


    }
}
