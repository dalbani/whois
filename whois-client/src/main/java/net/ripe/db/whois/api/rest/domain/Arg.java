package net.ripe.db.whois.api.rest.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

import javax.annotation.concurrent.Immutable;
import java.util.Objects;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

@Immutable
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "arg")
@JsonInclude(NON_EMPTY)
public class Arg {

    @XmlAttribute(name = "value")
    private String value;

    public Arg(final String value) {
        this.value = value;
    }

    public Arg() {
        // required no-arg constructor
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || (o.getClass() != getClass())) {
            return false;
        }

        return Objects.equals(value, ((Arg)o).getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
