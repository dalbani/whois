package net.ripe.db.whois.update.database;


import net.ripe.db.whois.update.dao.AbstractUpdateDaoIntegrationTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@Tag("IntegrationTest")
public class TransactionTestIntegration extends AbstractUpdateDaoIntegrationTest {
    @Autowired @Qualifier("sourceAwareDataSource") DataSource dataSource;

    @Test
    public void isolation_level_is_read_committed_so_that_global_locks_work_as_expected() throws Exception {
        assertThat(new JdbcTemplate(dataSource).queryForObject("select @@tx_isolation", String.class), is("READ-COMMITTED"));
    }
}
