package net.sourceforge.vrapper.core.tests.cases;

import java.io.IOException;

import net.sourceforge.vrapper.core.tests.utils.SnapshotTestsExecutor;
import net.sourceforge.vrapper.core.tests.utils.VimTestCase;
import net.sourceforge.vrapper.vim.modes.NormalMode;

import org.junit.Test;

public class SnapshotTests extends VimTestCase {

    @Override
    public void setUp() {
        super.setUp();
        mode = new NormalMode(adaptor);
    }

    @Test public void testDelete() throws IOException {
        SnapshotTestsExecutor executor = new SnapshotTestsExecutor(this);
        executor.execute("text.txt", "Delete", null);
    }

    @Test public void testFind() throws IOException {
        SnapshotTestsExecutor executor = new SnapshotTestsExecutor(this);
        executor.execute("chars.txt", "Find", null);
    }

    @Test public void testRegisters() throws IOException {
        SnapshotTestsExecutor executor = new SnapshotTestsExecutor(this);
        executor.execute("text.txt", "Registers", "\"");
    }

}
