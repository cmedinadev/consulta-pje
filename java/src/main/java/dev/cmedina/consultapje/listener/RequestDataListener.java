package dev.cmedina.consultapje.listener;

import dev.cmedina.consultapje.model.ConsultaComunicacao;

public interface RequestDataListener {
    void onDataLoaded(ConsultaComunicacao data);
    void onDataEnd();
 }

