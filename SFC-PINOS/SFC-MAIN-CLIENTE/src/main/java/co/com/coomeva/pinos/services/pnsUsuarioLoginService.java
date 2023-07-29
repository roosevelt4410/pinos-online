//package co.com.coomeva.pinosEnLinea.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import co.com.coomeva.pinosEnLinea.repository.PnsUsuarioLoginRepository;
//
//public class pnsUsuarioLoginService implements UserDetailsService{
//
//	@Autowired
//	private PnsUsuarioLoginRepository repositoryUsuario;
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		repositoryUsuario.findByUsuarioIngreso(username);
//		
//		
//	}
//}
