package de.devsnx.perks.utils;

import de.devsnx.perks.Perks;

import java.util.logging.Level;

/**
 * @author DevSnx
 * @since 21.07.2023
 */

public class Error {
    public static void execute(Perks plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Couldn't execute MySQL statement: ", ex);
    }
    public static void close(Perks plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Failed to close MySQL connection: ", ex);
    }
}

