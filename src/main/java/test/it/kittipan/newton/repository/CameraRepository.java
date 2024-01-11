package test.it.kittipan.newton.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import test.it.kittipan.newton.model.Camera;

public interface CameraRepository extends CrudRepository<Camera, Integer> {
    List<Camera> findByIpAddress(String ip_address);
    List<Camera> findByLocationContaining(String location);
}
