package create.develop.core.presentation.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource


//import org.jetbrains.compose.resources.StringResource
//import org.jetbrains.compose.resources.getString


sealed interface UiText {
    data class DynamicString(val value: String) : UiText
    class Resource (
        val id: Int,
        val args: Array<Any> = arrayOf()
    ): UiText

    /**
     * an attempt to carry approach that KMP did in 'myChirp' project
     */
    @Composable
    fun asString(): String {
        return when(this) {
            is DynamicString -> value
            is Resource -> stringResource(
                    id = id,
                    *args
                    )
        }
    }

//    suspend fun asStringAsync(): String {
//        return when(this) {
//            is DynamicString -> value
//            is Resource -> getString(
//                id = id,
//                *args
//            )
//        }

}