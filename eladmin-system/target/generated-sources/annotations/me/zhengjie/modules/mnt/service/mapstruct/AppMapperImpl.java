package me.zhengjie.modules.mnt.service.mapstruct;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.modules.mnt.domain.App;
import me.zhengjie.modules.mnt.service.dto.AppDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-11-16T17:02:03+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_161 (Oracle Corporation)"
)
@Component
public class AppMapperImpl implements AppMapper {

    @Override
    public App toEntity(AppDto dto) {
        if ( dto == null ) {
            return null;
        }

        App app = new App();

        app.setCreateBy( dto.getCreateBy() );
        app.setUpdatedBy( dto.getUpdatedBy() );
        app.setCreateTime( dto.getCreateTime() );
        app.setUpdateTime( dto.getUpdateTime() );
        app.setId( dto.getId() );
        app.setName( dto.getName() );
        if ( dto.getPort() != null ) {
            app.setPort( dto.getPort() );
        }
        app.setUploadPath( dto.getUploadPath() );
        app.setDeployPath( dto.getDeployPath() );
        app.setBackupPath( dto.getBackupPath() );
        app.setStartScript( dto.getStartScript() );
        app.setDeployScript( dto.getDeployScript() );

        return app;
    }

    @Override
    public AppDto toDto(App entity) {
        if ( entity == null ) {
            return null;
        }

        AppDto appDto = new AppDto();

        appDto.setCreateBy( entity.getCreateBy() );
        appDto.setUpdatedBy( entity.getUpdatedBy() );
        appDto.setCreateTime( entity.getCreateTime() );
        appDto.setUpdateTime( entity.getUpdateTime() );
        appDto.setId( entity.getId() );
        appDto.setName( entity.getName() );
        appDto.setPort( entity.getPort() );
        appDto.setUploadPath( entity.getUploadPath() );
        appDto.setDeployPath( entity.getDeployPath() );
        appDto.setBackupPath( entity.getBackupPath() );
        appDto.setStartScript( entity.getStartScript() );
        appDto.setDeployScript( entity.getDeployScript() );

        return appDto;
    }

    @Override
    public List<App> toEntity(List<AppDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<App> list = new ArrayList<App>( dtoList.size() );
        for ( AppDto appDto : dtoList ) {
            list.add( toEntity( appDto ) );
        }

        return list;
    }

    @Override
    public List<AppDto> toDto(List<App> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AppDto> list = new ArrayList<AppDto>( entityList.size() );
        for ( App app : entityList ) {
            list.add( toDto( app ) );
        }

        return list;
    }
}
