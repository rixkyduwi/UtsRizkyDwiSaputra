package com.RizkyDwiSaputra.Politik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.utsrizkydwisaputra.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Detail Biografi"

        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        imageViewDetail.setImageResource(intent.getIntExtra("gambar",
            R.drawable.prabowottransparant
        ))
        textViewNamaDetail.text = intent.getStringExtra("nama")
        textViewHargaDetail.text = intent.getStringExtra("harga")
        textViewKetDetail.text = intent.getStringExtra("keterangan")

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}