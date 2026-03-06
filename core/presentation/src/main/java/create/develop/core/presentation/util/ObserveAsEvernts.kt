package create.develop.core.presentation.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

/**
 * One-Time Event handler like navigation-state updates after Logging-in
 */
@Composable
fun <T> ObserveAsEvents (
  flow: Flow<T>,
  key1: Any,
  key2: Any,
  onEvent: (T) -> Unit
) {
    val lifecycleOwner = LocalLifecycleOwner.current
    LaunchedEffect(lifecycleOwner, key1, key2) {
        lifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {

            /** change the thread for collecting the to-be-one-time-Event */
            withContext(Dispatchers.Main.immediate) {
                flow.collect(
                    onEvent
                )
            }
        }
    }
}