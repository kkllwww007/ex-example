package com.test;

import com.test.utils.IdUtils;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by wxk on 2017-08-06.
 */
public class IdUtilsTest {
    @Test
    public void testGeneratorUUID() {
        String uuid = IdUtils.genernalId();
        assertThat(uuid).isNotBlank();
    }

    @Test(expected = Exception.class)
    public void testInitIdUtils() throws IllegalAccessException, InstantiationException {
        Class<IdUtils> cls = IdUtils.class;
        IdUtils p = cls.newInstance();
    }
}
