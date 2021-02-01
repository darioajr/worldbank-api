package br.com.bb.worldbank.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.bb.worldbank.model.Indicator;

import javax.ws.rs.Consumes;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/v1/indicator")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IndicatorResource {

    private Set<Indicator> indicators = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public IndicatorResource() {
        indicators.add(new Indicator(
                new AbstractMap.SimpleImmutableEntry<>("SI.POV.DDAY",
                        "Poverty headcount ratio at $1.90 a day (2011 PPP) (% of population)"),
                new AbstractMap.SimpleImmutableEntry<>("BR", "Brazil"), "BRA", "2020", null, "", "", 1));
    }

    @GET
    public Set<Indicator> list() {
        return indicators;
    }

}
