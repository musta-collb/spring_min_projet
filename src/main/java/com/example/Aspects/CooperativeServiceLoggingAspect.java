package com.example.Aspects;

import com.example.Entities.Client;
import com.example.Entities.Cooperative;
import com.example.Services.CooperativeService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CooperativeServiceLoggingAspect {
    @Autowired
    private CooperativeService cooperativeService;

    Logger logger= LoggerFactory.getLogger(CooperativeServiceLoggingAspect.class);

    @After("execution(* com.example.Services.CooperativeServiceImp.ajouterCooperative(..))")
    public  void ajouterCooperative(JoinPoint joinPoint){
        Cooperative cooperative = (Cooperative) joinPoint.getArgs()[0];
        logger.info("une cooperative a été crée ["+ "nom:"+ cooperative.getNomCooperative()+" email:" + cooperative.getEmail()+"]");
    }

    @Before("execution(* com.example.Services.CooperativeServiceImp.supprimerCooperative(..))")
    public void supprimerCooperative(JoinPoint joinPoint){
        long id = (long) joinPoint.getArgs()[0];
        Cooperative cooperative = cooperativeService.recupererCooperative(id);
        logger.warn("une cooprative a été supprimer:"+ cooperative.toString());
    }
}
