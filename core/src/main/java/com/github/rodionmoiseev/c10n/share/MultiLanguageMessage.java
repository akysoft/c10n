package com.github.rodionmoiseev.c10n.share;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class MultiLanguageMessage {

    /**
     * Message for all locales
     */
    private final Map<Locale, String> mapMessages = new HashMap<Locale, String>();

    public MultiLanguageMessage() {
        // default construktor
    }

    public MultiLanguageMessage(Map<Locale, String> mapMessages) {
        this.mapMessages.putAll(mapMessages);
    }

    public MultiLanguageMessage(MultiLanguageMessage multiLanguageMessage) {
        this(multiLanguageMessage.mapMessages);
    }

    public void addMessage(Locale locale, String message) {
        this.mapMessages.put(locale, message);
    }

    public Set<Locale> getLocales() {
        return mapMessages.keySet();
    }

    public String getMessage(Locale locale) {
        return mapMessages.get(locale);
    }

    @Override
    public String toString() {
        String result = "";
        Set<Locale> keys = mapMessages.keySet();
        for (Locale l : keys) {
            result += l.getLanguage() + " : " + mapMessages.get(l) + "\n";
        }

        return result;
    }

}
