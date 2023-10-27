package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class UserService {
	
	
	//Constante para el Autowired
	private final UserRepository userRepository;

	@Autowired
	
	//Inyeccion de dependencias
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}//constructor
	
	


	//Metodo para obtener todos los usuarios
	public List<User> leerUsuarios() {
		return userRepository.findAll();
	}//getUsers

	
	//Metodo para obtener un usuario por id
	public User leerUsuario(Long userId) {
		return userRepository.findById(userId).orElseThrow(
			()-> new IllegalStateException("El usuario con el id " + userId + " no existe")
			);
	}// getUser

	
	//Metodo para borrar un usuario por id
	public void borrarUsuario(Long userId) {
		if(userRepository.existsById(userId)) {
			userRepository.deleteById(userId);
		} else {
			throw new IllegalStateException("El usuario con el id " + userId + " no existe");
		} //else 
	} // deleteUser




	public void actualizarUsuario(Long userId, String currentPassword, String newPassword) {
		// TODO Auto-generated method stub
		
	}




	public void agregarUsuario(User user) {
		// TODO Auto-generated method stub
		
	}



	
//	//Metodo para crear un usuario
//	public void agregarUsuario(User user) {
//		Optional<User> userByName = userRepository.findByUsername(user.getUsername());
//		if (userByName.isPresent()) {
//			throw new IllegalStateException("El usuario con el nombre " + user.getUsername() 
//		+ " ya existe, puedes intentar con otro usuario"); 
//		}// if
//		user.setPassword((user.getPassword()) );	
//		userRepository.save(user);	
//	}// addUser

	
	

	
	
	
	
}