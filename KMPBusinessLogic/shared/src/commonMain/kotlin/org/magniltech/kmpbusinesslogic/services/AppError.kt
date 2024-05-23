package org.magniltech.kmpbusinesslogic.services

data class AppError(
    val appErrorCode: Int,
    val httpErrorCode: Int = -1,
    val responseErrorCode: String? = null,
    val errorMsg: String? = null
)

fun unknownErrorResponse(
    appErrorCode: Int,
    errorMsg: String? = null
): AppError {
    return AppError(appErrorCode = appErrorCode, errorMsg = errorMsg)
}