package com.tfg.bookmanagerammdb.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

import com.tfg.bookmanagerammdb.domain.enumeration.Distribution;

/**
 * A Publisher.
 */
@Document(collection = "publisher")
public class Publisher implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;

    @NotNull
    @Field("name")
    private String name;

    @Field("distribution")
    private Distribution distribution;

    @Field("localization")
    private String localization;

    @DBRef
    @Field("book")
    private Set<Book> books = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Publisher name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Distribution getDistribution() {
        return distribution;
    }

    public Publisher distribution(Distribution distribution) {
        this.distribution = distribution;
        return this;
    }

    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    public String getLocalization() {
        return localization;
    }

    public Publisher localization(String localization) {
        this.localization = localization;
        return this;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Publisher books(Set<Book> books) {
        this.books = books;
        return this;
    }

    public Publisher addBook(Book book) {
        this.books.add(book);
        book.setPublisher(this);
        return this;
    }

    public Publisher removeBook(Book book) {
        this.books.remove(book);
        book.setPublisher(null);
        return this;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Publisher publisher = (Publisher) o;
        if (publisher.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), publisher.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Publisher{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", distribution='" + getDistribution() + "'" +
            ", localization='" + getLocalization() + "'" +
            "}";
    }
}
