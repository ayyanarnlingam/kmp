package org.magniltech.kmpbusinesslogic.services

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform