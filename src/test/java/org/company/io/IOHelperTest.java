package org.company.io;

import java.io.IOException;
import java.net.URISyntaxException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class IOHelperTest {

  private static final String MOWER_BUFFER_READER_TEST_TXT = "mower-buffer-reader-test.txt";

  @Test
  void createMowerBufferedReader() throws IOException, URISyntaxException {
    Assertions
        .assertThat(IOHelper
            .createMowerBufferedReader(TestUtil.getPathFromRessource(MOWER_BUFFER_READER_TEST_TXT)))
        .isInstanceOf(MowerBufferdReader.class);
  }
}