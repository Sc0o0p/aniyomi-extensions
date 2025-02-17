package eu.kanade.tachiyomi.animeextension.de.aniworld

import android.content.SharedPreferences

object AWConstants {
    const val NAME_DOOD = "Doodstream"
    const val NAME_STAPE = "Streamtape"
    const val NAME_VOE = "VOE"

    const val URL_DOOD = "https://dood"
    const val URL_STAPE = "https://streamtape.com"
    const val URL_VOE = "https://voe"

    val HOSTER_NAMES = arrayOf(NAME_VOE, NAME_DOOD, NAME_STAPE)
    val HOSTER_URLS = arrayOf(URL_VOE, URL_DOOD, URL_STAPE)

    const val KEY_GER_DUB = 1
    const val KEY_ENG_SUB = 2
    const val KEY_GER_SUB = 3

    const val LANG_GER_SUB = "Deutscher Sub"
    const val LANG_GER_DUB = "Deutscher Dub"
    const val LANG_ENG_SUB = "Englischer Sub"

    val LANGS = arrayOf(LANG_GER_SUB, LANG_GER_DUB, LANG_ENG_SUB)

    const val PREFERRED_HOSTER = "preferred_hoster"
    const val PREFERRED_LANG = "preferred_lang"
    const val HOSTER_SELECTION = "hoster_selection"

    const val LOGIN_TITLE = "E-Mail-Adresse"
    const val LOGIN_DEFAULT = ""
    const val PASSWORD_TITLE = "Passwort"
    const val PASSWORD_DEFAULT = ""

    const val LOGIN_URL = "https://aniworld.to/login"

    fun getPrefBaseLogin(preferences: SharedPreferences): String = preferences.getString(LOGIN_TITLE, LOGIN_DEFAULT)!!
    fun getPrefBasePassword(preferences: SharedPreferences): String = preferences.getString(PASSWORD_TITLE, PASSWORD_DEFAULT)!!
}
