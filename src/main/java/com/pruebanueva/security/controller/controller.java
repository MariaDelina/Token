package com.pruebanueva.security.controller;


import com.pruebanueva.security.dto.AuthenticationRequest;
import com.pruebanueva.security.dto.AuthenticationResponse;
import com.pruebanueva.security.model.Estudio;
import com.pruebanueva.security.model.Persona;
import com.pruebanueva.security.model.Proyectos;
import com.pruebanueva.security.model.SobreMi;
import com.pruebanueva.security.service.EstudioService;
import com.pruebanueva.security.service.IPersonaService;
import com.pruebanueva.security.service.IProyectosService;
import com.pruebanueva.security.service.ISobreMiService;
import com.pruebanueva.security.service.SecurityUserDetailsService;
import com.pruebanueva.security.web.security.JWTUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    
    @PostMapping("/newpersona")
    public void agregarPersona(@RequestBody Persona pers){
            persoServ.crearPersona(pers);
    }
    
    @GetMapping("/verpersona")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/borrarpersona/{id}")
    public void borrarPersona(@PathVariable Long id_proyectos){
        persoServ.borrarPersona(id_proyectos);
    }
    
    @Autowired
    private IProyectosService proServ;
    
    @PostMapping("/newproyectos")
    public void agregarProyectos (@RequestBody Proyectos proy){
        proServ.crearProyectos(proy);
    }
    
    @GetMapping("/verproyectos")
    @ResponseBody
    public List<Proyectos> verProyectos(){
        return proServ.verProyectos();
    }
    
    @DeleteMapping("/borrarproyectos/{id}") 
    public void borrarProyectos(@PathVariable Long id_proyectos){
        proServ.borrarProyectos(id_proyectos);
    }
    
    @Autowired
    private ISobreMiService sobServ;
    
    @PostMapping("/newsobremi")
    public void agregarSobreMi (@RequestBody SobreMi sobr){
        sobServ.agregarSobreMi(sobr);
    }
    
   
    
    @DeleteMapping("/borrarsobremi/{id}")
    public void borrarSobreMi(@PathVariable Long id){
        sobServ.borrarSobreMi(id);
    }
    
    @Autowired
    public EstudioService estServ;
    
    @GetMapping("/verestudio")
    @ResponseBody
    public List<Estudio> verEstudio(){
        return estServ.verEstudio();
    }
    
    @PostMapping("/newestudio")
    public void agregarEstudio(@RequestBody Estudio estu) {
        estServ.agregarEstudio(estu);
    }
    
     @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private SecurityUserDetailsService securityUserDetailsService;
    @Autowired
    private JWTUtil jwtUtil;
    
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createToke(@RequestBody AuthenticationRequest request){
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
            UserDetails userDetails = securityUserDetailsService.loadUserByUsername(request.getUsername());
            String jwt = jwtUtil.generateToken(userDetails);
            
            return new ResponseEntity<>(new AuthenticationResponse(jwt), HttpStatus.OK);
        } catch (BadCredentialsException e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        
        
        
    }
}

