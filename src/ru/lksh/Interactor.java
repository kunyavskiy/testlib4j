package ru.lksh;

import java.io.PrintWriter;

/**
 * The interface for all checkers.
 *
 * @author Maxim Buzdalov
 * @author Andrew Stankevich
 * @author Dmitry Paraschenko
 * @author Sergey Melnikov
 * @author Pavel Kunyavskiy
 */
public interface Interactor {
    /**
     * Runs the checker on the given input, output and answer streams.
     * Returns (or throws, at the discretion of the implementor) the outcome.
     *
     * @param inf the stream corresponding to the input file.
     * @param ouf the stream corresponding to the output file (the one the contestant has created).
     * @param ans the stream corresponding to the answer file (the one the jury hsa created).
     * @param outputForChecker stream for writing output for checker
     * @param outputForParticipant stream for writing output for participant
     * @return the outcome.
     * @throws Outcome the outcome.
     */
    Outcome interact(InStream inf, InStream ouf, InStream ans, PrintWriter outputForChecker, PrintWriter outputForParticipant);
}
