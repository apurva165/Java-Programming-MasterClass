package section12.sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Main {
    private static Map<String , HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury" ,88.0 );
        solarSystem.put(temp.getName() , temp);
        planets.add(temp);

        temp = new Planet("Earth" ,365.0 );
        solarSystem.put(temp.getName() , temp);
        planets.add(temp);


        HeavenlyBody moon = new Moon("moon", 27.0);
        solarSystem.put(moon.getName(), moon);
        temp.addSatellite(moon);

        System.out.println("Planets");
        for (HeavenlyBody heavenlyBody : planets){
            System.out.println(heavenlyBody.getName());
        }

        HeavenlyBody body = solarSystem.get("Earth");
        System.out.println(body.getName());

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets){
            moons.addAll(planet.getSatellites());
        }
        for(HeavenlyBody moon1 : moons){
            System.out.println(moon1.getName());
        }

        HeavenlyBody pluto = new Planet("pluto", 888.0);
        planets.add(pluto);

        Object o = new Object();
        o.equals("pluto".equals(""));

    }
}
