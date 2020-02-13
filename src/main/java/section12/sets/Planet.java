package section12.sets;

public class Planet extends HeavenlyBody {

    public Planet(String name, Double orbitalPeriod ) {
        super(name, orbitalPeriod, BodyType.STAR);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getBodyType() == BodyType.MOON){
            super.addSatellite(moon);
            return true;
        }else {
            return  false;
        }
    }
}
