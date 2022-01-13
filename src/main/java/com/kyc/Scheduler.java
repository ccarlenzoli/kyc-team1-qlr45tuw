package com.kyc;

import com.kyc.model.Anagrafica;
import com.kyc.model.AnagraficaProvider;
import com.kyc.model.HTTPClientInterface;
import com.kyc.repo.AnagraficaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Autowired
    private AnagraficaRepo anagraficaRepo;

    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        Iterable<Anagrafica> anagrafiche = anagraficaRepo.findAll();
        anagrafiche.forEach(anagrafica -> {
            AnagraficaProvider aP = HTTPClientInterface.getElement(anagrafica.getVat_number());
            //save to DB
            //check if it is regolare, else send to mail
        });
    }

}
