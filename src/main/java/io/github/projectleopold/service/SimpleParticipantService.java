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

package io.github.projectleopold.service;

import io.github.projectleopold.domain.NewParticipant;
import io.github.projectleopold.domain.Participant;
import io.github.projectleopold.entity.ParticipantEntity;
import io.github.projectleopold.mapper.NewParticipantDomainMapper;
import io.github.projectleopold.mapper.ParticipantEntityMapper;
import io.github.projectleopold.repository.ParticipantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleParticipantService implements ParticipantService {

    private final ParticipantRepository participantRepository;

    private final NewParticipantDomainMapper newParticipantDomainMapper;
    private final ParticipantEntityMapper participantEntityMapper;

    @Override
    public Participant createParticipant(NewParticipant domain) {
        ParticipantEntity entity = newParticipantDomainMapper.mapDomainToEntity(domain);
        ParticipantEntity result = participantRepository.save(entity);
        return participantEntityMapper.mapEntityToDomain(result);
    }

}
