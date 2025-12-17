API end points 

@RestController
public class EmplController {
    
	@Autowired
	EmpService empServ;
	
	@GetMapping("/getallemp")
	public List<Employee> getAllEmployees() {
		
		return empServ.getAllEmployees();
	}
	
	@GetMapping("/getemp")
	public Employee getEmployeeById(int id) {
		return empServ.getEmployeeById(id);
	}
	
	@PostMapping("/insertemp")
	public Employee insertEmployee(@RequestBody Employee e) {
		return empServ.insertEmployee(e);
	}
	
	@PutMapping("/updateemp/{id}")
	public Employee updateEmployeeById(@PathVariable int id, Employee e) {
		return empServ.updateEmployeeById(id, e);
	}
	
	@DeleteMapping("/deleteemp/{id}")
	public void deleteEmployeeById(@PathVariable int id) 
	{
		 empServ.deleteEmployeesById(id);
	}
}
