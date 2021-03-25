package eu.tutorials.smartshop

object DataBarang {

    private val barangNama = arrayOf("Beras 10 L",
        "Gulaku 1 Kg",
        "Indomie Kari Ayam x 5",
        "Kecap ABC 520 ml",
        "Kopi Kapal Api Mix 24 gr x 10",
        "Sambal Terasi ABC 180 gr",
        "Saus Sambal ABC 275 ml",
        "Frisian Flag Kental Manis Kaleng 370 gr",
        "Teh Celup Sariwangi isi 25",
        "Segitiga Biru Tepung Terigu Serbaguna 1 Kg")

    private val barangDetail = arrayOf("Beras Bunga Slyp Super kualitas terbaik tanpa memakai Pemutih, Pewarna, dan Pengawet. " +
            "Kami memberikan garansi 100% uang kembali jika terbukti menggunakan pemutih, pewarna, dan pengawet.",
        "Gulaku merupakan gula murni yang terbuat dari gula tebu asli pilihan.",
        "Indomie kari ayam 72 gr merupakan mie instan dengan kuah kari ayam yang sangat menggiurkan." +
                "Perpaduan antara mie, kuah, dan bumbu otentik makanan khas Indonesia menjadikan Indomie kuah makanan yang sangat spesial apalagi bila disajikan dikala cuaca dingin atau hujan.",
        "Kecap manis ABC terbuat dari perasan pertama kedelai pilihan. Untuk masakan yang lebih kaya rasa." +
                "Kecap ABC disukai oleh 9 dari 10 ibu di Indonesia." +
                "Komposisi : Gula, Sari Kacang Kedelai 12% (mengandung gandum 0.6%), air, garam, pewarna alami karamel III dan IV, pengawet natrium benzoat, penstabil nabati, pengatur keasaman.",
        "Kapal Api special mix 24 gr merupakan kopi bubuk yang terbuat dari biji kopi pilihan. Kapal api menghasilkan kopi yang harum dan lebih enak. Tuangkan satu sendok makan kedalam cangkir, tambahkan gula secukupnya, kemudian seduh dengan air mendidih 200 ml dan kopi ini siap disajikan.",
        "Sambal terasi ABC dibuat dari perpaduan sempurna cabai pilihan berkualitas tinggi dengan berbagai macam rempah-rempah asli Indonesia yang menghasilkan rasa pedas yang khas.",
        "Saus sambal ABC terbuat dari bahan - bahan pilihan, diproduksi dan dikemas secara higenis untuk menghasilkan saus dengan kekentalan dan kemurnian rasa yang pas, ideal dinikmati saat waktu makan bersama keluarga. Memberikan cita rasa istimewa pada setiap makanan serta aman untuk dikonsumsi.",
        "Frisian flag kental manis mengandung zat gizi makro (protein, karbohidrat, dan lemak) serta mengandung 8 vitamin, kalsium dan fosfor." +
                "Satu porsi kental manis lemak nabati frisian flag bendera kental manis mengandung energi sebanyak 140 kkal untuk mendukung asupan energi anda.",
        "Sariwangi mengandung daun teh berkualitas untuk menghasilkan rasa dan aroma teh yang lebih segar untuk jadikan momen keluarga lebih dekat.",
        "Segitiga biru adalah tepung terigu yang cocok untuk membuat aneka makanan seperti bolu, brownies, cake, dan lain - lain."
    )

    private val hargaBarang = arrayOf("Rp 100.000,00",
            "Rp 15.500,00",
            "Rp 14.000,00",
            "Rp 21.500,00",
            "Rp 11.400,00",
            "Rp 16.000,00",
            "Rp 10.000,00",
            "RP 10.000,00",
            "Rp 6.000,00",
            "Rp 10.000,00"
    )

    private val stokBarang = intArrayOf(164,
            21,
            50,
            944,
            200,
            75,
            56,
            98,
            87,
            76
    )

    private val merekBarang = arrayOf("Slyp",
            "Gulaku",
            "Indomie",
            "ABC",
            "Kapal Api",
            "ABC",
            "ABC",
            "ABC",
            "Frisian Flag",
            "Sariwangi",
            "Segitiga Biru"

    )

    private val kadaluarsaBarang = arrayOf("Desember 2021",
            "September 2021",
            "Agustus 2021",
            "November 2021",
            "Desember 2022",
            "Januari 2022",
            "Oktober 2021",
            "Juli 2022",
            "Maret 2022",
            "Februari 2022"
    )

    private val asalBarang = arrayOf("Kota Depok - Cilodong, Jawa Barat, Indonesia",
            "Kebon Jeruk - Jakarta Barat, DKI Jakarta, Indonesia",
            "Kabupaten Gresik, Jawa Tmur, Indonesia",
            "Kota Bekasi, Jawa Barat, Indonesia",
            "Kota Bekasi, Jawa Barat, Indonesia",
            "Kabupaten Gresik, Jawa Tmur, Indonesia",
            "Kabupaten Gresik, Jawa Tmur, Indonesia",
            "Kabupaten Gresik, Jawa Tmur, Indonesia",
            "Kota Bekasi, Jawa Barat, Indonesia",
            "Kota Tangerang - Karawaci, Banten, Indonesia",
            "Grogol Petamburan - Kota Jakarta Barat, DKI Jakarta, Indonesia"

    )

    private val barangGambar = intArrayOf(R.drawable.beras,
        R.drawable.gulaku,
        R.drawable.indomie,
        R.drawable.kecap,
        R.drawable.kopi,
        R.drawable.sambal_terasi,
        R.drawable.saus,
        R.drawable.susu,
        R.drawable.teh,
        R.drawable.tepung
    )

    val listData: ArrayList<Barang>
        get() {
            val list = arrayListOf<Barang>()
            for (position in barangNama.indices) {
                val barang = Barang()
                barang.name = barangNama[position]
                barang.detail = barangDetail[position]
                barang.photo = barangGambar[position]
                barang.harga = hargaBarang[position]
                barang.stok = stokBarang[position]
                barang.merek = merekBarang[position]
                barang.kadaluarsa = kadaluarsaBarang[position]
                barang.asal = asalBarang[position]
                list.add(barang)
            }
            return list
        }

}