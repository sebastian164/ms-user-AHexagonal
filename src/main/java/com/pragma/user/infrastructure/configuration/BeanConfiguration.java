package com.pragma.user.infrastructure.configuration;

import com.pragma.user.domain.api.IObjectServicePort;
import com.pragma.user.domain.spi.IObjectPersistencePort;
import com.pragma.user.domain.usecase.ObjectUseCase;
import com.pragma.user.infrastructure.out.jpa.adapter.ObjectJpaAdapter;
import com.pragma.user.infrastructure.out.jpa.mapper.IObjectEntityMapper;
import com.pragma.user.infrastructure.out.jpa.repository.IObjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IObjectRepository objectRepository;
    private final IObjectEntityMapper objectEntityMapper;

    @Bean
    public IObjectPersistencePort objectPersistencePort() {
        return new ObjectJpaAdapter(objectRepository, objectEntityMapper);
    }

    @Bean
    public IObjectServicePort objectServicePort() {
        return new ObjectUseCase(objectPersistencePort());
    }
}