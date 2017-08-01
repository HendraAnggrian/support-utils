package com.hendraanggrian.kota.content

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

fun Intent.isAvailable(pm: PackageManager): Boolean = resolveActivity(pm) != null

fun Intent.isAvailable(context: Context): Boolean = isAvailable(context.packageManager)