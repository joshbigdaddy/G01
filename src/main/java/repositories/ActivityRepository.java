package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity,Integer>{
	@Query("select a from Activity a order by a.popularity")
	Collection<Activity> activitiesOrderedByPopularity();

}

