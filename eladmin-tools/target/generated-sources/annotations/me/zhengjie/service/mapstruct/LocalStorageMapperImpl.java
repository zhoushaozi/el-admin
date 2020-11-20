package me.zhengjie.service.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.domain.LocalStorage;
import me.zhengjie.service.dto.LocalStorageDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-11-16T17:01:54+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_161 (Oracle Corporation)"
)
@Component
public class LocalStorageMapperImpl implements LocalStorageMapper {

    @Override
    public LocalStorage toEntity(LocalStorageDto dto) {
        if ( dto == null ) {
            return null;
        }

        LocalStorage localStorage = new LocalStorage();

        localStorage.setCreateBy( dto.getCreateBy() );
        localStorage.setUpdatedBy( dto.getUpdatedBy() );
        localStorage.setCreateTime( dto.getCreateTime() );
        localStorage.setUpdateTime( dto.getUpdateTime() );
        localStorage.setId( dto.getId() );
        localStorage.setRealName( dto.getRealName() );
        localStorage.setName( dto.getName() );
        localStorage.setSuffix( dto.getSuffix() );
        localStorage.setType( dto.getType() );
        localStorage.setSize( dto.getSize() );

        return localStorage;
    }

    @Override
    public LocalStorageDto toDto(LocalStorage entity) {
        if ( entity == null ) {
            return null;
        }

        LocalStorageDto localStorageDto = new LocalStorageDto();

        localStorageDto.setCreateBy( entity.getCreateBy() );
        localStorageDto.setUpdatedBy( entity.getUpdatedBy() );
        localStorageDto.setCreateTime( entity.getCreateTime() );
        localStorageDto.setUpdateTime( entity.getUpdateTime() );
        localStorageDto.setId( entity.getId() );
        localStorageDto.setRealName( entity.getRealName() );
        localStorageDto.setName( entity.getName() );
        localStorageDto.setSuffix( entity.getSuffix() );
        localStorageDto.setType( entity.getType() );
        localStorageDto.setSize( entity.getSize() );

        return localStorageDto;
    }

    @Override
    public List<LocalStorage> toEntity(List<LocalStorageDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<LocalStorage> list = new ArrayList<LocalStorage>( dtoList.size() );
        for ( LocalStorageDto localStorageDto : dtoList ) {
            list.add( toEntity( localStorageDto ) );
        }

        return list;
    }

    @Override
    public List<LocalStorageDto> toDto(List<LocalStorage> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<LocalStorageDto> list = new ArrayList<LocalStorageDto>( entityList.size() );
        for ( LocalStorage localStorage : entityList ) {
            list.add( toDto( localStorage ) );
        }

        return list;
    }
}
