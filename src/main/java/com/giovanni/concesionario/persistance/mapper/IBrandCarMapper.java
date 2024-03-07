package com.giovanni.concesionario.persistance.mapper;

import com.giovanni.concesionario.domain.pojo.BrandCarPojo;
import com.giovanni.concesionario.persistance.entities.BrandCarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * Mapper que transforma objetos de marcaCoche a pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface IBrandCarMapper {

    /**
     * Convierte una entidad marca cocghe a un pojo
     * @param brandEntity Entidad a convertir
     * @return pojo Convertido
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    BrandCarPojo toBrandCarPojo(BrandCarEntity brandEntity);

    /**
     * Convierte un pojo a una entidad de marcaCoche
     * @param brandPojo Pojo a convertir
     * @return Entity Convertido
     */
    @InheritInverseConfiguration
    BrandCarEntity toBrandCarEntity(BrandCarPojo brandPojo);

    /**
     * Retorna una lista de marcasCoche transformada a pojo de una lista de entidades
     * @param brandsCarEntity Entidades a transformar
     * @return Lista transformada
     */
    List<BrandCarPojo> toBrandCarPojo(List<BrandCarEntity> brandsCarEntity);
}
