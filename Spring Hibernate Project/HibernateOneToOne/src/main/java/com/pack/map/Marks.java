package com.pack.map;

import jakarta.persistence.*;

@Entity
@Table(name="Marks123")
public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="roll",length=5)
    private int roll;
    @Column(name="physics",length=5)
    private int physics;
    @Column(name="chemistry",length=5)
    private int chemistry;
    @Column(name="maths",length=5)
    private int maths;

    public int getPhysics() {
        return physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getRoll() {
        return roll;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
