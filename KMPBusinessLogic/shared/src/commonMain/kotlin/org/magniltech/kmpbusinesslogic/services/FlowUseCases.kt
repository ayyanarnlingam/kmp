package org.magniltech.kmpbusinesslogic.services

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch

abstract class FlowUseCases<in P, out R> {

    sealed class Result<out M> {
        data class Success<out M>(val result: M): Result<M>()
        data class Loading(val result: Boolean): Result<Nothing>()
        data class Failure(val error: AppError): Result<Nothing>()
    }

    fun execute(param: P) = performAction(param).catch {
        emit(Result.Failure(unknownErrorResponse(-1, it.message)))
    }

    protected abstract fun performAction(param: P): Flow<Result<R>>
}