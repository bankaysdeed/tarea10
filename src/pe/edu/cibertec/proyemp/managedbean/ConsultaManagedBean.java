package pe.edu.cibertec.proyemp.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pe.edu.cibertec.proyemp.model.Empleado;
import pe.edu.cibertec.proyemp.service.EmpleadoService;

@ManagedBean
@SessionScoped
public class ConsultaManagedBean {
	
	private Empleado empleado = new Empleado();
	
	List<Empleado> empleados = new ArrayList<Empleado>();
	
	@ManagedProperty(value="#{empleadoService}")
	private EmpleadoService empleadoService;
	
	public String buscar(){
		empleados = empleadoService.getEmpleadoRepository()
				.obtenerEmpleadosPorNombre(empleado.getNombre());
		
		return null;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public EmpleadoService getEmpleadoService() {
		return empleadoService;
	}

	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}
	
	
}
