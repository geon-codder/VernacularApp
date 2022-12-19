package com.geco.zhyskaapp

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class DataSiswa(val nama: String? = null,
                     val nis: String? = null,
                     val kelas: String? = null,
                     val alamat: String? = null,
                     val sekolah: String? = null) {
    // Null default values create a no-argument default constructor, which is needed
    // for deserialization from a DataSnapshot.
}