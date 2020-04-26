package mibnu.team.mysubmission.data

import mibnu.team.mysubmission.model.User

object DataPemain {
    private  var data = arrayOf(
        arrayOf(
            "Andritany Ardhiyasa"  ,
            "Penjaga Gawang",
            "https://persija.id/wp-content/uploads/2020/04/26_Andritany_png.png",
            "26 Desember 1991",
            "Indonesia",
            "Pemain sepak bola asal Indonesia yang bermain untuk Persija Jakarta di Liga 1 Indonesia sebagai kiper utama sekaligus kiper di timnas senior Indonesia.Pemain idolanya adalah Fabien Barthez."
        ),
        arrayOf(
            "Maman Abdurahman",
            "Bek Tengah",
            "https://persija.id/wp-content/uploads/2020/04/56_Maman_png.png",
            "12 Mei 1982",
            "Indonesia",
            "adalah pesepak bola putra Indonesia yang bermain untuk klub kota kelahirannya, yakni Persija Jakarta dan bertinggi badan 174 cm. Ia berposisi sebagai bek dan pernah bermain untuk Persib Bandung."
        ),
        arrayOf(
            "otavio Dutra",
            "Bek Tengah",
            "https://persija.id/wp-content/uploads/2020/04/5_Dutra_png.png",
            "22 November 2019",
            "indonesaia / Brasil",
            "pemain sepak bola yang berposisi Bek asal Brasil, yang sekarang bermain untuk Persija Jakarta di Liga 1. Pada September 2019 Dutra menjalani sumpah dalam rangkaian proses naturalisasi sebagai WNI. Ia telah memainkan debutnya di Timnas Indonesia pada kualifikasi Piala Dunia 2020 zona Asia melawan Vietnam. Meski berperan jadi bek, Dutra juga rajin cetak gol"

        ),
        arrayOf(
            "Rezaldi Hehan",
            "bek kanan",
            "https://persija.id/wp-content/uploads/2020/04/28_Rezaldi_png.png",
            "7 november 1995",
            "Indonesia",
            " merupakan pemain sepak bola Indonesia yang saat ini bermain untuk Persija Jakarta."

        ),
        arrayOf(
            "Marco Motta",
            "bek Kiri",
            "https://persija.id/wp-content/uploads/2020/04/47_motta_png.png",
            "14 Mei 1986",
            "Italy",
            " pemain sepak bola kelahiran Italia yang kini membela salah satu klub Liga 1 (Indonesia) yaitu Persija Jakarta. Posisinya adalah bek"

        ),
        arrayOf(
            "Rohit Chand",
            "Gelandang Tengah",
            "https://persija.id/wp-content/uploads/2020/04/32_Rohit_png.png",
            "1 March 1992",
            "Nepal",
            "seorang pemain sepak bola asal Nepal yang saat ini bergabung dengan Persija Jakarta di Liga 1 Indonesia.[1] Chand adalah pemain termuda yang bermain untuk tim senior Nepal di tingkat internasional."
        ),
        arrayOf(
            "Novri Setiawan",
            "Gelandang Sayap",
            "https://persija.id/wp-content/uploads/2020/04/11_Novri_png.png",
            "11 November 1993",
            "Indonesia",
            "seorang pemain sepak bola Indonesia. Saat ini ia bermain untuk Persija Jakarta, tim yang saat ini berkompetisi di Liga 1. Novri biasa menempati posisi sebagai gelandang ataupun bek."
        ),
        arrayOf(
            "Evan dimas",
            "Gelandang Tengah",
            "https://persija.id/wp-content/uploads/2020/04/6_Evan-Dimas_png.png",
            "13 Maret 1995",
            "Indonesia",
            "pemain sepak bola profesional Indonesia yang bermain pada posisi gelandang.[1] Evan Dimas sukses membawa Timnas Indonesia U-19 menjuarai Kejuaraan Remaja U-19 AFF 2013 dengan mengalahkan Vietnam di partai puncak."
        ),
        arrayOf(
            "Mark Klok",
            "Gelandang Tengah",
            "https://persija.id/wp-content/uploads/2020/04/10_Marc-Klok_png.png",
            "20 April 1993",
            "Indonesia",
            "adalah pemain sepak bola profesional Belanda yang bermain sebagai gelandang tengah untuk Persija di Liga 1."

        ),
        arrayOf(
            "Osvaldo Haay",
            "penyerang",
            "https://persija.id/wp-content/uploads/2020/04/46_Osvalso-Haay_png.png",
            "17 Mei 1998",
            "Indonesia",
            "merupakan pemain sepak bola berkebangsaan Indonesia yang saat ini bermain sebagai Penyerang untuk Persija Jakarta di Liga 1."
        ),
        arrayOf(
            "Marko Simic",
            "Penyerang",
            "https://persija.id/wp-content/uploads/2020/04/9_Simic_png.png",
            "23 JANUARY 1988",
            "Croatia",
            "pemain sepak bola Kroasia yang bermain sebagai striker untuk klub Persija Jakarta di Liga 1 Indonesia."
        )

    )
    val listData: ArrayList<User>
        get() {
        val list = ArrayList<User>()
        for (aData in data){
            val player = User()
            player.name = aData[0]
            player.posisi = aData[1]
            player.photo = aData[2]
            player.tglLhr= aData[3]
            player.negara = aData[4]
            player.desc = aData[5]
            list.add(player)
        }
        return list
    }
}