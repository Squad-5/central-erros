package br.com.codenation.centralerros.repository;

import br.com.codenation.centralerros.entity.Log;
import br.com.codenation.centralerros.enums.LevelEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends JpaRepository<Log, Integer> {

    List<Log> findAllByLevel(LevelEnum Level);

}
