package org.magniltech.kmpbusinesslogic.services.domain.usecases

import kotlinx.coroutines.flow.Flow
import org.magniltech.kmpbusinesslogic.services.FlowUseCases
import org.magniltech.kmpbusinesslogic.services.domain.model.HelloWorldRequest
import org.magniltech.kmpbusinesslogic.services.domain.model.HelloWorldModel
import org.magniltech.kmpbusinesslogic.services.domain.repository.HelloWorldRepository

class HelloWorldUseCase(private val helloWorldRepository: HelloWorldRepository) : FlowUseCases<HelloWorldRequest, HelloWorldModel>() {

    override fun performAction(param: HelloWorldRequest): Flow<Result<HelloWorldModel>> {
        return helloWorldRepository.sayHello(param)
    }

}