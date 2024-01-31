package com.example.headhunter2.mapper;

import java.util.Set;

public interface EntityMapper<D,E> {
    D toDTO(E e);
    E toEntity(D d);
    Set<D> toDTOs(Set<E> es);
    Set<E> toEntities(Set<D> dSet);
}
