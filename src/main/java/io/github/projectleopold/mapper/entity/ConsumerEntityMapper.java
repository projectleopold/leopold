/*
 * Copyright 2023 The Project Leopold Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.projectleopold.mapper.entity;

import io.github.projectleopold.configuration.SpringMapStructConfiguration;
import io.github.projectleopold.domain.Consumer;
import io.github.projectleopold.entity.ConsumerEntity;
import io.github.projectleopold.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(config = SpringMapStructConfiguration.class)
public interface ConsumerEntityMapper
        extends EntityMapper<ConsumerEntity, Consumer> {

    @Override
    Consumer mapEntityToDomain(ConsumerEntity consumerEntity);

}
