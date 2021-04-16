package co.icfes.dominio.audit;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect 
@Component
//@Slf4j
public class AuditAspect {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AuditAspect.class);


	@Around("execution(* co.icfes.dominio.controller.*.*(..))")
	public Object audit(ProceedingJoinPoint joinPoint) throws Throwable {
		long t1 = System.currentTimeMillis();
		//Object param1 = joinPoint.getArgs()[0];
        log.warn("esto eta ocurriendo");
		
		Object resultado = joinPoint.proceed();

		return resultado;
	}
	
	 @Before("execution(* consultaId())")
	  public void log() {
	    System.out.println("el metodo se ha invocado");
	  }

}
