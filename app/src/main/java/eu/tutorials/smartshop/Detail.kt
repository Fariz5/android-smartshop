package eu.tutorials.smartshop

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*
// bla
class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var gambar: Int = intent.getIntExtra("gambar", 0)
        Glide.with(this)
                .load(gambar)
                .into(ivGambar)


        var nama: String? = intent.getStringExtra("nama")
        tvNama.text = nama.toString()

        var detail: String? = intent.getStringExtra("detail")
        tvDetail.text = detail.toString()

        var harga: String? = intent.getStringExtra("harga")
        tvHarga.text = harga.toString()

        var stok: Int? = intent.getIntExtra("stok", 0)
        tvStok.text = stok.toString()

        var merek: String? = intent.getStringExtra("merek")
        tvMerek.text = merek.toString()

        var kadaluarsa: String? = intent.getStringExtra("kadaluarsa")
        tvKadaluarsa.text = kadaluarsa.toString()

        var asal: String? = intent.getStringExtra("asal")
        tvAsal.text = asal.toString()

        btnBeli.setOnClickListener{
            Toast.makeText(this, "Anda Membeli " + nama, Toast.LENGTH_SHORT).show()
        }

    }
}