package org.company.io;


import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import org.company.dto.PositionCommandsLine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MowerBufferdReaderTest {

  private static final String MOWER_BUFFER_READER_TEST_TXT = "mower-buffer-reader-test.txt";

  private MowerBufferdReader mowerBufferedReader;

    @BeforeEach
    void setUp() throws URISyntaxException, IOException {
      Path path = TestUtil.getPathFromRessource(MOWER_BUFFER_READER_TEST_TXT);
      mowerBufferedReader = IOHelper.createMowerBufferedReader(path);
    }

  @Test
  void should_return_valid_position_commands_line_object_when_calling_read_lines() {

    Stream<PositionCommandsLine> positionCommandsLineStream = mowerBufferedReader.readLines();

    assertThat(positionCommandsLineStream).isNotNull();
    assertThat(positionCommandsLineStream)
        .containsExactly(new PositionCommandsLine("1 2 N", "AADA"));
  }
}