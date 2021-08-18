//package com.feign.controller;
//
//import com.feign.helper.JwtUtil;
//import com.feign.model.JwtRequest;
//import com.feign.model.JwtResponse;
//import feign.Response;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@CrossOrigin(origins="*")
//public class JwtController {
//
//    private com.web.config.impl.UserDetailsService userDetailsService;
//
//    @Autowired
//    public void setUserDetailsService(com.web.config.impl.UserDetailsService userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }
//
//    private JwtUtil jwtUtil;
//
//    @Autowired
//    public void setJwtUtil(JwtUtil jwtUtil) {
//        this.jwtUtil = jwtUtil;
//    }
//
//
//    @PostMapping("/token")
//    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception{
//
//
//        try{
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));
//        }
//
//        catch(UsernameNotFoundException e){
//            e.printStackTrace();
//
//            throw new Exception("username not found credentials");
//        }
//
//        //user details for token generation
//        UserDetails userDetails=userDetailsService.loadUserByUsername(jwtRequest.getUsername(),jwtRequest.getPassword());
//
//        String token=jwtUtil.generateToken(userDetails);
//
//        return ResponseEntity.ok(new JwtResponse(token));
//
//    }
//
//}
