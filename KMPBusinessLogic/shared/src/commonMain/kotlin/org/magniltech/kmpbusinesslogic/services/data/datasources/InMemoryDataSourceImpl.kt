package org.magniltech.kmpbusinesslogic.services.data.datasources

import org.magniltech.kmpbusinesslogic.dtos.HelloWorldDtos
import org.magniltech.kmpbusinesslogic.services.getPlatform

class InMemoryDataSourceImpl: InMemoryDataSource {

    override fun getHelloWorld(): HelloWorldDtos {
        return HelloWorldDtos(getPlatform().name)
    }
}