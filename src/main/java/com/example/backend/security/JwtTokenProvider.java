package com.example.backend.security;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenProvider {

    @Value("${backend.app.secret}")
    private String APP_SECRET;

    @Value("${backend.app.expires_in}")
    private Long EXPIRES_IN;

    public String generateJwtToken(Authentication authentication)
    {
        JwtUserDetail jwtUserDetail = (JwtUserDetail) authentication.getPrincipal();
        Date expireDate = new Date(new Date().getTime() + EXPIRES_IN);
        System.out.println(expireDate);
        return Jwts.builder().setSubject(Long.toString(jwtUserDetail.getId()))
                .setIssuedAt(new Date()).setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512, APP_SECRET).compact();
    }

    Long getUserIdFromJwt(String token)
    {
        Claims claims= Jwts.parser().setSigningKey(APP_SECRET).parseClaimsJws(token).getBody();
        return Long.parseLong(claims.getSubject());
    }

    boolean validateToken(String token)
    {
        try {
            Jwts.parser().setSigningKey(APP_SECRET).parseClaimsJws(token);
            return ! isTokenExpired(token);
        }
        catch (SignatureException e)
        {
            return false;
        }

        catch (MalformedJwtException e)
        {
            return false;
        }
        catch (ExpiredJwtException e)
        {
            return false;
        }
        catch (UnsupportedJwtException e)
        {
            return false;
        }
        catch (IllegalArgumentException e)
        {
            return false;
        }
    }

    private boolean isTokenExpired(String token) {
        Date expiration = Jwts.parser().setSigningKey(APP_SECRET).parseClaimsJws(token).getBody().getExpiration();
        return expiration.before(new Date());
    }
}
