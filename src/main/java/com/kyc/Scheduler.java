package com.kyc;

import com.kyc.model.Anagrafica;
import com.kyc.repo.AnagraficaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
class Scheduler {

    @Autowired
    private AnagraficaRepo anagraficaRepo;

    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        Iterable<Anagrafica> anagrafiche = anagraficaRepo.findAll();
        anagrafiche.forEach(anagrafica -> {
            System.out.println(anagrafica.getVat_number());
        });
    }

}
