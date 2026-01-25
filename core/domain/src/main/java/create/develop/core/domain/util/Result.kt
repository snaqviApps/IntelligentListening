package create.develop.core.domain.util
sealed interface Result<out D, out E : Error> {
    data class Success<out D>(val data: D) : Result<D, Nothing>
    data class Failure<out E : Error>(val error: E) : Result<Nothing, E>
}

inline fun <T, E: Error> Result<T, E>.onSuccess(action: (T) -> Unit) : Result<T, E> {   // for possible 'fetching' data
    return when(this) {
        is Result.Failure -> this
        is Result.Success -> {
            action(this.data)
            this
        }
    }
}

fun <T, E: Error> Result<T, E>.asEmptyResult() : EmptyResult<E> {      // if Empty result
    return map {  }
}

typealias EmptyResult<E> = Result<Unit, E>

inline fun <T, E: Error> Result<T, E>.onFailure(action: (E) -> Unit) : Result<T, E> {   // for possible 'fetching' data
    return when (this) {
        is Result.Failure -> {
            action(error)
            this
        }
        is Result.Success -> this
    }
}

inline fun <T, E: Error, R> Result<T, E>.map(mapResult: (T) -> R) : Result<R, E> {
    return when(this) {
        is Result.Failure -> Result.Failure(error)
        is Result.Success -> Result.Success(mapResult(this.data))                 // here 'data' could be DTO that maps to the e.g: domain-'model'
    }
}

fun loadChat() : Result<List<String>, DataError.Remote> {
    return Result.Success(listOf("chat1", "sample2"))           // sample list
}

fun fetchChats() {
    loadChat()
        .onSuccess { chat ->
            // publish chat / whatever action needed, like pushing using viewModel for storing the data
        }
        .onFailure { error ->
            when (error) {
                DataError.Remote.UNAUTHORIZED -> TODO()
                DataError.Remote.BAD_REQUEST -> TODO()
                DataError.Remote.REQUEST_TIMEOUT -> TODO()
                DataError.Remote.FORBIDDEN -> TODO()
                DataError.Remote.NOT_FOUND -> TODO()
                DataError.Remote.CONFLICT -> TODO()
                DataError.Remote.TOO_MANY_REQUESTS -> TODO()
                DataError.Remote.NO_INTERNET -> TODO()
                DataError.Remote.PAYLOAD_TOO_LARGE -> TODO()
                DataError.Remote.SERVER_ERROR -> TODO()
                DataError.Remote.SERVICE_UNAVAILABLE -> TODO()
                DataError.Remote.SERIALIZATION -> TODO()
                DataError.Remote.UNKNOWN -> TODO()
            }
        }
}




