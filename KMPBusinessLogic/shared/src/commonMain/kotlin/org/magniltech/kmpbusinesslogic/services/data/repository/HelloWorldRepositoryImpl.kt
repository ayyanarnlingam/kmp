package org.magniltech.kmpbusinesslogic.services.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.magniltech.kmpbusinesslogic.services.FlowUseCases
import org.magniltech.kmpbusinesslogic.services.data.datasources.InMemoryDataSource
import org.magniltech.kmpbusinesslogic.services.data.mapper.toModel
import org.magniltech.kmpbusinesslogic.services.domain.model.HelloWorldModel
import org.magniltech.kmpbusinesslogic.services.domain.model.HelloWorldRequest
import org.magniltech.kmpbusinesslogic.services.domain.repository.HelloWorldRepository

class HelloWorldRepositoryImpl(private val helloWorldDataSource: InMemoryDataSource): HelloWorldRepository {

    override fun sayHello(request: HelloWorldRequest): Flow<FlowUseCases.Result<HelloWorldModel>> = flow {
        emit(FlowUseCases.Result.Success(helloWorldDataSource.getHelloWorld().toModel()))
    }

}