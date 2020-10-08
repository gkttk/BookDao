package com.github.gkttk.sixth.bookdao.view.factory;

import com.github.gkttk.sixth.bookdao.view.ConsoleResultPrinter;
import com.github.gkttk.sixth.bookdao.view.ResultPrinter;

/**
 * Factory for ConsoleResultPrinter.
 */
public class ConsoleResultPrinterFactory implements ResultPrinterFactory {
    @Override
    public ResultPrinter createResultPrinter() {
        return new ConsoleResultPrinter();
    }
}
