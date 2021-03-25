package eu.tutorials.smartshop

data class Barang(
    var name: String = "",
    var detail: String = "",
    var harga: String = "",
    var stok: Int = 0,
    var merek: String = "",
    var kadaluarsa: String ="",
    var asal: String = "",
    var photo: Int = 0
)