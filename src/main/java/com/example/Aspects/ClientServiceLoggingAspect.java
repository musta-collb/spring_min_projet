package com.example.Aspects;
import com.example.Entities.Client;
import com.example.Services.ClientService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ClientServiceLoggingAspect {
    @Autowired
            private ClientService clientService;
    Logger logger = LoggerFactory.getLogger(ClientServiceLoggingAspect.class);
    //@Pointcut("execution(* com.example.Services.CooperativeServiceImp.recupererCooperatives())")
    //public void articleListPointcut(){ }

    @After("execution(* com.example.Services.CooperativeServiceImp.recupererCooperatives())")
    public void cooperatives(){
        logger.info("Selction de tous le cooperatives!");
    }
    @After("execution(public void com.example.Services.ClientServiceImp.ajouterClient(..))")
    public void creeClient(JoinPoint jointPoint){
        logger.info("un client a été créé!: " + ((Client)jointPoint.getArgs()[0]).getNom()+" "+ ((Client)jointPoint.getArgs()[0]).getPrenom()+" "+((Client)jointPoint.getArgs()[0]).getPassword());
    };

    @Before("execution(public void com.example.Services.ClientServiceImp.supprimerClient(..))")
    public void supprimmerClient(JoinPoint jointPoint){
        long Id = (long)jointPoint.getArgs()[0];
        Client client= clientService.recupererClientParId(Id);
        logger.warn("un client a été supprimé !: " + client.toString());
    };

    @AfterThrowing(value="execution(* com.example.Services.ClientServiceImp.*(..))",throwing = "ex")
    public void leverExceptionSupprission(Exception ex){
        logger.error(ex.getMessage());
    }

}
