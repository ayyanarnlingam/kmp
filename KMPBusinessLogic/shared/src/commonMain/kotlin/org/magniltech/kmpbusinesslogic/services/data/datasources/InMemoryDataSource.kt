package org.magniltech.kmpbusinesslogic.services.data.datasources

import org.magniltech.kmpbusinesslogic.dtos.HelloWorldDtos

interface InMemoryDataSource {

    fun getHelloWorld(): HelloWorldDtos

}