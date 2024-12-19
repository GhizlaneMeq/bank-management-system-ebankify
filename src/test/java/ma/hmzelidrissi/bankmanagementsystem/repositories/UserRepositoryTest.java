package ma.hmzelidrissi.bankmanagementsystem.repositories;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;

import ma.hmzelidrissi.bankmanagementsystem.entities.User;
import ma.hmzelidrissi.bankmanagementsystem.enums.Role;
import org.springframework.data.domain.Pageable;

/**
 * Test class for ma.hmzelidrissi.bankmanagementsystem.repositories.UserRepository.
 *
 * @author hmzelidrissi
 * @version 1.0
 * @see UserRepository
 */

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserRepositoryTest extends AbstractTestcontainers {

}