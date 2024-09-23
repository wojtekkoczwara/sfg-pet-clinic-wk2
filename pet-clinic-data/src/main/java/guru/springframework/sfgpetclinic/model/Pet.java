package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet  extends BaseEntity{

    private String name;
    private LocalDate birthDate;
    private Owner Owner;
    private PetType petType;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public guru.springframework.sfgpetclinic.model.Owner getOwner() {
        return Owner;
    }

    public void setOwner(guru.springframework.sfgpetclinic.model.Owner owner) {
        Owner = owner;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
