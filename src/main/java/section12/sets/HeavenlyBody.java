package section12.sets;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final Double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyType bodyType;

    public HeavenlyBody(String name, Double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public Double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public boolean addSatellite(HeavenlyBody moon) {

        if (moon.getBodyType() == BodyType.MOON) {
            return this.satellites.add(moon);
        } else {
            return false;
        }
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeavenlyBody) {

            HeavenlyBody thrObject = (HeavenlyBody) obj;
            if (this.name.equals(thrObject.getName())) {
                return this.bodyType == thrObject.getBodyType();
            }
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public final int hashCode() {
        System.out.println("hashcode called");
        System.out.println(this.name.hashCode() + 57);
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return "HeavenlyBody{" +
                "name='" + name + '\'' +
                ", orbitalPeriod=" + orbitalPeriod +
                ", satellites=" + satellites +
                ", bodyType=" + bodyType +
                '}';
    }

    public enum BodyType {
        STAR,
        MOON,
        COMET
    }

    public static final class Key{
        private String name;
        private BodyType bodyType;

        public Key(String name, BodyType bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object o) {
            Key key = (Key) o;
            if(this.name.equals(key.getName())){
                return (this.bodyType == key.getBodyType());
            }
            return false;
        }
        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (bodyType != null ? bodyType.hashCode() : 0);
            return result;
        }
    }
}
