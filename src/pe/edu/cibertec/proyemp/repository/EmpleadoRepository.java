package pe.edu.cibertec.proyemp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.proyemp.model.Empleado;

@Repository
public interface EmpleadoRepository 
					extends CrudRepository<Empleado, Long>{
	
	@Query("select e from Empleado e where e.nombre like %:nom%")
	public List<Empleado> obtenerEmpleadosPorNombre(
			@Param("nom") String nombre);

}
