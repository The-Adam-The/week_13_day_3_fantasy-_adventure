package Classes.Casters;

import Familiars.Familiar;

public abstract class Caster {

    private Familiar familiar;

    public Caster(Familiar familiar) {
        this.familiar = familiar;
    }

    public Familiar getFamiliar() {
        return this.familiar;
    }

}
