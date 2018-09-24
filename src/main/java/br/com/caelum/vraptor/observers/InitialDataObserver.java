package br.com.caelum.vraptor.observers;

import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.events.VRaptorInitialized;
import br.com.caelum.vraptor.util.JPAUtil;

public class InitialDataObserver {
	
	public void insert(@Observes VRaptorInitialized event) {
		
		EntityManager em = JPAUtil.criaEntityManager();
		em.close();
	}	

}
