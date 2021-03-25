package eu.tutorials.smartshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBarang: RecyclerView
    private var list: ArrayList<Barang> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBarang = findViewById(R.id.rv_barang)
        rvBarang.setHasFixedSize(true)
        list.addAll(DataBarang.listData)
        showRecyclerList()


    }

    private fun showRecyclerList() {
        rvBarang.layoutManager = LinearLayoutManager(this)
        val listBarangAdapter = ListBarangAdapter(list)
        rvBarang.adapter = listBarangAdapter

        listBarangAdapter.setOnItemClickCallback(object : ListBarangAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Barang) {
                showSelectedBarang(data)
            }
        })
    }

    private fun showSelectedBarang(barang: Barang) {
        val intent = Intent(this, Detail::class.java)
        intent.putExtra("gambar", barang.photo)
        intent.putExtra("nama", barang.name)
        intent.putExtra("detail", barang.detail)
        intent.putExtra("harga", barang.harga)
        intent.putExtra("stok", barang.stok)
        intent.putExtra("merek", barang.merek)
        intent.putExtra("kadaluarsa", barang.kadaluarsa)
        intent.putExtra("asal", barang.asal)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }



    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val intent = Intent(this, About::class.java)
                startActivity(intent)
            }
        }
    }



}