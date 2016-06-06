package xyz.skycat.mvn.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xyz.skycat.mvn.springboot.MyData;

@Repository
public interface MyDataRepository extends JpaRepository<MyData, Long> {

//	public MyData findById(Long id);

}
