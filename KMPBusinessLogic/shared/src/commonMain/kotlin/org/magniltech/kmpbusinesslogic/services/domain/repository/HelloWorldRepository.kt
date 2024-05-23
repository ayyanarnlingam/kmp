package org.magniltech.kmpbusinesslogic.services.domain.repository

import kotlinx.coroutines.flow.Flow
import org.magniltech.kmpbusinesslogic.services.FlowUseCases
import org.magniltech.kmpbusinesslogic.services.domain.model.HelloWorldRequest
import org.magniltech.kmpbusinesslogic.services.domain.model.HelloWorldModel

interface HelloWorldRepository {

    fun sayHello(request: HelloWorldRequest): Flow<FlowUseCases.Result<HelloWorldModel>>

}