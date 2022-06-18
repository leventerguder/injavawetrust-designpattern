package facade.email;

public class EmailBuilder {

    public EmailBuilder withTemplate(Template template) {
        return this;
    }

    public EmailBuilder withStationary(Stationary stationary) {
        return this;
    }

    public EmailBuilder forObject(Object object) {
        return this;
    }

    public Email build() {
        return null;
    }

    public Email getEmail() {
        return null;
    }
}
