package org.magniltech.kmpbusinesslogic.services.data.mapper

import org.magniltech.kmpbusinesslogic.dtos.HelloWorldDtos
import org.magniltech.kmpbusinesslogic.services.domain.model.HelloWorldModel

fun HelloWorldDtos.toModel() : HelloWorldModel {
    return HelloWorldModel(this.helloWorld)
}