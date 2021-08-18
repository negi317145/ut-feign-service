//package com.feign.config;
//
//import  com.feign.helper.JwtUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
////import com.web.config.CustomUserDetails;
//
//@Component
//public class JwtAuthenticationFilter  extends OncePerRequestFilter {
//
//    private com.web.config.impl.UserDetailsService userDetailsService;
//
//    @Autowired
//    public void setUserDetailsService(com.web.config.impl.UserDetailsService userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    private JwtUtil jwtUtil;
//
//    @Autowired
//    public void setJwtUtil(JwtUtil jwtUtil) {
//        this.jwtUtil = jwtUtil;
//    }
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//
//        //getting jwt
//        //bearer
//        //validate
//
//        String requestTokenHeader= request.getHeader("Authorization");
//        String username=null;
//        String jwtToken=null;
//
//        //null and format
//        if(requestTokenHeader !=null && requestTokenHeader.startsWith("Bearer ")){
//
//            jwtToken=requestTokenHeader.substring(7);
//
//            try{
//                username=jwtUtil.extractUsername(jwtToken);
//            }
//
//            catch (Exception e){
//                e.printStackTrace();
//            }
//
//            UserDetails userDetails=userDetailsService.loadUserByUsername(username);
//
//            if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null)
//            {
//                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=new UsernamePasswordAuthenticationToken();
//
//                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//
//                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//
//            }
//            else{
//                System.out.println("Token is not validate");
//            }
//            filterChain.doFilter(request,response);
//        }
//
//    }
//}
