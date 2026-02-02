package create.develop.core.presentation.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

/**
 * Using 'Kotlin-Channel, instead of a 'flow' or stateflow, it is technically a 'state' though not effectively helpful when dealing as a 'state'
 * One-time events like setting flog to '1' after login call successful
 * then navigating/showing any error message, should not be a recurring call, to navigate as flag will stay '1'
 *
 */
@Composable
fun <T> ObserveAsEvents(
    flow: Flow<T>,
    key1: Any? = null,
    key2: Any? = null,
    onEvent: (T) -> Unit     //One-time action / event
){
    /**
     * // THIS WOULD BE A WRONG APPROACH! As it will retain the state, as one-time event will not change quickly and then any change (configuration, or  e.g)
     * instead, using "LaunchedEffect" with lifeCycleSate as 'STARTED'
     */
//    val state by flow.collectAsStateWithLifecycle()

    val lifeCycleOwner = LocalLifecycleOwner.current
    LaunchedEffect(lifeCycleOwner, key1, key2) { 
        lifeCycleOwner.repeatOnLifecycle(
            state = Lifecycle.State.STARTED,
            block = {
                withContext(Dispatchers.Main.immediate) {            // immediate to make sure, event is not Lost
                    flow.collect(onEvent)
                }
            }
        )
    }

}