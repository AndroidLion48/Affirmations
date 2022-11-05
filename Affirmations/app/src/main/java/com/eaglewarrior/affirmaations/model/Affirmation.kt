package com.eaglewarrior.affirmaations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Created by Clarence E Moore on 2022-10-13.
 *
 * Description:
 *
 *
 */
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
