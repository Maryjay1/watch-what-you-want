package io.apiapp.springbootstarter.tvprogramme;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TvProgrammeController {
    @RequestMapping("/tvprogrammes")
    public List<TVProgramme> getAllTVShows() {
        return Arrays.asList(
                new TVProgramme("12345", "Lord of the Rings", "....", "Channel4", "2020-12-16T11:29:02.716Z", "2020-12-16T11:29:02.716Z"),
                new TVProgramme("6789", "Silicon Valley", "....", "Channel4", "2020-12-16T11:29:02.716Z", "2020-12-16T11:29:02.716Z"),
                new TVProgramme("9879", "Black Mirror", "....", "Channel4", "2020-12-16T11:29:02.716Z", "2020-12-16T11:29:02.716Z")


        );

    }

}
